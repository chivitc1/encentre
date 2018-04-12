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
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment
{
	@NonNull
	private Integer id;

	@NonNull
	private Integer articleId;

	@NonNull
	private String text;

	private Timestamp createdAt;

	private String author;
}
