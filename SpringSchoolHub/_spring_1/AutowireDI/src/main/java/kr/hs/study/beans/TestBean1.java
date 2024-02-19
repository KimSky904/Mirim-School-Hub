package kr.hs.study.beans;

public class TestBean1 {
	private DataBean1 data1;
	private DataBean1 data2;
	private DataBean1 data3;
	
	public TestBean1() {
		System.out.println("TestBean1의 기본생성자");
	}
	public void Print() {
		System.out.println("data1 : "+data1);
		System.out.println("data2 : "+data2);
		System.out.println("data3 : "+data3+"\n");
	}
	public DataBean1 getData1() {
		return data1;
	}
	public void setData1(DataBean1 data1) {
		this.data1 = data1;
	}
	public DataBean1 getData2() {
		return data2;
	}
	public void setData2(DataBean1 data2) {
		this.data2 = data2;
	}
	public DataBean1 getData3() {
		return data3;
	}
	public void setData3(DataBean1 data3) {
		this.data3 = data3;
	}
}
