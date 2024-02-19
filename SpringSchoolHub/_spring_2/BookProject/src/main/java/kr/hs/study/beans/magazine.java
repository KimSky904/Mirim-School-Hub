package kr.hs.study.beans;

public class magazine implements Book {
	private String writerName;
	private String bookName;
	private int price;
	public void buy() {
		System.out.println(writerName+"의 잡지 "+bookName+"를 "+price+"에 산다.");
	}
	public void sell() {
		System.out.println(writerName+"의 잡지 "+bookName+"를 "+price+"에 판다.");
	}
	public void create() {
		System.out.println(writerName+"의 잡지 "+bookName+"를 "+price+"에 만든다.");
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
