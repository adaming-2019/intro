package fr.adaming.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public final static String URI = "jdbc:mysql://localhost:3306/db_ecommerce";
	public final static String USERNAME = "root";
	public final static String PASSWORD = "root";
	
	private static Connection cx = null;
	
	
	private DBUtil() throws ClassNotFoundException, SQLException {
		// 1. load driver (will load some static classes)
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2. create connection
		cx = DriverManager.getConnection(URI, USERNAME, PASSWORD);
		
	}
	
	
	 // static method to create instance of Singleton class 
    public static Connection getCx() throws ClassNotFoundException, SQLException 
    { 
        if (cx == null) {
        	DBUtil db = new DBUtil();
        }
        return cx; 
    } 
	
	
	
	
	
	
}
