package com.aps;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.aps.**.mapper**")
public class OptaApsApplication {

    public static void main(String[] args) {
        SpringApplication.run(OptaApsApplication.class, args);
    }

}
