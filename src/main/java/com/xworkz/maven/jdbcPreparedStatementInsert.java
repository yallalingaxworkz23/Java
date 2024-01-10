package com.xworkz.maven;
// adding multipal tables inserting with out multipling inseriting methods  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcPreparedStatementInsert {
	
	public jdbcPreparedStatementInsert() {
		
	}
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
		String prepadequary="INSERT INTO Location(id,name,city,state,pincode) VALUES(?,?,?,?,?)";
		//String prepadequary1="insert into StubentInfo(id,name,fname,mname,gender,place,pincode) values(?,?,?,?,?,?,?)";
		Connection con=null;
		PreparedStatement prestat=null;
		try {
			 con= DriverManager.getConnection(url,username,password);
			 prestat= con.prepareStatement(prepadequary);
			
			prestat.setInt(1,10);
			prestat.setString(2, "manja");
			prestat.setString(3, "kadapa");
			prestat.setString(4, "telengana");
			prestat.setInt(5, 00000);
			prestat.execute();
			
			prestat.setInt(1,101);
			prestat.setString(2, "sanja");
			prestat.setString(3, "karnul");
			prestat.setString(4, "andhra");
			prestat.setInt(5, 666);
			prestat.execute();
			
			prestat.setInt(1,187);
			prestat.setString(2, "Lion");
			prestat.setString(3, "King");
			prestat.setString(4, "Jungle");
			prestat.setInt(5, 3630);
			prestat.execute();
			
//			howm work
			
			prestat.setInt(1,101);
			prestat.setString(2, "Tiger");
			prestat.setString(3, "Queen");
			prestat.setString(4, "Jungle");
			prestat.setInt(5, 1234);
			prestat.execute();
			

			prestat.setInt(1,102);
			prestat.setString(2, "Monkey");
			prestat.setString(3, "Intelegence");
			prestat.setString(4, "Jungle");
			prestat.setInt(5, 12345);
			prestat.execute();
			

			prestat.setInt(1,103);
			prestat.setString(2, "Elephant");
			prestat.setString(3, "BigBoy");
			prestat.setString(4, "Jungle");
			prestat.setInt(5, 123456);
			prestat.execute();
			

			prestat.setInt(1,104);
			prestat.setString(2, "Cat");
			prestat.setString(3, "smart");
			prestat.setString(4, "Jungle");
			prestat.setInt(5, 1234567);
			prestat.execute();
			

			prestat.setInt(1,105);
			prestat.setString(2, "Dog");
			prestat.setString(3, "Smart");
			prestat.setString(4, "Jungle");
			prestat.setInt(5, 12345678);
			prestat.execute();
			

			prestat.setInt(1,106);
			prestat.setString(2, "Lenvo");
			prestat.setString(3, "Germany");
			prestat.setString(4, "online");
			prestat.setInt(5, 12345678);
			prestat.execute();
			

			prestat.setInt(1,107);
			prestat.setString(2, "Man");
			prestat.setString(3, "Living");
			prestat.setString(4, "Earth");
			prestat.setInt(5, 123456789);
			prestat.execute();
			

			prestat.setInt(1,108);
			prestat.setString(2, "Cobra");
			prestat.setString(3, "Snake");
			prestat.setString(4, "Earth");
			prestat.setInt(5, 1234567810);
			prestat.execute();


			prestat.setInt(1,109);
			prestat.setString(2, "Ant");
			prestat.setString(3, "Small Animal");
			prestat.setString(4, "Earth");
			prestat.setInt(5, 123456789);
			prestat.execute();
			

			prestat.setInt(1,110);
			prestat.setString(2, "Fish");
			prestat.setString(3, "Water Animal");
			prestat.setString(4, "Ocean");
			prestat.setInt(5, 1234567819);
			prestat.execute();


			
			System.out.println("quary is excuated..");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(con != null && prestat != null) {
			
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				prestat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
		}
		
	}
//	do close foa all requared

}
