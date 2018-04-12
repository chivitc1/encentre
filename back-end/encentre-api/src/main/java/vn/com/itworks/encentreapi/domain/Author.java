package vn.com.itworks.encentreapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
@Entity @Table(name = "author")
public class Author
{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;
}
