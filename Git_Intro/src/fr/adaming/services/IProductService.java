package fr.adaming.services;

import java.util.List;

import fr.adaming.entities.Category;
import fr.adaming.entities.Product;

public interface IProductService {
	
	public int add(Product p);
	
	public int delete(Product p);
	
	public int modify(Product p);
	
	public Product getById(int id_product);
	
	public List<Product> getAll();
	
	public List<Product> getByCategory(Category c);

	public List<Product> getByKeyWord(String ... args);  // can put any number of keywords
	
}
