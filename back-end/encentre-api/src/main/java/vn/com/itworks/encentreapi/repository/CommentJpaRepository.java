package vn.com.itworks.encentreapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.itworks.encentreapi.domain.Comment;

public interface CommentJpaRepository extends JpaRepository<Comment, Integer>
{
}
