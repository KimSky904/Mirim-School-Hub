package kr.hs.study.beans;

public class BasketBall implements Sports{
	int players;
	int stopCount;
	public void play() {
		// TODO Auto-generated method stub
		System.out.print("�󱸴� "+players+"���� ������ ����ϸ� ");
	}
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(stopCount+"���Ͱ� �Ǹ� �����.");
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
