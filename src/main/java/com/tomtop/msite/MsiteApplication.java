package com.tomtop.msite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(DynamicDataSourceRegister.class)
public class MsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsiteApplication.class, args);
	}
}
