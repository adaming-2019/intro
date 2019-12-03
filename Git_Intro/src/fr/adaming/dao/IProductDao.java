package fr.adaming.dao;

import java.util.List;

import fr.adaming.entities.Product;

public interface IProductDao {
	
	public int add(Product p);
	
	public int delete(int id);
	
	public int modify(Product p);
	
	public Product getById(int id_product);
	
	public List<Product> getByCategory(int id_category);
	
	public List<Product> getAll();

	public List<Product> getByKeyWord(String ... args);  // can put any number of keywords
	
}
