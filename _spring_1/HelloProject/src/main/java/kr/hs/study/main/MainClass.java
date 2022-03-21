package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Hello;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Hello h1 = ctx.getBean("h1",HelloWorldKo.class);
		say_Method(h1);
		
		ctx.close();
		
	}
	public static void say_Method(Hello hello) {
		hello.sayHello();
	}
	
}
