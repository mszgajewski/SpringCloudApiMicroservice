package com.mszgajewski.springgatewaysecurity;

import com.mszgajewski.springgatewaysecurity.config.RedisHashComponent;
import com.mszgajewski.springgatewaysecurity.dto.ApiKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringGatewaySecurityApplication {

	@Autowired
	private RedisHashComponent redisHashComponent;

	@PostConstruct
	public void initKeysToRedis(){
		List<ApiKey> apiKeys = new ArrayList<>();
		apiKeys.add(new ApiKey())
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringGatewaySecurityApplication.class, args);
	}

}
