package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class UserDataBean {
	@Autowired
	String user_name;
	@Autowired
	String user_pw;
	@Autowired
	String user_id;
	@Autowired
	String post_code;
	@Autowired
	String addr1;
	@Autowired
	String addr2;
}
