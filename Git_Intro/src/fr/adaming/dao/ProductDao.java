package fr.adaming.dao;

import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.adaming.entities.Category;
import fr.adaming.entities.Product;
import fr.adaming.utils.DBUtil;

public class ProductDao implements IProductDao {
	
	private Connection cx;
	public PreparedStatement ps = null;
	
	public ProductDao(){
		try {
			this.cx = DBUtil.getCx();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int add(Product p) {
		
		String req = "INSERT INTO products (designation_p, description_p, price_p, quantity_p, picture_p, category_id)"
				+ "VALUES (?,?,?,?,?,?)";
		try {
			ps = cx.prepareStatement( req );
			
			ps.setString(1, p.getDesignation());
			ps.setString(2, p.getDescription());
			ps.setDouble(3, p.getPrice());
			ps.setInt(4, p.getQuantity());
			ps.setString(5, p.getPicture());
			ps.setInt(6, p.getCategory().getId());
			
			return ps.executeUpdate();
		} catch( SQLException e ) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int id) {
		String req = "DELETE FROM products WHERE id_p=?";
		try {
			ps = cx.prepareStatement( req );
			ps.setInt(1, id);
			return ps.executeUpdate();
		} catch( SQLException e ) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int modify(Product p) {
		String req = "UPDATE products SET designation_p=?, description_p=?, price_p=?,"
				+ " quantity_p=?, picture_p=?, category_id=?"
				+ " WHERE id_p = ?";
		try {
			ps = cx.prepareStatement( req );
			
			ps.setString(1, p.getDesignation());
			ps.setString(2, p.getDescription());
			ps.setDouble(3, p.getPrice());
			ps.setInt(4, p.getQuantity());
			ps.setString(5, p.getPicture());
			ps.setInt(6, p.getCategory().getId());
			ps.setInt(7, p.getId());
			
			return ps.executeUpdate();
		} catch( SQLException e ) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Product getById(int id_product) {
		String req = "SELECT * FROM products WHERE id_p=?";
		try {
			PreparedStatement ps = cx.prepareStatement( req );
			ps.setInt(1, id_product);
			
			ResultSet res 	= ps.executeQuery();
			// il faut penser a deplacer le curseur du resultSet
			if( res.next() ) {
				int id					= res.getInt("id_p");
				String designation 		= res.getString("designation_p");
				String description 		= res.getString("description_p");
				double price 			= res.getDouble("price_p");
				int quantity 			= res.getInt("quantity_p");
				String picture 			= res.getString("picture_p");
				Category cat 			= new Category(res.getInt("category_id"));
				Product p = new Product(id, designation, description, price, quantity, false, picture);
				p.setCategory(cat);
				
				return p;
			}
			return null;
		} catch( SQLException e ) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> getAll() {
		
		try{
			String req = "SELECT * FROM products";
			PreparedStatement ps = cx.prepareStatement( req );
			
			ResultSet res 	= ps.executeQuery();
			
			List<Product> arr = new ArrayList<Product>();
			
			while( res.next() ){
				int id					= res.getInt("id_p");
				String designation 		= res.getString("designation_p");
				String description 		= res.getString("description_p");
				double price 			= res.getDouble("price_p");
				int quantity 			= res.getInt("quantity_p");
				String picture 			= res.getString("picture_p");
				Category cat 			= new Category(res.getInt("category_id"));
				Product p = new Product(id, designation, description, price, quantity, false, picture);
				p.setCategory(cat);
				arr.add( p );
			}
			return arr;
			
		} catch( SQLException e ) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public List<Product> getByCategory(int id_category) {
		String req = "SELECT * FROM products WHERE category_id=?";
		try {
			PreparedStatement ps = cx.prepareStatement( req );
			ps.setInt(1, id_category);
			
			ResultSet res 	= ps.executeQuery();
			
			List<Product> arr = new ArrayList<Product>();
			
			while( res.next() ){
				int id					= res.getInt("id_p");
				String designation 		= res.getString("designation_p");
				String description 		= res.getString("description_p");
				double price 			= res.getDouble("price_p");
				int quantity 			= res.getInt("quantity_p");
				String picture 			= res.getString("picture_p");
				Category cat 			= new Category(res.getInt("category_id"));
				Product p = new Product(id, designation, description, price, quantity, false, picture);
				p.setCategory(cat);
				arr.add( p );
			}
			return arr;
		} catch( SQLException e ) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> getByKeyWord(String... args) {
		String req = "SELECT * FROM products WHERE designation_p LIKE ?";
		
		for(int i = 1; i<args.length; i++){
			req += " OR ?";
		}
		
		System.out.println(req);
		
		try {
			PreparedStatement ps = cx.prepareStatement( req );
			for(int i = 0; i<args.length; i++){
				ps.setString(i+1, "%"+args[i]+"%");
			}
			
			ResultSet res 	= ps.executeQuery();
			
			List<Product> arr = new ArrayList<Product>();
			
			while( res.next() ){
				int id					= res.getInt("id_p");
				String designation 		= res.getString("designation_p");
				String description 		= res.getString("description_p");
				double price 			= res.getDouble("price_p");
				int quantity 			= res.getInt("quantity_p");
				String picture 			= res.getString("picture_p");
				Category cat 			= new Category(res.getInt("category_id"));
				Product p = new Product(id, designation, description, price, quantity, false, picture);
				p.setCategory(cat);
				arr.add( p );
			}
			return arr;
		} catch( SQLException e ) {
			e.printStackTrace();
		}
		return null;
	}

}
