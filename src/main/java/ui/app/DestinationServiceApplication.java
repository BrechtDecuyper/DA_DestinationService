package ui.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import domain.service.DestinationService;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"ui.controller"})
public class DestinationServiceApplication {
	
	@Bean(name = "destinationService")
	public DestinationService weatherService() {
		return new DestinationService();
	}

	public static void main(String[] args) {
		SpringApplication.run(DestinationServiceApplication.class, args);
	}

}
