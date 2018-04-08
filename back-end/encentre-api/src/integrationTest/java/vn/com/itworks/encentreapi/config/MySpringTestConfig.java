package vn.com.itworks.encentreapi.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import vn.com.itworks.encentreapi.infrastructure.dao.ArticleDao;
import vn.com.itworks.encentreapi.repository.ArticleRepository;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:application_test.properties")
public class MySpringTestConfig
{
//	@Autowired
//	private Environment env;
//
//	@Bean
//	@Primary
//	@ConfigurationProperties("spring.datasource")
//	public DataSourceProperties dataSourceProperties() {
//		return new DataSourceProperties();
//	}
//
//	@Primary
//	@Bean(name = "dataSource")
//	@Profile("test")
//	public DataSource dataSource() {
//
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
//		dataSource.setUrl(env.getProperty("spring.datasource.url"));
//		dataSource.setUsername(env.getProperty("spring.datasource.username"));
//		dataSource.setPassword(env.getProperty("spring.datasource.password"));
//		return dataSource;
//	}

//	@Bean
//	public ArticleRepository articleRepository() {
//		return new ArticleDao(dataSource());
//	}
}
