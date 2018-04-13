package vn.com.itworks.encentreapi.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.itworks.encentreapi.domain.Article;
import vn.com.itworks.encentreapi.domain.Author;
import vn.com.itworks.encentreapi.domain.Comment;
import vn.com.itworks.encentreapi.repository.ArticleCrudRepository;
import vn.com.itworks.encentreapi.repository.AuthorJpaRepository;
import vn.com.itworks.encentreapi.repository.CommentJpaRepository;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Service
@Slf4j
public class DbInitializer
{
	@Autowired
	private ArticleCrudRepository articleCrudRepository;

	@Autowired
	private CommentJpaRepository commentJpaRepository;

	@Autowired
	private AuthorJpaRepository authorJpaRepository;

	@PostConstruct
	public void init() {
		log.info("==========Starting DB Initialization============");
		Author author1 = Author.builder().name("Nguyen Van A").build();
		Author author2 = Author.builder().name("Nguyen Van B").build();
		Author author3 = Author.builder().name("Le Van C").build();
		Author author4 = Author.builder().name("Tran Van D").build();
		authorJpaRepository.saveAll(Arrays.asList(author1, author2, author3, author4));

		Article article1 = Article.builder()
				.author(author1)
				.title("This is a title abc")
				.body("This content is about test")
				.build();
		Article article2 = Article.builder()
				.author(author1)
				.title("This is a title abc")
				.body("This content is about test")
				.build();
		articleCrudRepository.saveAll(Arrays.asList(article1, article2));
		Comment comment1 = Comment.builder()
				.article(article2)
				.text("I comment for you")
				.article(article2)
				.author(author2)
				.build();
		commentJpaRepository.save(comment1);
	}
}
