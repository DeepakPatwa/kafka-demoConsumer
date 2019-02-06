package com.techprimers.kafka.springbootkafkaconsumerexample.listener;

import com.techprimers.kafka.springbootkafkaconsumerexample.model.User;
import com.techprimers.kafka.springbootkafkaconsumerexample.model.User1;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "deepak", group = "group_id")
    public void consume(String message) {
        System.out.println("String wala method");
        System.out.println("Consumed message1: " + message);
    }


//    @KafkaListener(topics = "Kafka_Example_json", group = "group_json",
//            containerFactory = "userKafkaListenerFactory")
    @KafkaListener(topics = "deepak", group = "group_json",
            containerFactory = "kafkaListenerContainerFactory")
    public void consumeJson(User1 user) {
        System.out.println("yoyoyoyoyo");
        System.out.println("Consumed JSON Message: " + user);
    }
}
