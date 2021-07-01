package com.cloud.waletdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
public class WaletdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaletdemoApplication.class, args);
	}

	@GetMapping("/test")
	public String getTestText(){
		return "Hello Demo";
	}
}
