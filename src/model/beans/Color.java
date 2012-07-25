package model.beans;

public class Color {
	private int no;
	private int goods_no;
	private String color;
	
	
	public Color(int no, int goods_no, String color) {
		super();
		this.no = no;
		this.goods_no = goods_no;
		this.color = color;
	}


	
	public Color() {
		super();
	}



	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public int getGoods_no() {
		return goods_no;
	}


	public void setGoods_no(int goods_no) {
		this.goods_no = goods_no;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
}
