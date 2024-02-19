package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;
import kr.hs.study.mapper.ClassMapper;

@Component
public class ClassDAO {
	@Autowired
	JdbcTemplate db;
	@Autowired
	ClassMapper mapper;
	
	//Insert
	public void insert_data(TestBean bean) {
		String sql = "INSERT into LoginTable VALUES(?,?)";
		db.update(sql,bean.getId(),bean.getPassword());		
	}
	
	//Update
	public void update_data(TestBean bean) {
		String sql = "UPDATE LoginTable set password=? where id=?";
		db.update(sql, bean.getPassword(), bean.getId());
	}
	
	//Delete
	public void delete_data(TestBean bean) {
		String sql = "DELETE FROM LoginTable where id=?";
		db.update(sql,bean.getId());
	}
	
	//Select
	public List<TestBean> select_data(){
		String sql = "SELECT * FROM LoginTable";
		List<TestBean> list = db.query(sql, mapper);
		return list;
	}
	
	
	
}
