package kr.hs.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.dto.DataBean;

@Repository
public class daoInterfaceImpl implements daoInterface {

	@Autowired
	private SqlSessionTemplate session;
	
	public List<DataBean> select() {
		return session.selectList("test.select_data");
	}

	@Override
	public void insert(DataBean bean) {
		session.insert("test.insert_data",bean);
	}

	@Override
	public void delete(String value) {
		session.delete("test.delete_data",value);
	}

}
