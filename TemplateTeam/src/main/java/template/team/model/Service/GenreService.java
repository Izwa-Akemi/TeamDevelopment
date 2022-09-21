package template.team.model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import template.team.model.Dao.GenreDao;
import template.team.model.Entity.GenreEntity;


@Service
public class GenreService {
	@Autowired
	private GenreDao genreDao;
	//一覧取得
		public List<GenreEntity> findAll() {
			return genreDao.findAll();
		}

		//内容を保存
		public void insert(String genreName) {
			genreDao.save(new GenreEntity(genreName));
		}

}
