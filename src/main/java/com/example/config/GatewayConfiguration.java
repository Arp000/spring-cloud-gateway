package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Configuration
@ConfigurationProperties("spring-cloud-gateway")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GatewayConfiguration {
	private String value;
}
