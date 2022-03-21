package hs.kr.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import hs.kr.study.beans.TestBean1;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("hs/kr/study/config/config.xml");
		
//		TestBean1 t1 = ctx.getBean("t1",TestBean1.class); //출력
//		TestBean1 t2 = ctx.getBean("t1",TestBean1.class); 
//		TestBean1 t3 = ctx.getBean("t2",TestBean1.class); //출력
//		TestBean1 t4 = ctx.getBean("t2",TestBean1.class); //출력
		
		TestBean1 init = ctx.getBean("t3",TestBean1.class); 
		
//		System.out.println("t1 : "+t1);
//		System.out.println("t2 : "+t2);
//		System.out.println("t3 : "+t3);
//		System.out.println("t4 : "+t4);
		
		ctx.close();
	}
}
