package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class ClassDAO {
	@Autowired
	JdbcTemplate db;
	
	public void insert_data(TestBean t) {
		String sql = "INSERT INTO SElECT_TABLE VALUES(?,?,?,?)";
		db.update(sql,t.getUserId(),t.getUserPass(),t.getUserName(),t.getUserAge());
	}
	public void select_data(int id) {
		String sql = "SELECT * FROM SELECT_TABLE WHERE userId=?";
		db.update(sql,id);
	}
	
}
