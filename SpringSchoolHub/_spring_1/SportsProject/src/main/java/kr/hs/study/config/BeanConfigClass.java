package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.BaseBall;
import kr.hs.study.beans.BasketBall;
import kr.hs.study.beans.VollyBall;

@Configuration
public class BeanConfigClass {
	@Bean
	public BaseBall s1() {
		BaseBall b = new BaseBall(9,9);
		return b;
	}
	
	@Bean
	public VollyBall s2() {
		VollyBall b = new VollyBall();
		b.setPlayers(6);
		b.setStopCount(3);
		return b;
	}
	
	@Bean
	public BasketBall s3() {
		BasketBall b = new BasketBall();
		b.setPlayers(5);
		b.setStopCount(4);
		return b;
	}
	

	
	
}
