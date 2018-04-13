# Spring JPA for data access
## Auto create schema
- create ddl script in resources/db/schema.sql
- set appliaction.properties: 

spring.datasource.schema=classpath:db/schema.sql
spring.datasource.initialization-mode=always

## Create bean class DbInitializer { }
- init() has @PostConstruct to auto-run at bean initialization
	@PostConstruct
	public void init() {

- Create enties, inject entity Jpa repository and save them.