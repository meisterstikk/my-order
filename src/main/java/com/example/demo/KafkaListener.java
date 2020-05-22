package com.example.demo;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaListener {
    @StreamListener(Processor.INPUT)
    public void onEventByString(@Payload String event){
        System.out.println("====== Start event receive. ================");
        System.out.println(event);
        System.out.println("====== End event receive. ================");
    }
}
