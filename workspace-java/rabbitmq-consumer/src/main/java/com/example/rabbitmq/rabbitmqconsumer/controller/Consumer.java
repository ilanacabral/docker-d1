package com.example.rabbitmq.rabbitmqconsumer.controller;

import com.example.rabbitmq.rabbitmqconsumer.model.Message;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Consumer {

    @RabbitListener(queues = "queue.A")
    private void receive1(Message message){

        log.info("Message received Queue.A -> {}", message);

    }

    @RabbitListener(queues = "queue.B")
    private void receive(Message message){

        log.info("Message received Queue.B -> {}", message);

    }

    
}
