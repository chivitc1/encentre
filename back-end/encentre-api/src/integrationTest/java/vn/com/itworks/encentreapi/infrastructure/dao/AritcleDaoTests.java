package vn.com.itworks.encentreapi.infrastructure.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import vn.com.itworks.encentreapi.EncentreApiApplication;
import vn.com.itworks.encentreapi.config.MySpringTestConfig;
import vn.com.itworks.encentreapi.domain.Article;
import vn.com.itworks.encentreapi.repository.ArticleRepository;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {EncentreApiApplication.class, MySpringTestConfig.class})
@ActiveProfiles("test")
@PropertySource("classpath:application_test.properties")
public class AritcleDaoTests
{
	@Autowired
	private ArticleRepository articleRepository;

	@Test
	public void can_insert_article() {
		Article article = Article.builder()
				.id("0")
				.title("A Title")
				.body("Test body")
				.author("An Author")
				.build();
		Article newArticle = articleRepository.insert(article);
		assertTrue(newArticle.getId().length() > 1);
	}
}
