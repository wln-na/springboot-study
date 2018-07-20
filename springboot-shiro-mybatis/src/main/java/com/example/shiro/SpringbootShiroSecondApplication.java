package com.example.shiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootShiroSecondApplication {

	/**
	 * <p>
	 * 测试 RUN
	 * <br>
	 * 1、http://localhost:8080
	 * 2、http://localhost:8080/user/test1<br>
	 * </p>
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootShiroSecondApplication.class, args);
	}
}
