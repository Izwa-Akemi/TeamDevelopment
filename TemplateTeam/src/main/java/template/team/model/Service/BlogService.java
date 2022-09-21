package template.team.model.Service;

import org.springframework.beans.factory.annotation.Autowired;

import template.team.model.Dao.BlogDao;
import template.team.model.Entity.AdminEntity;
import template.team.model.Entity.BlogEntity;


public class BlogService {
	@Autowired
	private BlogDao blogDao;
	
	public BlogEntity createBlog(String blogTitle,String blogImg,String blogMesssage) {
		return blogDao.save(new BlogEntity(blogTitle, blogImg, blogMesssage));
	}
}
