package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.ClassDAO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		// DAO °¡Á®¿À±â
		ClassDAO dao = ctx.getBean(ClassDAO.class);
				
		
		TestBean t1 = new TestBean();
		t1.setUserId(1);
		t1.setUserPass("1111");
		t1.setUserName("±èÇÏ´Ã");
		t1.setUserAge(10);
		
		TestBean t2 = new TestBean();
		t2.setUserId(2);
		t2.setUserPass("2222");
		t2.setUserName("±è¿µÁÖ");
		t2.setUserAge(20);
		
		TestBean t3 = new TestBean();
		t3.setUserId(3);
		t3.setUserPass("3333");
		t3.setUserName("±è¿µ´Ã");
		t3.setUserAge(30);
		
//		dao.insert_data(t1);
//		dao.insert_data(t2);
//		dao.insert_data(t3);
//		System.out.println("INSERTED!");
		
		dao.select_data(t2.getUserId());		
		System.out.println("SELECTED!");
		
		
		ctx.close();
	}

}
