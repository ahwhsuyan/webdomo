package data;

import java.sql.Date;

public class OrderFormData {
	private int id;
	private String book_name;
	private int buy_id;
	private String location;
	private int offer_id;
	private float price;
	private String state;
	private Date time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public int getBuy_id() {
		return buy_id;
	}
	public void setBuy_id(int buy_id) {
		this.buy_id = buy_id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getOffer_id() {
		return offer_id;
	}
	public void setOffer_id(int offer_id) {
		this.offer_id = offer_id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}
