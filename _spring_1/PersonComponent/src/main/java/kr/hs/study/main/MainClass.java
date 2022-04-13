package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestBean t1 = ctx.getBean(TestBean.class);
		System.out.println("1. 이름 : "+t1.getP1().getName()+", 나이 : "+t1.getP1().getAge());
		System.out.println("2. 이름 : "+t1.getP2().getName()+", 나이 : "+t1.getP2().getAge());
		
		ctx.close();
	}
}
