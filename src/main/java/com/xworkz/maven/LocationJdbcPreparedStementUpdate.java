package com.xworkz.maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LocationJdbcPreparedStementUpdate {
	
	public static void main(String[] args) {
		    
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/mevan";
		String username="root";
		String password="Xworkzodc@123";
		
		String updateQuery ="update location set city=? where name=?";
		try {
			Connection conn =DriverManager.getConnection(url, username, password);
             PreparedStatement prep= conn.prepareStatement(updateQuery);	
             prep.setString(1,"New York");
             prep.setString(2, "manvi");
             prep.executeUpdate();
             System.out.println("location is updated...");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
