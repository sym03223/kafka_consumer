package com.raon.pilot.kafka_consumer1.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.raon.pilot.kafka_consumer1.dto.KafkaPublishMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConsumerService {
    private final ObjectMapper objectMapper;
    @KafkaListener(topics = "my-topic", groupId = "consumer_group01")
    public void listener1(String data){
        System.out.printf("Consumed Message : %s%n", data);
    }

    @KafkaListener(topics = "my-topic2", groupId = "group_1")
    public void listener2(String data) {
        System.out.printf("Consumed Message : %s%n", data);
    }
}
