package com.federicocalodevbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FedericocalodevBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FedericocalodevBeApplication.class, args);
	}

}
