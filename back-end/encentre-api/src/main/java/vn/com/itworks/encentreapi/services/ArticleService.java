package vn.com.itworks.encentreapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.com.itworks.encentreapi.domain.Article;
import vn.com.itworks.encentreapi.repository.ArticleCrudRepository;
import vn.com.itworks.encentreapi.view.ArticleComment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Transactional(readOnly = true)
@Service
public class ArticleService
{
	@Autowired
	private ArticleCrudRepository articleCrudRepository;

	public Optional<List<Article>> getAll() {
		List<Article> list = new ArrayList<>();
		articleCrudRepository.findAll().forEach(list::add);

		if (list.size() == 0 ) {
			return Optional.empty();
		}
		return Optional.of(list);
	}

	@Transactional(readOnly = false)
	public Article insert(Article _article) {
		articleCrudRepository.save(_article);
		return _article;
	}

	public Optional<List<Article>> findAllArticleByAuthorName(String _authorName){
		List<Article> list = new ArrayList<>();
		articleCrudRepository.findByAuthorName(_authorName)
			.forEach(list::add);
		if (list.size() == 0 ) {
			return Optional.empty();
		}
		return Optional.of(list);
	}

	public Optional<List<ArticleComment>> findArticleWithComments() {
		List<ArticleComment> list = new ArrayList<>();
		articleCrudRepository.findArticleWithComments()
				.forEach(list::add);
		if (list.size() == 0 ) {
			return Optional.empty();
		}
		return Optional.of(list);
	}
}
