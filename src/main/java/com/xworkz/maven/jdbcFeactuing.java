package com.xworkz.maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class jdbcFeactuing {
	
	public jdbcFeactuing() {
		// TODO Auto-generated constructor stub
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
		String quary="Select * from Location where name='kopla'";
		String quary1="Select * from Location where name='manvi'";
		String quary2="Select * from Location where id=6";
		
		String studentquary="select * from StubentInfo where name='Kumar'";
		String studentquary1="select * from StubentInfo ";
		Connection conn=null;
		 Statement stat=null;
		 ResultSet res=null;
		try {
		 conn=DriverManager.getConnection(url,username, password);
		  stat= conn.createStatement();
		     res=  stat.executeQuery(quary);   
		      if(res.next()) {
		    	  System.out.println("Location name is ->"+ res.getString("name"));
		    	  System.out.println("Location city name is->"+ res.getString("City"));
		    	  System.out.println("Location state name is ->"+res.getString("state"));
		    	  System.out.println("Location pin code is ->"+res.getInt("pincode"));
		      }
		      System.out.println("============");
		      ResultSet res1=  stat.executeQuery(quary1);
		      if(res1.next()) {
		    	  System.out.println("Location name is ->"+ res1.getString("name"));
		    	  System.out.println("Location city name is->"+ res1.getString("City"));
		    	  System.out.println("Location state name is ->"+res1.getString("state"));
		    	  System.out.println("Location pin code is ->"+res1.getInt("pincode"));
		      }
		      System.out.println("=============");
		      ResultSet res2= stat.executeQuery(quary2);
		      if(res2.next()) {
		    	  System.out.println("Location name is ->"+ res2.getString("name"));
		    	  System.out.println("Location city name is->"+ res2.getString("City"));
		    	  System.out.println("Location state name is ->"+res2.getString("state"));
		    	  System.out.println("Location pin code is ->"+res2.getInt("pincode"));
		    	  
		      }
		      System.out.println("===================");
		      System.out.println("feaction data from will loop...");
		      ResultSet res11=  stat.executeQuery(quary);
		      while(res11.next()) {
		    	  System.out.println("Location name is ->"+ res11.getString("name"));
		    	  System.out.println("Location city name is->"+ res11.getString("City"));
		    	  System.out.println("Location state name is ->"+res11.getString("state"));
		    	  System.out.println("Location pin code is ->"+res11.getInt("pincode"));
		    	  System.out.println("Location id is->"+res11.getInt("id"));
		    	  
		      }
		      System.out.println("=============");
		      System.out.println("feacting data from student table by using while loop...");
		      ResultSet stinfo=stat.executeQuery(studentquary);
		      while(stinfo.next()) {
		    	  System.out.println("student name is->:"+stinfo.getInt("id"));
		    	System.out.println("student name is->:"+stinfo.getString("name"));
		    	System.out.println("student name is->:"+stinfo.getString("fname"));
		    	System.out.println("student name is->:"+stinfo.getString("mname"));
		    	System.out.println("student name is->:"+stinfo.getString("gender"));
		    	System.out.println("student name is->:"+stinfo.getString("place"));
		    	System.out.println("student name is->:"+stinfo.getInt("pincode"));
		      }
		      System.out.println("==========");
		      System.out.println("data is faction without giving where condication.....");
		      ResultSet set=stat.executeQuery(studentquary1);
		      while(set.next()) {
		    	
		    	  System.out.println("student name is->:"+set.getInt("id"));
			    	System.out.println("student name is->:"+set.getString("name"));
			    	System.out.println("student name is->:"+set.getString("fname"));
			    	System.out.println("student name is->:"+set.getString("mname"));
			    	System.out.println("student name is->:"+set.getString("gender"));
			    	System.out.println("student name is->:"+set.getString("place"));
			    	System.out.println("student name is->:"+set.getInt("pincode"));
			    	
		      }
		    	  
		      
		      
			System.out.println("feched records.....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("closing costly resource..");
			
			if(conn !=null && stat !=null && res !=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			  try {
				stat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
			 try {
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
		}
	}
	


}
