package vn.com.itworks.encentreapi.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.Resource;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Slf4j(topic = "DEMO")
public class BannerLoader
{
	@Autowired
	@Qualifier("banner")
	private Resource banner;

	@PostConstruct
	public void showBanner() throws IOException
	{
		try (InputStream is = banner.getInputStream();
			 BufferedReader br = new BufferedReader(new InputStreamReader(is));) {
			while(true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				log.info(line);
			}
		}
	}
}
