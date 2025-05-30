package com.interview.lld.KafkaTypeMessagingSystem;

import com.interview.lld.KafkaTypeMessagingSystem.enums.DeliveryMechanismType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class TargetService {
    private UUID id;
    private String name;
    private String endpointUrl;
    private DeliveryMechanismType deliveryMechanismType;
    private boolean isActive;
}
