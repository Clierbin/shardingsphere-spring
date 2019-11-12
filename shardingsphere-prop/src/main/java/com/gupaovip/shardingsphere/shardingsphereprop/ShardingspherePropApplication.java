package com.gupaovip.shardingsphere.shardingsphereprop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages ={"com.gupaovip.shardingsphere.shardingsphereprop.mapper"})
public class ShardingspherePropApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingspherePropApplication.class, args);
    }

}
