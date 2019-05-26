package com.fushan2provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
// 使用 dubbo.xml 配置
@ImportResource(value = {"classpath:dubbo.xml"})
public class Fushan2ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Fushan2ProviderApplication.class, args);
    }

}
