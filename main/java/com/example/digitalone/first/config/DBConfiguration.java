package com.example.digitalone.first.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
@NoArgsConstructor
public class DBConfiguration{

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String testDBConnectDev(){
        System.out.println("DB Connection for DEV - H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection for DEV - H2 - Test Instance";
    }

    @Profile("prod")
    @Bean
    public String testDBConnectProd(){
        System.out.println("DB Connection for PRODUÇÃO - MYSQL");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection for PRODUÇÃO - MYSQL - Test Instance";
    }


}