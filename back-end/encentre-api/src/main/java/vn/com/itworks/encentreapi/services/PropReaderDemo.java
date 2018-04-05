package vn.com.itworks.encentreapi.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.Properties;

@Slf4j(topic = "DEMO")
@Component
public class PropReaderDemo
{
	@Value("classpath:mydata.txt")
	private Resource resource;

	@PostConstruct
	public void read() throws IOException
	{
		Properties props = PropertiesLoaderUtils.loadProperties(resource);
		String thePresident = props.getProperty("us.president");
		log.info(String.format("The president of US: %s", thePresident));
	}
}
