package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean {
	@Autowired
	@Qualifier("d1")
	private Person p1;
	@Autowired
	@Qualifier("d2")
	private Person p2;
	
	public TestBean() {}
	public TestBean(Person p1, Person p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Person getP1() {
		return p1;
	}

	public Person getP2() {
		return p2;
	}
	
	
}
