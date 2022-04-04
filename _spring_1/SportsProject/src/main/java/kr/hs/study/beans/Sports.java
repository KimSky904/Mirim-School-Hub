package kr.hs.study.beans;

public interface Sports {
	public void play();
	public void stop();
	// 출력
	/*
	 * 야구는 "9명"의 선수가 경기하며 "9회"가 되면 멈춘다 (생성자 DI)
	 * 배구는 "6명"의 선수가 경기하며 "3"세트를 먼저 획득하면 멈춘다. (Setter DI)
	 * 농구는 "5명"의 선수가 경기하며 "4"쿼터가 되면 멈춘다. (아무거나 DI)
	 */
}