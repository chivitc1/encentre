package vn.com.itworks.encentreapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.com.itworks.encentreapi.domain.Article;
import vn.com.itworks.encentreapi.services.ArticleService;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@Slf4j(topic = "MAIN")
public class EncentreApiApplication {

	@Autowired
	private ArticleService articleService;

	public static void main(String[] args) {
		SpringApplication.run(EncentreApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return args -> {
			log.info("Welcome to SpringBoot based empty project");
			Optional<List<Article>> optArticleList = articleService.getAll();
			if (optArticleList.isPresent()) {
				log.info("DONE");
			}
		};
	}
}
