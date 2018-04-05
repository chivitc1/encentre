package vn.com.itworks.encentreapi.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Slf4j(topic = "MyService")
public class MyService
{
	@Value("${myapp.app-name}")
	private String appName;

	@PostConstruct
	public String getMsg() {
		String msg = String.format("Welcome %s", appName);
		log.info(msg);
		return msg;
	}
}
