package vn.com.itworks.encentreapi.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.commons.dbcp2.ConnectionFactory;
import org.apache.commons.dbcp2.DriverManagerConnectionFactory;
import org.apache.commons.dbcp2.PoolableConnection;
import org.apache.commons.dbcp2.PoolableConnectionFactory;
import org.apache.commons.dbcp2.PoolingDataSource;
import org.apache.commons.pool2.ObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class MySpringConfig
{
	@Bean
	@Primary
	@ConfigurationProperties("spring.datasource")
	public DataSourceProperties dataSourceProperties() {
		return new DataSourceProperties();
	}

	@Primary
	@Bean(name = "dataSource")
	@ConfigurationProperties("spring.datasource")
	public HikariDataSource hikariDataSource(DataSourceProperties properties) {
		return properties.initializeDataSourceBuilder()
				.type(HikariDataSource.class)
				.build();
	}

	@Autowired
	private Environment env;

//	@Primary
	@Bean(name = "dataSource")
	public DataSource dbcpDataSource() {
		String url = env.getProperty("spring.datasource.url");
		String username = env.getProperty("spring.datasource.username");
		String password = env.getProperty("spring.datasource.password");

		ConnectionFactory connectionFactory =
			new DriverManagerConnectionFactory(url, username, password);

		PoolableConnectionFactory poolableConnectionFactory =
			new PoolableConnectionFactory(connectionFactory,null);

		ObjectPool<PoolableConnection> connectionPool =
				new GenericObjectPool<>(poolableConnectionFactory);

		poolableConnectionFactory.setPool(connectionPool);

		PoolingDataSource dataSource =
				new PoolingDataSource(connectionPool);
		return dataSource;
	}
}
