package com.interview.lld.upiTransaction;

public class MobileNotificationService implements NotificationService{
    @Override
    public boolean sendNotificationToSender(UpiTransaction transaction, UserAccount userAccount) {
        return false;
    }

    @Override
    public boolean sendNotificationToReceiver(UpiTransaction transaction, UserAccount userAccount) {
        return false;
    }
}
