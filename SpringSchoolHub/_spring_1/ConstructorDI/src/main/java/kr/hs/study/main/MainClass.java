package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		//�⺻������ ȣ��
		TestBean obj1 = ctx.getBean("t1",TestBean.class);
		obj1.dataPrn();
		
		//int�� �Ű����� 1�� �ִ� ������ ȣ��
		TestBean obj2 = ctx.getBean("t2",TestBean.class);
		obj2.dataPrn();
		
		//double�� �Ű����� 1�� �ִ� ������ ȣ��
		TestBean obj3 = ctx.getBean("t3",TestBean.class);
		obj3.dataPrn();
		
		//String�� �Ű����� 1�� �ִ� ������ ȣ��
		TestBean obj4 = ctx.getBean("t4",TestBean.class);
		obj4.dataPrn();
		
		TestBean obj5 = ctx.getBean("t5",TestBean.class);
		obj5.dataPrn();
		
		//������ 1
		TestBean2 obj6 = ctx.getBean("t6",TestBean2.class);
		obj6.dataPrn();
		
		//������ 2
		TestBean2 obj7 = ctx.getBean("t7",TestBean2.class);
		obj7.dataPrn();
		
		
		
		ctx.close();
		
	}
}