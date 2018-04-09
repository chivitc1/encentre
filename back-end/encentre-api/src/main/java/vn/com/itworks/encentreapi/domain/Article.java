package vn.com.itworks.encentreapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Article
{
	@NonNull
	private Integer id;

	@NonNull
	private String title;

	@NonNull
	private String body;

	@NonNull
	private String author;
	private Timestamp createdAt;
	private Timestamp lastModified;
}
