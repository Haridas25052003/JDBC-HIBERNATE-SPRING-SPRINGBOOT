package com.model;

public class MenuItem {

	private int itemId;
	private String name;
	private double price;
	private String category;
	private  boolean availability;
	@Override
	public String toString() {
		return "MenuItem [itemId=" + itemId + ", name=" + name + ", price=" + price + ", category=" + category
				+ ", availability=" + availability + "]";
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}	
}
