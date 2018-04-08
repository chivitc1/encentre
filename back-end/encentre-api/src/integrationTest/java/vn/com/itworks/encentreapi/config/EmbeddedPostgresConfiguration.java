package vn.com.itworks.encentreapi.config;

import de.flapdoodle.embed.process.runtime.Network;
import org.postgresql.ds.PGPoolingDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Profile;
import ru.yandex.qatools.embed.postgresql.PostgresExecutable;
import ru.yandex.qatools.embed.postgresql.PostgresProcess;
import ru.yandex.qatools.embed.postgresql.PostgresStarter;
import ru.yandex.qatools.embed.postgresql.config.AbstractPostgresConfig;
import ru.yandex.qatools.embed.postgresql.config.PostgresConfig;
import ru.yandex.qatools.embed.postgresql.distribution.Version;
import vn.com.itworks.encentreapi.infrastructure.dao.ArticleDao;
import vn.com.itworks.encentreapi.repository.ArticleRepository;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class EmbeddedPostgresConfiguration
{
	@Bean(destroyMethod = "stop")
	@Profile("test")
	public PostgresProcess postgresProcess() throws IOException {

		PostgresConfig postgresConfig = new PostgresConfig(
				Version.V9_5_0,
				new AbstractPostgresConfig.Net("localhost", 15432),
				new AbstractPostgresConfig.Storage("test"),
				new AbstractPostgresConfig.Timeout(),
				new AbstractPostgresConfig.Credentials("test", "test")
		);

		PostgresStarter<PostgresExecutable, PostgresProcess> runtime = PostgresStarter.getDefaultInstance();
		PostgresExecutable exec = runtime.prepare(postgresConfig);
		PostgresProcess process = exec.start();

		return process;
	}

	@Bean(destroyMethod = "close")
	@DependsOn("postgresProcess")
	@Profile("test")
	public DataSource dataSource(PostgresProcess postgresProcess) {

		PGPoolingDataSource dataSource = new PGPoolingDataSource();

		PostgresConfig postgresConfig = postgresProcess.getConfig();
		dataSource.setUser(postgresConfig.credentials().username());
		dataSource.setPassword(postgresConfig.credentials().password());
		dataSource.setPortNumber(postgresConfig.net().port());
		dataSource.setServerName(postgresConfig.net().host());
		dataSource.setDatabaseName(postgresConfig.storage().dbName());

		return dataSource;
	}

	@Bean
	@DependsOn("dataSource")
	@Profile("test")
	public ArticleRepository articleRepository(DataSource _dataSource) {
		return new ArticleDao(_dataSource);
	}
}
