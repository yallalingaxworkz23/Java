package com.xworkz.maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcAddharPreparedStatementInsert {

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
		
		
		String insertQuary="insert into Adddhar(id,name,Fname,mname,address,place,pnumber,pincode) values(?,?,?,?,?,?,?,?)";
		
		Connection conn =null;
		PreparedStatement prep=null;
		try {
		 conn=DriverManager.getConnection(url, username, password);
		  prep= conn.prepareStatement(insertQuary);
		 prep.setInt(1, 101);
		 prep.setString(2, "yallalinga");
		 prep.setString(3, "hanumantha");
		 prep.setString(4, "roopa");
		 prep.setString(5, "jayanagar");
		 prep.setString(6, "manvi");
		 prep.setInt(7, 1239);
		 prep.setInt(8,5843);
		 prep.execute();
		 
		 prep.setInt(1, 102);
		 prep.setString(2, "kumar");
		 prep.setString(3, "hanumantha");
		 prep.setString(4, "roopa");
		 prep.setString(5, "apmc");
		 prep.setString(6, "manvi");
		 prep.setInt(7, 1234);
		 prep.setInt(8,5842);
		 prep.execute();
		 
		 prep.setInt(1, 103);
		 prep.setString(2, "kanaka");
		 prep.setString(3, "gopal");
		 prep.setString(4, "mallama");
		 prep.setString(5, "nasalapura");
		 prep.setString(6, "manvi");
		 prep.setInt(7, 1219);
		 prep.setInt(8,1843);
		 prep.execute();
		 
		 prep.setInt(1, 104);
		 prep.setString(2, "pandu");
		 prep.setString(3, "gopal");
		 prep.setString(4, "mallama");
		 prep.setString(5, "nasalapura");
		 prep.setString(6, "manvi");
		 prep.setInt(7, 1139);
		 prep.setInt(8,5822);
		 prep.execute();
		 
		 prep.setInt(1, 104);
		 prep.setString(2, "akash cv");
		 prep.setString(3, "manjunatha");
		 prep.setString(4, "manjula");
		 prep.setString(5, "guurpura");
		 prep.setString(6, "chaikamangalur");
		 prep.setInt(7, 1119);
		 prep.setInt(8,5663);
		 prep.execute();
		 
		 prep.setInt(1, 105);
		 prep.setString(2, "rakesh");
		 prep.setString(3, "karthik");
		 prep.setString(4, "divya");
		 prep.setString(5, "sampankatta");
		 prep.setString(6, "thirthahali");
		 prep.setInt(7, 1889);
		 prep.setInt(8,8883);
		 prep.execute();
		 
		 prep.setInt(1, 106);
		 prep.setString(2, "prakesh");
		 prep.setString(3, "lokesh");
		 prep.setString(4, "ruku");
		 prep.setString(5, "thanda");
		 prep.setString(6, "ballari");
		 prep.setInt(7, 4449);
		 prep.setInt(8,9090);
		 prep.execute();
		 
		 prep.setInt(1, 107);
		 prep.setString(2, "anvith");
		 prep.setString(3, "manjunatha");
		 prep.setString(4, "sushalishi");
		 prep.setString(5, "konankunti");
		 prep.setString(6, "thirthalli");
		 prep.setInt(7, 1111);
		 prep.setInt(8,2222);
		 prep.execute();
		 
		 prep.setInt(1, 108);
		 prep.setString(2, "roopa");
		 prep.setString(3, "basangouda");
		 prep.setString(4, "mahadevamma");
		 prep.setString(5, "konkal");
		 prep.setString(6, "yeadgeri");
		 prep.setInt(7, 1111);
		 prep.setInt(8,888);
		 prep.execute();
		 
		 prep.setInt(1, 109);
		 prep.setString(2, "hanumantha");
		 prep.setString(3, "venkobba");
		 prep.setString(4, "shankrama");
		 prep.setString(5, "nasalapura");
		 prep.setString(6, "manvi");
		 prep.setInt(7, 5555);
		 prep.setInt(8,777);
		 prep.execute();
		 
		 prep.setInt(1, 110);
		 prep.setString(2, "srivasta");
		 prep.setString(3, "srinivas");
		 prep.setString(4, "nirmala");
		 prep.setString(5, "soutkamp");
		 prep.setString(6, "manvi");
		 prep.setInt(7, 777);
		 prep.setInt(8,555);
		 prep.execute();

		 
		 System.out.println("Inserted the valuess........");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(conn != null && prep != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("connection is closed...");
				e.printStackTrace();
			}
			
			try {
				prep.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("preparedstatement is closed...");
				e.printStackTrace();
			}
			}
			
		}
	}
}
