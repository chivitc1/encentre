# Spring lab - data access using tradditional jdbc
- Config DataSource bean for production using HikariDataSource class (See MySpringConfig class)
- Config DataSource bean for integration test using EmbeddedPostgres (See EmbeddedPostgresConfiguration class)

- Config connection in application.properties for production
- Config connection in application_test.properties for integration test

- Integration test ArticleDaoTests class use: SpringRunner, @SpringBootTest point to test config bean only, use active profiles for test, instruct test env use PropertySource point to application_test.properties
- Use @Sql to run sql script needed for test.
- build.gradle

- Jdbc using ? place holder, and PrepareStatement to insert query.

