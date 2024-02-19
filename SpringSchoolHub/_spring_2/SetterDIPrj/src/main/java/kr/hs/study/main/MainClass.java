package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean t1 = ctx.getBean("t1",TestBean.class);
		t1.Print();
		
		TestBean2 t2 = ctx.getBean("t2",TestBean2.class);
		//t2.Print();
		System.out.println("data1 : "+t2.getData1());
		System.out.println("data2 : "+t2.getData2());
		System.out.println("data3 : "+t2.getData3());
		System.out.println("data4 : "+t2.getData4());
		
	}
}
