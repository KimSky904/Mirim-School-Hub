package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 t1 = ctx.getBean("t1",TestBean1.class);
		System.out.println("t1 : "+t1);
		System.out.println("data1 : "+t1.getData1());
		System.out.println("data2 : "+t1.getData2());
		System.out.println("data3 : "+t1.getData3()+"\n");
		
		TestBean1 t2 = ctx.getBean("t2",TestBean1.class);
		System.out.println("t2 : "+t2);
		System.out.println("data1 : "+t2.getData1());
		System.out.println("data2 : "+t2.getData2());
		System.out.println("data3 : "+t2.getData3()+"\n");
		
	}

}
