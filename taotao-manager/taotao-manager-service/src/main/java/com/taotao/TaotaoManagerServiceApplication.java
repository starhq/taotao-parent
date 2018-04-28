package com.taotao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class TaotaoManagerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaotaoManagerServiceApplication.class, args);
    }
}
