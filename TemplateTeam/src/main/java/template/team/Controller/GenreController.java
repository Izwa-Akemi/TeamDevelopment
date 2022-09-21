package template.team.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import template.team.model.Entity.AdminEntity;
import template.team.model.Entity.GenreEntity;
import template.team.model.Service.GenreService;

@Controller
public class GenreController {
	@Autowired
	private GenreService genreService;
	//新規登録画面を表示
		@GetMapping("/genreRegister")
		public String getGenreRegisterPage() {
			return "genre_register_view.html";
		}

		//登録内容を保存
		@PostMapping("genreCreate")
		public String register(@RequestParam String genreName) {
			genreService.insert(genreName);
			return "redirect:/genreRegister";
		}
		//一覧を表示
		@GetMapping("/genreAll")
		public String getGenreAll(Model model) {
			List<GenreEntity>genrelist = genreService.findAll();
			model.addAttribute("genrelist",genrelist);
			return "genre_all_view.html";
		}
	
}
