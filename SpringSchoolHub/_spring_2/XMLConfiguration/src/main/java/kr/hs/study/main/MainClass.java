package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 obj1 = ctx.getBean("t1",TestBean1.class);
		System.out.println("obj1 : "+obj1);
		
//		TestBean1 obj2 = ctx.getBean("t1",TestBean1.class);
//		System.out.println("obj2 : "+obj2);
//		
//		TestBean1 obj3 = ctx.getBean("t1",TestBean1.class);
//		System.out.println("obj3 : "+obj3);
		
		TestBean2 obj2 = ctx.getBean("t2",TestBean2.class);
		System.out.println("obj2 : "+obj2);
		
	}

}
