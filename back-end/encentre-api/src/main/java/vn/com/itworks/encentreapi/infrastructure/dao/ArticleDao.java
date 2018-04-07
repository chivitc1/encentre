package vn.com.itworks.encentreapi.infrastructure.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vn.com.itworks.encentreapi.domain.Article;
import vn.com.itworks.encentreapi.repository.ArticleRepository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticleDao implements ArticleRepository
{
	private static final String INSERT_SQL = "INSERT INTO ARTICLE " +
			"(title, body, author) " +
			"VALUES (?, ?, ?) RETURNING id, created_at, lastmodified";
	private static final String SELECT_ALL_SQL = "SELECT * FROM ARTICLE";

	private final DataSource dataSource;

	public ArticleDao(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public Article insert(Article _article)
	{
		try (Connection conn = dataSource.getConnection();
			 PreparedStatement ps = conn.prepareStatement(INSERT_SQL, Statement.RETURN_GENERATED_KEYS)) {
			ps.setString(1, _article.getTitle());
			ps.setString(2, _article.getBody());
			ps.setString(3, _article.getAuthor());

			ps.execute();
			ResultSet rs = ps.getGeneratedKeys();
			String generatedKey = "";
			if (rs.next()) {
				generatedKey = rs.getString(1);
				_article.setId(generatedKey);

				Timestamp createdAt = rs.getTimestamp(2);
				_article.setCreatedAt(createdAt);

				Timestamp lastModified = rs.getTimestamp(3);
				_article.setLastModified(lastModified);

			}
		} catch (SQLException _e) {
			throw new RuntimeException(_e);
		}
		return _article;
	}

	@Override
	public List<Article> findAll()
	{
		try (Connection conn = dataSource.getConnection();
			 PreparedStatement ps = conn.prepareStatement(SELECT_ALL_SQL);
			 ResultSet rs = ps.executeQuery()) {
			List<Article> articles = new ArrayList<>();
			while (rs.next()) {
				articles.add(toArticle(rs));
			}
			return articles;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private Article toArticle(ResultSet rs) throws SQLException {
		return Article.builder()
				.id(rs.getString("id"))
				.title(rs.getString("title"))
				.body(rs.getString("body"))
				.author(rs.getString("author"))
				.build();
	}
}
