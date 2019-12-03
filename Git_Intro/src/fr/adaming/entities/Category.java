package fr.adaming.entities;

public class Category {

	// Déclaration des attributs
	private int id;
	private String name;
	private String picture;
	private String description;
	
	// Constructeurs vide et non-vides
	public Category() {
		super();
	}

	public Category(int id) {
		super();
		this.id = id;
	}

	public Category(String name, String picture, String description) {
		super();
		this.name = name;
		this.picture = picture;
		this.description = description;
	}

	public Category(int id, String name, String picture, String description) {
		super();
		this.id = id;
		this.name = name;
		this.picture = picture;
		this.description = description;
	}

	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	// Autres méthodes
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", picture=" + picture + ", description=" + description + "]";
	}
	
	
	
	
	
	
}
