package vn.com.itworks.encentreapi.infrastructure.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vn.com.itworks.encentreapi.domain.Article;
import vn.com.itworks.encentreapi.repository.ArticleRepository;
import vn.com.itworks.encentreapi.view.ArticleComment;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional(readOnly = true)
@Repository
@Slf4j
public class ArticleDao implements ArticleRepository
{
	@PersistenceContext
	private EntityManager em;

	@Transactional(readOnly = false)
	@Override
	public Article saveOrUpdate(Article _article)
	{
		if (_article.getId() == null) {
			em.persist(_article);
		} else {
			em.merge(_article);
		}
		return _article;
	}

	@Override
	public List<Article> findAll()
	{
		List<Article> articles =
				em.createQuery("from Article a", Article.class)
					.getResultList();
		return articles;
	}

	public Article findById(int _id)
	{
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("id", _id);

		TypedQuery<Article> typedQuery =
				em.createQuery("from Article a", Article.class);
		typedQuery.setParameter("id", _id);
		return typedQuery.getSingleResult();
	}

	@Override
	public List<ArticleComment> findAllArticleComments() {
		List<ArticleComment> articleCommentList =
				em.createQuery("select new vn.com.itworks.encentreapi.view.ArticleComment(" +
				"a.title articleTitle, b.text commentText from Article a " +
				"inner join a.comments b ",
				ArticleComment.class
		).getResultList();

		return articleCommentList;
	}
}
