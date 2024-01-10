package com.xworkz.maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcAddharPreparedStatmentUpdate {

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
		
		String Quary1="update Adddhar set place=? ";
		String Quary2="update Adddhar set place=? where name=? ";
		String Quary3="update Adddhar set name=? where Fname=? ";
		
		Connection conn=null;
		 PreparedStatement pre=null;
		try {
			 conn=DriverManager.getConnection(url, username, password);
			 pre=conn.prepareStatement(Quary1);
			 pre.setString(1, "Manvi");
			// pre.setString(2, "yallalinga");
			 pre.executeUpdate();
			 
			 PreparedStatement pre1=conn.prepareStatement(Quary2);
			 pre1.setString(1, "Raichur");
			 pre1.setString(2, "kumar");
			 pre1.executeUpdate();
			 
			 PreparedStatement pre2=conn.prepareStatement(Quary2);
			 pre2.setString(1, "Shivmuga");
			 pre2.setString(2, "rakesh");
			 pre2.executeUpdate();
			 
			 PreparedStatement pre3=conn.prepareStatement(Quary2);
			 pre3.setString(1, "Ballare");
			 pre3.setString(2, "prakesh");
			 pre3.executeUpdate();
			 
			 PreparedStatement pre4=conn.prepareStatement(Quary3);
			 pre4.setString(1, "YALLALINGA");
			 pre4.setString(2, "hanumantha");
			 pre4.executeUpdate();
			 
			 PreparedStatement pre5=conn.prepareStatement(Quary3);
			 pre5.setString(1, "KANAKA");
			 pre5.setString(2, "gopal");
			 pre5.executeUpdate();
			 
			 System.out.println("Addhar is update....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if(conn != null && pre != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("connection is methods. is closed..");
				e.printStackTrace();
			}
			try {
				pre.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("prepared statement is closed...");
				e.printStackTrace();
			}
			
			}
		}

	}

}
