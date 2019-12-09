package kz.iitu.jd3.accessoryinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccessoryInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessoryInfoApplication.class, args);
	}

}
