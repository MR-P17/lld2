package com.interview.lld.KafkaTypeMessagingSystem;

public class QueueDelivery implements DeliveryMechanism{
    @Override
    public boolean send(Message message, TargetService targetService) {
        //Logic
        try{
            return true;
        }catch (Exception e){

            return false;
        }
    }
}
