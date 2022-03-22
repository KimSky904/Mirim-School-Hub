package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Publisher;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		Designer designer = ctx.getBean("designer",Designer.class);
		Developer developer = ctx.getBean("developer",Developer.class);
		Publisher publisher = ctx.getBean("publisher",Publisher.class);
		
		designer.Checkin();
		designer.Checkout();
		
		developer.Checkin();
		developer.Checkout();
		
		publisher.Checkin();
		publisher.Checkout();
		
	}

}
