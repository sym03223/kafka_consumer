package com.raon.pilot.kafka_consumer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class KafkaConsumer1Application {

    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumer1Application.class, args);
    }

}
