package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class TestDAO {
	//실제 쿼리를 날리는 곳
	//쿼리 날리는 예 : JdbcTemplate
	//여기에 jdbcTemplate이 있어야 한다.
	@Autowired
	JdbcTemplate db;
	
	//Insert
	public void insert_data(TestBean bean) {
		String sql = "INSERT INTO test VALUES(?,?)";
		db.update(sql,bean.getData1(),bean.getData2());
	}
	
}
