package template.team.model.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import template.team.model.Entity.GenreEntity;

public interface GenreDao extends JpaRepository<GenreEntity, Long> {
	GenreEntity save(GenreEntity genreentity);
}
