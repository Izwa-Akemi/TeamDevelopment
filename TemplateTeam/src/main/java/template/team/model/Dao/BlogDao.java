package template.team.model.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import template.team.model.Entity.AdminEntity;
import template.team.model.Entity.BlogEntity;

public interface BlogDao extends JpaRepository<BlogEntity, Long> {
	BlogEntity save(BlogEntity blogentity);
}
