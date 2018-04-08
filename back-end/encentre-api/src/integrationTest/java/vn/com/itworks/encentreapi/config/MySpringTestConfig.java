package vn.com.itworks.encentreapi.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import vn.com.itworks.encentreapi.infrastructure.dao.ArticleDao;
import vn.com.itworks.encentreapi.repository.ArticleRepository;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:application_test.properties")
@Profile("test")
public class MySpringTestConfig
{
	@Autowired
	private DataSource dataSource;

	@Bean("jdbcTemplate")
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}

	@Bean
	@DependsOn("jdbcTemplate")
	public ArticleRepository articleRepository() {
		return new ArticleDao();
	}
}
