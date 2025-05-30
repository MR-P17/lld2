package com.interview.lld.KafkaTypeMessagingSystem;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Getter
@Setter
@Builder
public class TargetRegistryService {
    private Map<String, TargetService> serviceMap = new ConcurrentHashMap<>();

    public void addTargetService(TargetService targetService){
        serviceMap.put(targetService.getName(), targetService);
    }

    public TargetService getById(String serviceId){

        return  null;
    }
    public TargetService updateService(TargetService targetService){
        return null;
    }
}
