package vn.com.itworks.encentreapi.configuration;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

@Configuration
@Slf4j
public class MyHibernateConfig
{
//	@Bean
//	public DataSource dataSource() {
//		try {
//			EmbeddedDatabaseBuilder dbBuilder =
//					new EmbeddedDatabaseBuilder();
//			return dbBuilder.setType(EmbeddedDatabaseType.H2)
//					.addScripts("classpath:sql/schema.sql",
//							"classpath:sql/test-data.sql").build();
//		} catch (Exception e) {
//			log.error("Embedded DataSource bean cannot be created!", e);
//			return null;
//		}
//	}

	@Autowired
	private DataSource dataSource;

	@Autowired
	private Properties hibernateProperties;

//	private Properties hibernateProperties() {
//		Properties hibernateProp = new Properties();
//		hibernateProp.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
//		hibernateProp.put("hibernate.format_sql", true);
//		hibernateProp.put("hibernate.use_sql_comments", true);
//		hibernateProp.put("hibernate.show_sql", true);
//		hibernateProp.put("hibernate.max_fetch_depth", 3);
//		hibernateProp.put("hibernate.jdbc.batch_size", 10);
//		hibernateProp.put("hibernate.jdbc.fetch_size", 50);
//		return hibernateProp;
//	}

	@Bean public SessionFactory sessionFactory()
			throws IOException
	{
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource);
		sessionFactoryBean.setPackagesToScan("vn.com.itworks.encentreapi.domain");
		sessionFactoryBean.setHibernateProperties(hibernateProperties);
		sessionFactoryBean.afterPropertiesSet();
		return sessionFactoryBean.getObject();
	}

	@Bean public PlatformTransactionManager transactionManager()
			throws IOException {
		return new HibernateTransactionManager(sessionFactory());
	}
}
