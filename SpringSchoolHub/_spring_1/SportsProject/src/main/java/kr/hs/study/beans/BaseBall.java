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
		System.out.print("야구는 "+players+"명의 선수가 경기하며 ");
	}
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(stopCount+"회가 되면 멈춘다.");
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
