package template.team.Controller;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

import javax.persistence.criteria.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import template.team.model.Entity.BlogEntity;
import template.team.model.Service.AdminService;
import template.team.model.Service.BlogService;

public class BlogController {
	@Autowired
	private BlogService blogService;

	@GetMapping("/blogRegister")
	public String getBlogRegisterPage() {
		return "blog_register_view.html";
	}


	/*@PostMapping("blogCreate")
	public String register(@RequestParam String blogTitle,@RequestParam String blogImg,@RequestParam String blogMesssage, MultipartFile file) {
		//画像のアップロード処理
		
		BlogEntity blogEntity = new BlogEntity();
		try {
			blogEntity.setBlogImg(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		blogService.createBlog(blogTitle, blogImg, blogMesssage,blogEntity);
		return "redirect:/blogRegister";
	}*/
	
}
