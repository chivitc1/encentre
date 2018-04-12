package vn.com.itworks.encentreapi.infrastructure.dao;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vn.com.itworks.encentreapi.domain.Article;
import vn.com.itworks.encentreapi.repository.ArticleRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional(readOnly = true)
@Repository
@Slf4j
public class ArticleDao implements ArticleRepository
{
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(readOnly = false)
	@Override
	public Article saveOrUpdate(Article _article)
	{
		sessionFactory.getCurrentSession()
				.saveOrUpdate(_article);
		return _article;
	}

	@Override
	public List<Article> findAll()
	{
		List<Article> articles =
				sessionFactory.getCurrentSession()
						.createQuery("from Article a")
						.list();
		return articles;
	}

	public Article findById(int _id)
	{
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("id", _id);
		Article article = (Article)sessionFactory.getCurrentSession()
			.createQuery("from Article a where id=:id")
			.setParameter("id", _id)
			.uniqueResult();
		return article;
	}

	@Override
	public List<Article> findAllArticlesWithComments()
	{
		List<Article> articles = sessionFactory.getCurrentSession()
				.getNamedQuery("Article.findAllWithComments")
				.list();
		return articles;
	}
}
