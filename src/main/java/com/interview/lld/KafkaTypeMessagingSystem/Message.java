package com.interview.lld.KafkaTypeMessagingSystem;

import com.interview.lld.KafkaTypeMessagingSystem.enums.MessageStatus;
import com.interview.lld.KafkaTypeMessagingSystem.enums.MessageType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
public class Message {
    private UUID uuid;
    private long timeStamp;
    private String payload;
    private MessageType messageType;
    private MessageStatus messageStatus;
    private Integer retryCount;
    private List<String> targetServiceId;
}
