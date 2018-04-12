package vn.com.itworks.encentreapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;
import java.sql.Timestamp;
import java.util.List;

@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
@Entity @Table(name = "article")
@NamedQueries({
		@NamedQuery(name="Article.findAllWithComments",
			query = "select distinct a from Article a inner join fetch a.comments b")
})
public class Article
{
	@NonNull
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;

	@NonNull
	private String title;

	@NonNull
	private String body;

	@NonNull
	@OneToOne @JoinColumn(name = "author_id")
	private Author author;

	@Column(name = "created_at")
	private Timestamp createdAt;

	@Column(name = "lastmodified")
	private Timestamp lastModified;

	@OneToMany(mappedBy = "article", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Comment> comments;
}
