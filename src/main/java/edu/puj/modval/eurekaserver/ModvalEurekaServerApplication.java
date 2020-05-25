package edu.puj.modval.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class ModvalEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModvalEurekaServerApplication.class, args);
	}

}
