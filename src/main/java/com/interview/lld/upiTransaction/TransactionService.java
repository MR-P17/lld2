package com.interview.lld.upiTransaction;

import com.interview.lld.upiTransaction.enums.NotificationType;
import com.interview.lld.upiTransaction.enums.TransactionInitiationType;
import com.interview.lld.upiTransaction.enums.TransactionStatus;
import lombok.Data;

import java.util.UUID;

@Data
public class TransactionService {
    private UserAccountRepository accountRepository;
    private TransactionRepository transactionRepository;
    private LockManager lockManager;
    private NotificationServiceFactory notificationServiceFactory;


    public boolean processTransaction(String senderUpiId, String password, String receiver, Double amount, TransactionInitiationType transactionInitiationType){
        String receiverUpiId = resolveReceiverUpiId(receiver, transactionInitiationType);
        UserAccount senderAccount = accountRepository.findByUpiId(senderUpiId);
        UserAccount receiverAccount = accountRepository.findByUpiId(receiverUpiId);

        if(senderAccount == null || receiverAccount == null) return false;
        if(!senderAccount.getPassword().equals(password)){
            System.out.println("Authentication failed for "+ senderUpiId);
            return false;
        }
        UpiTransaction transaction = new UpiTransaction(UUID.randomUUID(), senderUpiId, receiverUpiId, amount);
        transaction.setTransactionStatus(TransactionStatus.INITIATED);
        NotificationService notificationService = NotificationServiceFactory.getNotificationServiceByType(NotificationType.EMAIL);

        try{
            lockManager.lock(senderUpiId, receiverUpiId);
            if(senderAccount.getAmount() < amount){
                transaction.setTransactionStatus(TransactionStatus.FAILED);
                transactionRepository.save(transaction);
                return false;
            }

            senderAccount.setAmount(senderAccount.getAmount() - amount);
            receiverAccount.setAmount(receiverAccount.getAmount() + amount);

            transaction.setTransactionStatus(TransactionStatus.SUCCESS);
            transactionRepository.save(transaction);
            return true;

        }catch (Exception e){
            transaction.setTransactionStatus(TransactionStatus.FAILED);
            System.out.println("Exception :: "+ e.getMessage());
            return false;
        }finally {
            lockManager.unlock(senderUpiId, receiverUpiId);
            notificationService.sendNotificationToSender(transaction, senderAccount);
            notificationService.sendNotificationToReceiver(transaction, receiverAccount);
        }
    }

    public String resolveReceiverUpiId(String receiver, TransactionInitiationType transactionInitiationType){
        return switch (transactionInitiationType) {
            case QR_CODE -> decodeQRCode(receiver);
            case UPI_ID -> receiver;
            case MOBILE_NUMBER -> accountRepository.findByMobileNo(receiver).getMobileNo();
        };
    }

    public String decodeQRCode(String receiver){
        //Logic
        return "";
    }
}
