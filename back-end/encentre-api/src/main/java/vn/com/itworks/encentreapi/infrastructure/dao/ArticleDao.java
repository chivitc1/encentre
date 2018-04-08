package vn.com.itworks.encentreapi.infrastructure.dao;

import org.springframework.beans.factory.annotation.Autowired;
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
		_article.setId(keyHolder.getKeys().get("id").toString());
		return _article;
	}

	@Override
	public List<Article> findAll()
	{
		List<Article> articles =
				jdbcTemplate.query(SELECT_ALL_SQL, new ArticleRowMapper());
		return articles;
	}

	private class ArticleRowMapper implements RowMapper<Article> {

		@Nullable
		@Override
		public Article mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			return Article.builder()
					.id(rs.getString("id"))
					.title(rs.getString("title"))
					.body(rs.getString("body"))
					.author(rs.getString("author"))
					.createdAt(rs.getTimestamp("created_at"))
					.lastModified(rs.getTimestamp("lastmodified"))
					.build();
		}
	}
}
