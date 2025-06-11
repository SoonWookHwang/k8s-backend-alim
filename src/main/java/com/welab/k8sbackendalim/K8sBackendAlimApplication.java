package com.welab.k8sbackendalim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class K8sBackendAlimApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sBackendAlimApplication.class, args);
    }

}
