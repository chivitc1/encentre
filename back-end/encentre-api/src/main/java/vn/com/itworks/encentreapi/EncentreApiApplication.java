package vn.com.itworks.encentreapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j(topic = "MAIN")
public class EncentreApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncentreApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return args -> {
			log.info("Welcome to SpringBoot based empty project");
		};
	}
}
