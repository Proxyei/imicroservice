package com.xywei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 表示是eureka的注册中心，接受其他客户的注册
public class EurekaServerApp7002 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApp7002.class, args);
	}

}
