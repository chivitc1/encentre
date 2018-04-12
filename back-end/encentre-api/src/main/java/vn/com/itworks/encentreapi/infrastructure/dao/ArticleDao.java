package vn.com.itworks.encentreapi.infrastructure.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;
import vn.com.itworks.encentreapi.domain.Article;
import vn.com.itworks.encentreapi.domain.Comment;
import vn.com.itworks.encentreapi.repository.ArticleRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
@Slf4j
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

	@Override
	public List<Article> findAllArticlesWithComments() {
		String sql = "SELECT a.id, a.title, a.body, a.created_at, a.lastmodified, a.author, " +
				"b.id comment_id, b.text comment_text, b.created_at comment_created_at, " +
				"b.author comment_author FROM ARTICLE a " +
				"JOIN COMMENT b ON a.id = b.id";
		List<Article> articles = namedJdbcTemplate.query(sql, new ArticleWithCommentExtractor());
		return articles;
	}

	private static class ArticleWithCommentExtractor implements ResultSetExtractor<List<Article>> {

		@Nullable
		@Override
		public List<Article> extractData(ResultSet rs) throws SQLException, DataAccessException
		{
			Map<Integer, Article> articleMap = new LinkedHashMap<>();
			Article article;
			while(rs.next()){
				Integer id = rs.getInt("id");
				article = articleMap.get(id);
				if (article == null) {
					article = Article.builder()
							.id(id)
							.title(rs.getString("title"))
							.body(rs.getString("body"))
							.author(rs.getString("author"))
							.createdAt(rs.getTimestamp("created_at"))
							.lastModified(rs.getTimestamp("lastmodified"))
							.comments(new ArrayList<>())
							.build();

					int commentId = rs.getInt("comment_id");
					log.info("COMMENT ID: " + commentId);
					if (commentId > 0) {
						Comment comment = Comment.builder()
								.id(commentId)
								.articleId(id)
								.text(rs.getString("comment_text"))
								.createdAt(rs.getTimestamp("comment_created_at"))
								.author(rs.getString("comment_author"))
								.build();
						article.getComments().add(comment);
					}
					articleMap.put(id, article);
				}
			}
			return new ArrayList<>(articleMap.values());
		}
	}
}
