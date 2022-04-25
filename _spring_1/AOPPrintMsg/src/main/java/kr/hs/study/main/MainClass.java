package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.IPrintMsg;
import kr.hs.study.beans.PrintMsg;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		IPrintMsg p1 = ctx.getBean("t1",IPrintMsg.class);
		p1.sayHello1();
		p1.sayHello2();
	}

}
