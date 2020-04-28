package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaListener {

    @Autowired
    ProductRepository productRepository;

    @StreamListener(Processor.INPUT) //바라보는 토픽에 메시지가 있으면 알려줘
    public void onEventByString(@Payload OrderChanged orderChanged){
        if( orderChanged.getEventType().equals("OrderChanged")){
            System.out.println("======================");
            System.out.println("재고량 수정 - 기존데이터가 없으니 현재는 그냥 저장로직만 수행");
            Product p = new Product();
            p.setName(orderChanged.getProductName());
            p.setStock(orderChanged.getQty());
            productRepository.save(p); // JPA 에서 저장하는 메소드
            System.out.println("======================");
        }
    }

}
