package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 xml1 = ctx1.getBean(TestBean1.class);
		System.out.println("xml1[data3] : "+xml1.getData3());
		System.out.println("xml1[data4] : "+xml1.getData4());
		
		System.out.println("--------------------------------------------------------");
		TestBean2 xml2 = ctx1.getBean(TestBean2.class);
		System.out.println("xml2[data1] : "+xml2.getData1());
		System.out.println("xml2[data2] : "+xml2.getData2());
		System.out.println("xml2[data3] : "+xml2.getData3());
		System.out.println("xml2[data4] : "+xml2.getData4()+"\n");
		
		
		ctx1.close();
		
		System.out.println("========================================================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestBean1 java1 = ctx2.getBean(TestBean1.class);
		System.out.println("java1[data3] : "+java1.getData3());
		System.out.println("java1[data4] : "+java1.getData4());
		System.out.println("--------------------------------------------------------");
		TestBean2 java2 = ctx2.getBean(TestBean2.class);
		System.out.println("java2[data1] : "+java2.getData1());
		System.out.println("java2[data2] : "+java2.getData2());
		System.out.println("java2[data3] : "+java2.getData3());
		System.out.println("java2[data4] : "+java2.getData4()+"\n");
		ctx2.close();
		
		
	}
}
