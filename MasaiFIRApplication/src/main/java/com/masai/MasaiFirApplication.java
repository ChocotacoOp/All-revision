package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@springfox.documentation.swagger2.annotations.EnableSwagger2
public class MasaiFirApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasaiFirApplication.class, args);
	}

}
