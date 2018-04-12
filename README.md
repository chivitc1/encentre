# Spring JPA - Hibernate implementation for data access
## Dependency for JPA & Hibernate
- compile("org.springframework.boot:spring-boot-starter-data-jpa")
## Beans for Hibernate
- DataSource dataSource
- Properties hibernateProperties
- SessionFactory sessionFactory
- PlatformTransactionManager transactionManager
## Entity declaration
- @Entity
- @Id
- @Transactional at DAO class
## Hibernate Session
sessionFactory.getCurrentSession()
						.createQuery("from Article a")
						.list();
sessionFactory.getCurrentSession()
				.saveOrUpdate(_article);
sessionFactory.getCurrentSession()
				.getNamedQuery("Article.findAllWithComments")
				.list();