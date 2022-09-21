package template.team.Sesstion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {
	/*@Autowired
 protected LoginSession loginSession;
 @RequestMapping(value = "/index", method = RequestMethod.GET)
 public String index() {
 return "index";
 }
 @RequestMapping(value = "/hello", method = RequestMethod.POST)
 public String confirm(@ModelAttribute LoginForm form, Model model) {
 loginSession.setUserName(form.getUserName());
 loginSession.setPassword(form.getPassword());

 return "hello";
 }*/

	@Autowired
	protected LoginSession loginSession;

	@GetMapping("/")
	public String getIndex() {
		return "session/index.html";
	}

	@PostMapping("/hello")
	public String confirm(@RequestParam String userName,@RequestParam String password, Model model) {
		loginSession.setUserName(userName);
		loginSession.setPassword(password);
		return "session/hello.html";
	}
}
