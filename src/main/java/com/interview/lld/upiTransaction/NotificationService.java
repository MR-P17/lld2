package com.interview.lld.upiTransaction;

public interface NotificationService {
    boolean sendNotificationToSender(UpiTransaction transaction, UserAccount userAccount);
    boolean sendNotificationToReceiver(UpiTransaction transaction, UserAccount userAccount);
}
