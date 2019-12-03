package fr.adaming.entities;

import java.util.List;

import fr.adaming.services.ProductService;

public class TestProduct {
	
	public static void main(String[] args) {
		System.out.println("coucou");
		int res = 0;
		ProductService pService = new ProductService();
		
		
		// create some products
		Product p = new Product("test, product", "ceci est le produit test", 102.5, 10, true, "/img/img1.png");
		Product p2 = new Product("test, pasproduct", "ceci est le produit test 2", 24.99, 100, false, "/img/img2.png");
		Category cat = new Category();
		cat.setId(1);
		p.setCategory(cat);
		cat.setId(2);
		p2.setCategory(cat);
		
		// 1. test add product
//		res = pService.add(p2);
//		printRes(res, "add p");
		
		// 2. test delete product
//		p.setId(1);
//		res = pService.delete(p);
//		printRes(res, "del p");
		
		// 3. test modify
		System.out.println("3");
		p.setId(3);
		res = pService.modify(p);
		printRes(res, "modify p 3");
		
		// 4. test getById
		System.out.println("4");
		Product p3 = pService.getById(3);
		System.out.println(p3);
		
		// 5. test get all
		System.out.println("5");
		List<Product> lp = pService.getAll();
		for(Product pp : lp){
			System.out.println(pp);
		}
		
		// 6. test getByCategory
		System.out.println("6");
		Category cc = new Category(3);
		lp = pService.getByCategory(cc);
		for(Product pp : lp){
			System.out.println(pp);
		}
		
		// 7. test getByKeyWord
		System.out.println("7");
		lp = pService.getByKeyWord("test", "product");
		for(Product pp : lp){
			System.out.println(pp);
		}
		
	}
	
	
	public static void printRes(int res, String msg){
		if(res == 0){
			System.out.println("FAILED : " + msg + " with res = " + res);
		} else {
			System.out.println("SUCESS : " + msg + " with res = " + res);
		}
	}
}
