package com.ms.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsEmailApplication {

	public static void main(String[] args) {

		try {
			SpringApplication app = new SpringApplication(MsEmailApplication.class);
			app.run(args);
		} catch(Throwable ex) {
			ex.printStackTrace();
		}
	}

}
