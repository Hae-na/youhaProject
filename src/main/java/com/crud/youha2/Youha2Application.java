package com.crud.youha2;

import com.crud.youha2.config.MyBatisConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Import(MyBatisConfig.class)
@ComponentScan(basePackages = {"com.crud.youha2.web"})
@SpringBootApplication
public class Youha2Application {

	public static void main(String[] args) {
		SpringApplication.run(Youha2Application.class, args);
	}

}
