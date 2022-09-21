package template.team.model.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import template.team.model.Entity.AdminEntity;

@Repository
public interface AdminDao extends JpaRepository<AdminEntity, Long> {
    AdminEntity save(AdminEntity adminentity);
}
