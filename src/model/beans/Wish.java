package model.beans;

public class Wish {
	int no;
	String id;
	int goods;
	String inputdate;
	
	public Wish(int no, String id, int goods, String inputdate) {
		super();
		this.no = no;
		this.id = id;
		this.goods = goods;
		this.inputdate = inputdate;
	}

	public Wish() {
		super();
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getGoods() {
		return goods;
	}

	public void setGoods(int goods) {
		this.goods = goods;
	}

	public String getInputdate() {
		return inputdate;
	}

	public void setInputdate(String inputdate) {
		this.inputdate = inputdate;
	}
	
	
	

}
