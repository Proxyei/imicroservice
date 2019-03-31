package com.xywei.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 扫描配置bean类，相当于spring的application.xml
 * 
 * @author nuller
 *
 */
@Configuration
public class ConsumerConfig {

	@Bean
	public RestTemplate restTemplate() {

		return new RestTemplate();
	}
}
