package vn.com.itworks.encentreapi.infrastructure.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;
import vn.com.itworks.encentreapi.domain.Article;
import vn.com.itworks.encentreapi.repository.ArticleRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ArticleDao implements ArticleRepository
{
	private static final String INSERT_SQL = "INSERT INTO ARTICLE " +
			"(title, body, author) " +
			"VALUES (?, ?, ?)";
	private static final String SELECT_ALL_SQL = "SELECT * FROM ARTICLE";
	private static final String SELECT_ONE_SQL = "SELECT * FROM ARTICLE WHERE id = ?";
	private static final String SELECT_SINGLE_VALUE = "SELECT author FROM ARTICLE WHERE id = ?";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Article insert(Article _article)
	{
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(con -> {
			PreparedStatement ps = con.prepareStatement(INSERT_SQL,
					new String[]{"id"});
			ps.setString(1, _article.getTitle());
			ps.setString(2, _article.getBody());
			ps.setString(3, _article.getAuthor());

			return ps;
		}, keyHolder);
		_article.setId((Integer)keyHolder.getKeys().get("id"));
		return _article;
	}

	@Override
	public List<Article> findAll()
	{
		List<Article> articles =
				jdbcTemplate.query(SELECT_ALL_SQL, new ArticleRowMapper());
		return articles;
	}

	public Article findById(int _id)
	{
		Article article =
				jdbcTemplate.queryForObject(SELECT_ONE_SQL, new ArticleRowMapper(), _id);
		return article;
	}

	public List<Article> findAllV2() {
		return jdbcTemplate.query(SELECT_ALL_SQL,
				BeanPropertyRowMapper.newInstance(Article.class));
	}

	public String getAuthor(int _articleId) {
		return jdbcTemplate.queryForObject(SELECT_SINGLE_VALUE, String.class, _articleId);
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
