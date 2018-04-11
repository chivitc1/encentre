package vn.com.itworks.encentreapi.infrastructure.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;
import vn.com.itworks.encentreapi.domain.Article;
import vn.com.itworks.encentreapi.repository.ArticleRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ArticleDao implements ArticleRepository
{
	private static final String INSERT_SQL = "INSERT INTO ARTICLE " +
			"(title, body, author) " +
			"VALUES (:title, :body, :author)";
	private static final String SELECT_ALL_SQL = "SELECT * FROM ARTICLE";
	private static final String SELECT_ONE_SQL = "SELECT * FROM ARTICLE WHERE id = :id";
	private static final String SELECT_SINGLE_VALUE = "SELECT author FROM ARTICLE WHERE id = :articleId";

	@Autowired
	private NamedParameterJdbcTemplate namedJdbcTemplate;

	@Override
	public Article insert(Article _article)
	{
		KeyHolder keyHolder = new GeneratedKeyHolder();
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("title", _article.getTitle());
		parameters.put("body", _article.getBody());
		parameters.put("author", _article.getAuthor());
		SqlParameterSource sqlParameterSource = new MapSqlParameterSource(parameters);

		namedJdbcTemplate.update(INSERT_SQL, sqlParameterSource, keyHolder);

		_article.setId((Integer)keyHolder.getKeys().get("id"));
		return _article;
	}

	@Override
	public List<Article> findAll()
	{
		List<Article> articles =
				namedJdbcTemplate.getJdbcOperations()
						.query(SELECT_ALL_SQL, new ArticleRowMapper());
		return articles;
	}

	public Article findById(int _id)
	{
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("id", _id);
		Article article =
				namedJdbcTemplate.queryForObject(SELECT_ONE_SQL, parameters, new ArticleRowMapper());
		return article;
	}

	public List<Article> findAllV2() {
		return namedJdbcTemplate.query(SELECT_ALL_SQL,
				BeanPropertyRowMapper.newInstance(Article.class));
	}

	public String getAuthor(int _articleId) {
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("articleId", _articleId);
		return namedJdbcTemplate.queryForObject(SELECT_SINGLE_VALUE, parameters, String.class);
	}

	private class ArticleRowMapper implements RowMapper<Article> {

		@Nullable
		@Override
		public Article mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			return Article.builder()
					.id(rs.getInt("id"))
					.title(rs.getString("title"))
					.body(rs.getString("body"))
					.author(rs.getString("author"))
					.createdAt(rs.getTimestamp("created_at"))
					.lastModified(rs.getTimestamp("lastmodified"))
					.build();
		}
	}
}
