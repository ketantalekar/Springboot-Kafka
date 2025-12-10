package com.springproducer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {
//
//    @Bean
//    public NewTopic createNewTopic(){
//        return  new NewTopic("my-new-topic",3,(short) 1);
//    }

    @Bean
    public NewTopic createNewTopicRiderLocation(){
        return  new NewTopic("my-location",3,(short) 1);
    }
}
