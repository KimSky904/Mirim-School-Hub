package kr.hs.study.beans;

public class SchoolBean {
	String name;
	int kuk;
	int eng;
	int mat;
	int spr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKuk() {
		return kuk;
	}
	public void setKuk(int kuk) {
		this.kuk = kuk;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getSpr() {
		return spr;
	}
	public void setSpr(int spr) {
		this.spr = spr;
	}
	public int getHap() {
		return kuk+eng+mat+spr;
	}
	
}
