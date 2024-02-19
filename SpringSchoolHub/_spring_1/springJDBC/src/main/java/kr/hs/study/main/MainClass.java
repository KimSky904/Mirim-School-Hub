package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//TestDAO��������
		TestDAO dao = ctx.getBean(TestDAO.class);
		//TestBean��ü bean1�� ���� 100,spring100 �ֱ�
		TestBean bean1 = new TestBean();
		bean1.setData1(100);
		bean1.setData2("spring100");
		//TestBean��ü bean2�� ���� 200,spring200 �ֱ�
		TestBean bean2 = new TestBean();
		bean2.setData1(200);
		bean2.setData2("spring200");
		//insert_data ȣ��
//		dao.insert_data(bean1);
//		dao.insert_data(bean2);
//		System.out.println("Inserted!!");
		
		
		
		//Update
//		TestBean bean3 = new TestBean();
//		bean3.setData1(100);
//		bean3.setData2("testtest");
//		dao.update_data(bean3);
//		System.out.println("Updated!!");
		
		//Delete
		//int id = 100;
		//dao.delete_data(id);
		//System.out.println("Deleted!!");
		
		//Select
		List<TestBean> list = dao.select_data();
		for(TestBean bean : list) {
			System.out.println("data1 : "+bean.getData1()+"  data2 : "+bean.getData2());
		}
		
		
		ctx.close();
	}

}