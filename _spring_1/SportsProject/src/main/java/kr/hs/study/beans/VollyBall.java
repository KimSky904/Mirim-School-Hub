package kr.hs.study.beans;

public class VollyBall implements Sports{

	int players;
	int stopCount;
	public void play() {
		// TODO Auto-generated method stub
		System.out.print("�豸�� "+players+"���� ������ ����ϸ� ");
	}
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(stopCount+"��Ʈ�� ���� ȹ���ϸ� �����.");
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
