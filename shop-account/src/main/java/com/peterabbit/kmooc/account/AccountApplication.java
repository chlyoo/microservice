package com.peterabbit.kmooc.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;

@Import(SpringDataRestConfiguration.class)
@SpringBootApplication
@EnableJpaAuditing
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

}
