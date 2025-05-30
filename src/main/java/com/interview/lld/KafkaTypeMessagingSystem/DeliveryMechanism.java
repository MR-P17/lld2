package com.interview.lld.KafkaTypeMessagingSystem;

public interface DeliveryMechanism {
    boolean send(Message message, TargetService targetService);
}
