package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;

public class TestBean2 {
	
//  �⺻������ autowired �Ұ�
//	@Autowired
//	private int a;
	
	@Autowired
	@Qualifier("d1") //�̸��� d1�� bean�� ã�Ƽ� data1�� �ڵ������ض�
	private DataBean1 data1; //container�� DataBean1Ÿ���� ��ü(bean)�� ������ ��� �ڵ�����
	@Autowired
	@Qualifier("d2")
	private DataBean2 data2; //container�� DataBean2Ÿ���� ��ü(bean)�� ������ ��� �ڵ�����
	
	
	public TestBean2() {}
	
	
	public TestBean2(DataBean1 data1, DataBean2 data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	public DataBean1 getData1() {
		return data1;
	}
	public DataBean2 getData2() {
		return data2;
	}
	
	
	
}