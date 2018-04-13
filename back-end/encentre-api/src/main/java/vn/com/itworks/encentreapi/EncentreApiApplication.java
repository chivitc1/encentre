package vn.com.itworks.encentreapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import vn.com.itworks.encentreapi.domain.Article;
import vn.com.itworks.encentreapi.domain.Author;
import vn.com.itworks.encentreapi.domain.Comment;
import vn.com.itworks.encentreapi.services.ArticleService;
import vn.com.itworks.encentreapi.view.ArticleComment;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@Slf4j(topic = "MAIN")
public class EncentreApiApplication {

	@Autowired
	private ArticleService articleService;

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(EncentreApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return args -> {
			log.info("Welcome to SpringBoot");

			int count = 0;
			System.out.println("List of all beans Spring load: ");
			for (String bName : applicationContext.getBeanDefinitionNames()) {
				System.out.println(++count + ". " + bName);
			}

			System.out.println("JPA insert entity");
			articleService.insert(Article.builder()
					.id(null)
					.title("a Title")
					.body("a Body")
					.author(Author.builder().id(1).name("Chinv").build()).build());

			System.out.println("JPA query entities");
			Optional<List<Article>> optArticleList = articleService.getAll();
			if (optArticleList.isPresent()) {

				List<Article> articles = optArticleList.get();
				int index = 0;
				for(Article item : articles) {
					System.out.println(String.format("%d. %s, by %s", ++index,
							item.getTitle(), item.getAuthor().getName()));
				}
			}

			System.out.println("JPA query non-entities");
			Optional<List<ArticleComment>> optList = articleService.findAllArticleComments();
			if (optArticleList.isPresent()) {

				List<ArticleComment> list = optList.get();
				int index = 0;
				for(ArticleComment item : list) {
					System.out.println(String.format("%d. %s, by %s", ++index,
							item.getArticleTitle(), item.getCommentText()));
				}
			}
		};
	}
}
