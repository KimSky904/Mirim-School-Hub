package kr.hs.study.beans;

public class TestBean2 {
	private int data1;
	private double data2;
	private DataBean2 data3;
	private DataBean2 data4;
	
	public TestBean2() {
		System.out.println("TestBean2 기본생성자" );
	}
	
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public double getData2() {
		return data2;
	}
	public void setData2(double data2) {
		this.data2 = data2;
	}
	public DataBean2 getData3() {
		return data3;
	}
	public void setData3(DataBean2 data3) {
		this.data3 = data3;
	}
	public DataBean2 getData4() {
		return data4;
	}
	public void setData4(DataBean2 data4) {
		this.data4 = data4;
	}
	
	public void Print() {
		System.out.println("data1 : "+data1);
		System.out.println("data2 : "+data2);
		System.out.println("data3 : "+data3);
		System.out.println("data4 : "+data4+"\n");
	}
	
	
}
