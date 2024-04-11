package com.raon.pilot.kafka_consumer1.dto;

import lombok.Builder;

import java.util.Date;

@Builder
public record KafkaPublishMessage(
        String name,
        Date birthDate,
        Integer age,
        String message
){
}
