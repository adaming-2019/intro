package fr.adaming.services;

import java.util.List;

import fr.adaming.dao.IProductDao;
import fr.adaming.dao.ProductDao;
import fr.adaming.entities.Category;
import fr.adaming.entities.Product;

public class ProductService implements IProductService {

	private IProductDao pDao = new ProductDao();
	
	@Override
	public int add(Product p) {
		if(p.getCategory() == null){
			System.out.println("(add) product must have a category to be added");
			return 0;
		}
		if(p.getCategory().getId() == 0){
			System.out.println("(add) product category must have an id (id=0 here)");
			return 0;
		}
		return pDao.add(p);
	}

	@Override
	public int delete(Product p) {
		int id = p.getId();
		if(id == 0){  // if id=0 (default value), product has no id => cannot delete it
			System.out.println("(delete) product must have an id");
		}
		return pDao.delete(id);
	}

	@Override
	public int modify(Product p) {
		if(p.getId() == 0){  // if id=0 (default value), product has no id => cannot delete it
			System.out.println("(modify) product must have an id");
			return 0;
		}
		return pDao.modify(p);
	}

	@Override
	public Product getById(int id_product) {
		return pDao.getById(id_product);
	}

	@Override
	public List<Product> getAll() {
		return pDao.getAll();
	}
	
	@Override
	public List<Product> getByCategory(Category c) {
		if(c.getId() == 0){  // if id=0 (default value), category has no id => cannot get it
			System.out.println("(getByCategory) product category must have an id");
			return null;
		}
		return pDao.getByCategory(c.getId());
	}

	@Override
	public List<Product> getByKeyWord(String... args) {
		if(args.length <= 0) {
			System.out.println("(getByKeyWord) should have at least one keyword as parameter (empty params)");
			return null;
		}
		return pDao.getByKeyWord(args);
	}

}
