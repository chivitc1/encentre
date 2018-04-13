# Spring JPA for data access
## Dependency for JPA & Hibernate
- compile("org.springframework.boot:spring-boot-starter-data-jpa")
## Beans for Hibernate
- DataSource dataSource
- Properties hibernateProperties
- PlatformTransactionManager transactionManager
- JpaVendorAdapter jpaVendorAdapter
- EntityManagerFactory entityManagerFactory
## Entity declaration
- @Entity
- @Id
- @Transactional at DAO class
## Spring Jpa CrudRepository<T, TId>
- Enable JPA repositories

	@Configuration
	@Slf4j
	@EnableTransactionManagement
	@EnableJpaRepositories(basePackages = {"vn.com.itworks.encentreapi.repository"})
	public class MyJpaConfig
	{ ...

- Create a Spring data jpa repository
public interface ArticleCrudRepository extends CrudRepository<Article, Integer>
{
	List<Article> findByAuthorName(String _authorName);

	@Query("SELECT new vn.com.itworks.encentreapi.view.ArticleComment(" +
			"a.title, b.text) FROM Article a " +
			"INNER JOIN a.comments b")
	List<ArticleComment> findArticleWithComments();
}

- Insert or update
	articleCrudRepository.save(_article);

- Query list of entities
	List<Article> list = new ArrayList<>();
		articleCrudRepository.findAll().forEach(list::add);


-Query list of non-entity

List<ArticleComment> list = new ArrayList<>();
		articleCrudRepository.findArticleWithComments()
				.forEach(list::add);