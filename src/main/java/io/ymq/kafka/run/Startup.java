package io.ymq.kafka.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 描述:启动服务
 *
 * @author yanpenglei
 * @create 2017-10-16 18:51
 **/
@SpringBootApplication
@EnableScheduling
@ComponentScan(value = {"io.ymq.kafka"})
public class Startup {
    public static void main(String[] args) {
        SpringApplication.run(Startup.class, args);
    }
}
