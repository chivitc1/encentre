package vn.com.itworks.encentreapi.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
public class Article
{
	@NonNull
	private String id;

	@NonNull
	private String title;

	@NonNull
	private String body;

	@NonNull
	private String author;
	private Timestamp createdAt;
	private Timestamp lastModified;
}
