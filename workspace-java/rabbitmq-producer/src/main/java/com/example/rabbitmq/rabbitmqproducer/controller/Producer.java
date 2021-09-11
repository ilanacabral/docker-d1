package com.example.rabbitmq.rabbitmqproducer.controller;

import com.example.rabbitmq.rabbitmqproducer.model.Message;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producer{

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired DirectExchange directExchange;


    @PostMapping("/post")
    public String send(@RequestBody Message message){

        rabbitTemplate.convertAndSend(directExchange.getName(), "routing.A", message);
        return "Message send successfully!";

    }

}