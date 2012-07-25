package model.beans;

public class Size {
	
	private int no;
	private int goods_no;
	private String sized;
	
	
	public Size(int no, int goods_no, String sized) {
		super();
		this.no = no;
		this.goods_no = goods_no;
		this.sized = sized;
	}
	
	
	public Size() {
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
	public String getSized() {
		return sized;
	}
	public void setSized(String sized) {
		this.sized = sized;
	}
	
	
}
