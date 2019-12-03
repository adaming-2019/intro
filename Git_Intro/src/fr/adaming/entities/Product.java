package fr.adaming.entities;

public class Product {
	
	private int id;
	private String designation;
	private String description;
	private double price;
	private int quantity;
	private boolean selected;
	private String picture;
	
	
	
	
	
	public Product(int id) {
		super();
		this.id = id;
	}
	public Product(String designation, String description, double price, int quantity, boolean selected,
			String picture) {
		super();
		this.designation = designation;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.selected = selected;
		this.picture = picture;
	}
	public Product(int id, String designation, String description, double price, int quantity, boolean selected,
			String picture) {
		super();
		this.id = id;
		this.designation = designation;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.selected = selected;
		this.picture = picture;
	}
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	
	
	

}
