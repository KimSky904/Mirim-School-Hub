package kr.hs.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.dto.DataBean;

@Repository
public class daoInterfaceImpl implements daoInterface {

	@Autowired
	private SqlSessionTemplate session; //실제 DB에 접근하여 쿼리를 날릴 녀석
	
	@Override
	public void insert(DataBean bean) {
		session.insert("test.insert_data",bean); //mapper의 namespace . 메소드
	}

	@Override
	public List<DataBean> select() {		
		return session.selectList("test.select_data");
	}

//	@Override
//	public void delete(String value) {
//		session.delete(value);
//	}

}
