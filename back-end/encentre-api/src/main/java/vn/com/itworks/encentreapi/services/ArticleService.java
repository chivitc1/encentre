package vn.com.itworks.encentreapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.itworks.encentreapi.domain.Article;
import vn.com.itworks.encentreapi.repository.ArticleRepository;

import java.util.List;
import java.util.Optional;

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
}
