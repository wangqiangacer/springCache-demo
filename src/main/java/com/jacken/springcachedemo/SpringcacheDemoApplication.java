package com.jacken.springcachedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching//开启缓存
public class SpringcacheDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcacheDemoApplication.class, args);
    }

}
