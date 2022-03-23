package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.magazine;
import kr.hs.study.beans.novel;
import kr.hs.study.beans.poet;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		Book b1 = ctx.getBean("b1",novel.class);
		Book b2 = ctx.getBean("b2",poet.class);
		Book b3 = ctx.getBean("b3",magazine.class);
		
		b1.buy();
		b2.buy();
		b3.buy();
		
	}

}
