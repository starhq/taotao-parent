package com.taotao;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TaotaoMangagerWebApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(TaotaoManagerServiceApplication.class, TaotaoMangerMapperApplication.class).run(args);
    }
}
