package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.testBean;

public class MainClass {

	public static void main(String[] args) {
	
		// config.xml������ �޸𸮷� �ε��Ͽ� ��ü�� ������ �� container�� ����
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		//container�� �ִ� t1/t2 bean�� ������ �ͼ� t1/t2�� ����
		testBean t1 = (testBean) ctx.getBean("t1");
		System.out.println("t1 : "+t1);
		testBean t2 = ctx.getBean("t2",testBean.class);
		System.out.println("t2 : "+t2);
		testBean t3 = ctx.getBean("t2",testBean.class);
		System.out.println("t3 : "+t3);
		
		//container ����
		ctx.close();
	}
}
