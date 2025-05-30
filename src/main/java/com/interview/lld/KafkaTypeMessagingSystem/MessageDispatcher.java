package com.interview.lld.KafkaTypeMessagingSystem;

import com.interview.lld.KafkaTypeMessagingSystem.enums.MessageStatus;
import lombok.Data;

import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

@Data
public class MessageDispatcher {
    private MessageQueueManager messageQueueManager;
    private TargetRegistryService targetRegistryService;
    private DeliveryMechanismFactory deliveryMechanismFactory;
    private ExecutorService executorService = Executors.newFixedThreadPool(10);

    public void dispatchMessages(){
        for(Map.Entry<String, BlockingQueue<Message>> pair : messageQueueManager.getMessageQueue().entrySet()){
            TargetService targetService = targetRegistryService.getById(pair.getKey());
            DeliveryMechanism deliveryMechanism = DeliveryMechanismFactory.getDeliveryMechanismByType(targetService.getDeliveryMechanismType());
            while(!pair.getValue().isEmpty()){
                Message message = pair.getValue().poll();
                executorService.submit(() -> {
                    try {
                        deliverMessage(message, targetService, deliveryMechanism);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
        }
    }

    private void deliverMessage(Message message, TargetService targetService, DeliveryMechanism deliveryMechanism) throws InterruptedException {
        boolean success = deliveryMechanism.send(message, targetService);
        if(success){
            message.setMessageStatus(MessageStatus.DELIVERED);
        }else{
            message.setRetryCount(message.getRetryCount()+1);
            message.setMessageStatus(MessageStatus.RETRYING);
            messageQueueManager.getMessageQueue().computeIfAbsent(targetService.getName(), e-> new LinkedBlockingQueue<>()).put(message);
        }
    }
}
