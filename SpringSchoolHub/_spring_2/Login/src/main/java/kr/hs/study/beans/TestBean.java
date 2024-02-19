package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean {
	String id;
	String password;	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
