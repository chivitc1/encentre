package vn.com.itworks.encentreapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.com.itworks.encentreapi.domain.Article;
import vn.com.itworks.encentreapi.repository.ArticleRepository;
import vn.com.itworks.encentreapi.view.ArticleComment;

import java.util.List;
import java.util.Optional;

@Transactional(readOnly = true)
@Service
public class ArticleService
{
	@Autowired
	private ArticleRepository articleRepository;

	public Optional<List<Article>> getAll() {
		List<Article> list = articleRepository.findAll();
		if (list.size() == 0 ) {
			return Optional.empty();
		}
		return Optional.of(list);
	}

	@Transactional(readOnly = false)
	public Article insert(Article _article) {
		articleRepository.saveOrUpdate(_article);
		return _article;
	}

	@Transactional(readOnly = true)
	public Optional<List<ArticleComment>> findAllArticleComments(){
		List<ArticleComment> list = articleRepository.findAllArticleComments();
		if (list.size() == 0 ) {
			return Optional.empty();
		}
		return Optional.of(list);
	}
}
