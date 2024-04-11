package com.raon.pilot.kafka_consumer1.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "spring.kafka.consumer")
public class KafkaConsumerProperty {
    String bootstrapServers;
    String groupId;
    String autoOffsetReset;
}
