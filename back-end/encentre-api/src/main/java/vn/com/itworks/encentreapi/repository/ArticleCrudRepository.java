package vn.com.itworks.encentreapi.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import vn.com.itworks.encentreapi.domain.Article;
import vn.com.itworks.encentreapi.view.ArticleComment;

import java.util.List;

public interface ArticleCrudRepository extends CrudRepository<Article, Integer>
{
	List<Article> findByAuthorName(String _authorName);

	@Query("SELECT new vn.com.itworks.encentreapi.view.ArticleComment(" +
			"a.title, b.text) FROM Article a " +
			"INNER JOIN a.comments b")
	List<ArticleComment> findArticleWithComments();
}