package template.team.Sesstion;

import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component
public class LoginSession implements Serializable {
	
	private static final long serialVersionUID = 4771931137986346278L;
	private String userName;
	 private String password;
	 public String getUserName() {
	 return userName;
	 }
	 public void setUserName(String userName) {
	 this.userName = userName;
	 }
	 
	 public String getPassword() {
	 return password;
	 }
	 public void setPassword(String password) {
	 this.password = password;
	 }
	}