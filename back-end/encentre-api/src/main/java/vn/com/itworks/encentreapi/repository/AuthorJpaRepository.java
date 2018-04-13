package vn.com.itworks.encentreapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.itworks.encentreapi.domain.Author;

public interface AuthorJpaRepository extends JpaRepository<Author, Integer>
{
}
