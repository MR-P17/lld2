package com.interview.lld.KafkaTypeMessagingSystem;

import lombok.Data;

import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

@Data
public class MessageQueueManager {
    private Map<String, BlockingQueue<Message>> messageQueue = new ConcurrentHashMap<>();

    public void enqueueMessage(Message message){
        for(String targetServiceId : message.getTargetServiceId()){
            messageQueue.computeIfAbsent(targetServiceId, e -> new LinkedBlockingQueue<>()).add(message);
        }
    }

    public Message dequeueMessage(String targetServiceId){
        BlockingQueue<Message> queue = messageQueue.get(targetServiceId);
        return queue != null ? queue.poll() : null;
    }
}
