package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.BaseBall;
import kr.hs.study.beans.BasketBall;
import kr.hs.study.beans.Sports;
import kr.hs.study.beans.VollyBall;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		Sports s1 = ctx.getBean("s1",BaseBall.class);
		s1.play();
		s1.stop();
		
		Sports s2 = ctx.getBean("s2",VollyBall.class);
		s2.play();
		s2.stop();
		
		Sports s3 = ctx.getBean("s3",BasketBall.class);
		s3.play();
		s3.stop();
		
		ctx.close();
	}

}
