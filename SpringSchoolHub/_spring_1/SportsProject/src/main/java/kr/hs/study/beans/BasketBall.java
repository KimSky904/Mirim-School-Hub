package kr.hs.study.beans;

public class BasketBall implements Sports{
	int players;
	int stopCount;
	public void play() {
		// TODO Auto-generated method stub
		System.out.print("농구는 "+players+"명의 선수가 경기하며 ");
	}
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(stopCount+"쿼터가 되면 멈춘다.");
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
