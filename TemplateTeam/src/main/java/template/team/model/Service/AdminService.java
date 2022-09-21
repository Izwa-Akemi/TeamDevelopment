package template.team.model.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import template.team.model.Dao.AdminDao;
import template.team.model.Entity.AdminEntity;

@Service
public class AdminService {
	@Autowired
	private AdminDao adminDao;

	//一覧取得
	public List<AdminEntity> findAll() {
		return adminDao.findAll();
	}

	//内容を保存
	public void insert(String adminName,String adminEmail,String password) {
		adminDao.save(new AdminEntity(adminName,adminEmail,password));
	}

	//内容をupdate
	public void update(Long adminId,String adminName,String adminEmail,String password) {
		adminDao.save(new AdminEntity(adminId,adminName,adminEmail,password));
	}

	//削除
	public void delete(Long adminId) {
		adminDao.deleteById(adminId);
	}

	//idを見つける
	public Optional<AdminEntity> selectById(Long adminId) {
		return adminDao.findById(adminId);
	}

}
