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
## JPA EntityManager
- Inject EntityManager bean
@PersistenceContext
private EntityManager em;

- Insert or update
	if (_article.getId() == null) {
			em.persist(_article);
		} else {
			em.merge(_article);
		}

- Query list of entities
	em.createQuery("from Article a", Article.class)
					.getResultList();

- Query entity with param
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("id", _id);

		TypedQuery<Article> typedQuery =
				em.createQuery("from Article a", Article.class);
		typedQuery.setParameter("id", _id);
		return typedQuery.getSingleResult();

-Query list of non-entity

List<ArticleComment> articleCommentList =
				em.createQuery("select new vn.com.itworks.encentreapi.view.ArticleComment(" +
				"a.title articleTitle, b.text commentText from Article a " +
				"inner join a.comments b ",
				ArticleComment.class
		).getResultList();