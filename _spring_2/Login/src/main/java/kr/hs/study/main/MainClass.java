package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.ClassDAO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//DAO
		ClassDAO dao = ctx.getBean(ClassDAO.class);
		
		//TestBean
		TestBean t1 = new TestBean();
		t1.setId("Kim");
		t1.setPassword("1111");
		TestBean t2 = new TestBean();
		t2.setId("Lee");
		t2.setPassword("2222");
		TestBean t3 = new TestBean();
		t3.setId("Park");
		t3.setPassword("3333");
		
		//Insert
//		dao.insert_data(t1);
//		dao.insert_data(t2);
//		dao.insert_data(t3);
		
		//Update
		t1.setPassword("5678");
		dao.update_data(t1);

		//Delete
//		dao.delete_data(t1);
//		dao.delete_data(t2);
//		dao.delete_data(t3);
		
		//Select
		List<TestBean> list = dao.select_data();
		for(TestBean bean : list) {
			System.out.println("id : "+bean.getId()+"  pw : "+bean.getPassword());
		}
		
	}

}
