package kr.hs.study.beans;

public class BaseBall implements Sports{

	int players;
	int stopCount;
	
	public BaseBall() {}
	public BaseBall(int players,int stopCount) {
		this.players = players;
		this.stopCount = stopCount;
	}
	public void play() {
		// TODO Auto-generated method stub
		System.out.print("�߱��� "+players+"���� ������ ����ϸ� ");
	}
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(stopCount+"ȸ�� �Ǹ� �����.");
	}
	public int getPlayers() {
		return players;
	}
	public void setPlayers(int players) {
		this.players = players;
	}
	public int getStopCount() {
		return stopCount;
	}
	public void setStopCount(int stopCount) {
		this.stopCount = stopCount;
	}
	
	

}
