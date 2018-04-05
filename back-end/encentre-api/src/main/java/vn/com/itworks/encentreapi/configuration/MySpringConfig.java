package vn.com.itworks.encentreapi.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import vn.com.itworks.encentreapi.services.BannerLoader;

@Configuration
public class MySpringConfig
{
	@Value("classpath:app-banner.txt")
	private Resource banner;

	@Bean("banner")
	public Resource getBanner() {
		return this.banner;
	}

	@Bean
	public BannerLoader bannerLoader() {
		return new BannerLoader();
	}
}
