package kr.hs.study.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class ClassMapper implements RowMapper{

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		TestBean bean = new TestBean();
		bean.setId(rs.getString("id"));
		bean.setPassword(rs.getString("password"));
		
		return bean;
	}
	
}
