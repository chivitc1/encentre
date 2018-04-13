package vn.com.itworks.encentreapi.repository;

import vn.com.itworks.encentreapi.domain.Article;
import vn.com.itworks.encentreapi.view.ArticleComment;

import java.util.List;

public interface ArticleRepository
{
	Article saveOrUpdate(Article _article);
	List<Article> findAll();
	Article findById(int _id);


	List<ArticleComment> findAllArticleComments();
}
