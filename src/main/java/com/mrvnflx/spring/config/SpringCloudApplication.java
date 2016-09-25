package com.mrvnflx.spring.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by mrvnf on 9/23/2016.
 */
@EnableConfigServer
@SpringBootApplication
public class SpringCloudApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringCloudApplication.class, args);
    }
}
