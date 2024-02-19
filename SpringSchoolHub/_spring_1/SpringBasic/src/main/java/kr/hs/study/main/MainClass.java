package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.testBean;

public class MainClass {

	public static void main(String[] args) {
	
		// config.xml파일을 메모리로 로딩하여 객체를 생성한 후 container에 보관
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		//container에 있는 t1/t2 bean을 가지고 와서 t1/t2에 넣음
		testBean t1 = (testBean) ctx.getBean("t1");
		System.out.println("t1 : "+t1);
		testBean t2 = ctx.getBean("t2",testBean.class);
		System.out.println("t2 : "+t2);
		testBean t3 = ctx.getBean("t2",testBean.class);
		System.out.println("t3 : "+t3);
		
		//container 종료
		ctx.close();
	}
}
