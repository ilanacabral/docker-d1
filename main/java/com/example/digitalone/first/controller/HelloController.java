package com.example.digitalone.first.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{

    @Value("${app.message}")
    private String mensagem;

    @Value("${USER:NENHUM}")
    private String user;


    @GetMapping("/")
    public String hello(){
       return "Hello,Digital Inovation One!";
    }

    @GetMapping("/helloMessage")
    public String helloMessage(){
       return mensagem;
    }

    @GetMapping("/user")
    public String user(){
       return user;
    }



}