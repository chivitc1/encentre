package vn.com.itworks.encentreapi.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

@Configuration
public class MySpringConfig
{
	@Autowired
	private Environment env;

	@Bean
	@Primary
	@ConfigurationProperties("spring.datasource")
	public DataSourceProperties dataSourceProperties() {
		return new DataSourceProperties();
	}

	@Primary
	@Bean(name = "dataSource")
	@ConfigurationProperties("spring.datasource")
	public HikariDataSource dataSource(DataSourceProperties properties) {
		return properties.initializeDataSourceBuilder().type(HikariDataSource.class)
				.build();
	}
}
