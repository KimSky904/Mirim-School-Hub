package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean3 obj1 = ctx1.getBean(TestBean3.class);
		System.out.println("data1 : "+obj1.getData1());
		System.out.println("data2 : "+obj1.getData2());
		System.out.println("data3 : "+obj1.getData3());
		System.out.println("data4 : "+obj1.getData4());
		
		ctx1.close();
		
		
	}

}
