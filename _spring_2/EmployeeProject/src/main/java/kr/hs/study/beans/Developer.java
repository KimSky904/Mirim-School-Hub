package kr.hs.study.beans;

public class Developer implements Employee {

	private String name;
	private int time_checkin;
	private int time_checkout;
	
	public Developer() {}
	public void Checkin() {
		System.out.println(name+" "+time_checkin+"시 출근");
	}

	public void Checkout() {
		System.out.println(name+" "+time_checkout+"시 퇴근");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTime_checkin() {
		return time_checkin;
	}
	public void setTime_checkin(int time_checkin) {
		this.time_checkin = time_checkin;
	}
	public int getTime_checkout() {
		return time_checkout;
	}
	public void setTime_checkout(int time_checkout) {
		this.time_checkout = time_checkout;
	}

	
	
}
