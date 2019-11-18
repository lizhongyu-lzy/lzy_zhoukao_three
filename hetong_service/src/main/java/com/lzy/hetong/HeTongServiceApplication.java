package com.lzy.hetong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HeTongServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(HeTongServiceApplication.class,args);
    }
}
