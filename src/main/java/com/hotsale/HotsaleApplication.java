package com.hotsale;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.hotsale.*.dao")
public class HotsaleApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(HotsaleApplication.class, args);
	}
}


