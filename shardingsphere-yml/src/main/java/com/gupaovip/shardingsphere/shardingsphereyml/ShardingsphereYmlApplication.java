package com.gupaovip.shardingsphere.shardingsphereyml;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.gupaovip.shardingsphere.shardingsphereyml.mapper"})
public class ShardingsphereYmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingsphereYmlApplication.class, args);
    }

}