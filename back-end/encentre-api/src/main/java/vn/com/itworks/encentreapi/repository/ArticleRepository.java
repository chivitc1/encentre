package vn.com.itworks.encentreapi.repository;

import vn.com.itworks.encentreapi.domain.Article;

import java.util.List;

public interface ArticleRepository
{
	Article insert(Article _article);
	List<Article> findAll();
	Article findById(int _id);
	List<Article> findAllV2();
	String getAuthor(int _articleId);

	List<Article> findAllArticlesWithComments();
}
