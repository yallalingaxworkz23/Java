package com.xworkz.maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExcecutionUpdate {
	
	
	public static void main(String[] args) {
		System.out.println("invoking in main..");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/mevan";
		String username="root";
		String password="Xworkzodc@123";
		String updateQuery="UPDATE Location set city='BanglorE',"+"state='KarnatakA' where name='rajajinagar'";
		String updateQuery1="UPDATE Location set city='mumbai',"+"state='KarnatakA' where name='raichur'";
		String updateQuery2="UPDATE Location set city='bupal',"+"state='napal' where name='kopla'";
		String updateQuery3="update Location set city='aaaa' where id=3";
		String updateQuery4="update Location set city='Raichur' where name='jaynagar'";
		String updateQuery5="update Location set city='bejapur' where name='kgf'";
//		String updateQuery1="UPDATE City set totalmen=0,"+"population=0 where cityname='Raichur'";
		
		String updateStudentQuary1="update StubentInfo set name='Kumar' where id=2";
		String updateStudentQuary2="update StubentInfo set name='pavan' where id=1";
		
		String deletQuary="delete from Location where city='BanglorE'";
		String deletQuary1="delete  from Location where city='mumbai'";
		String deletQuary2="delete from Location where name='krpuram'";
		String deletQuary3="delete from Location where name='jaynagar'";
		
		String delectStudentQuary="delete from StubentInfo where id=1 ";
		
		
		
	//	String deletQuary3="delete from Location where city=''";
		try {
			Connection connect= DriverManager.getConnection(url,username,password);
			Statement stat= connect.createStatement();
			stat.executeUpdate(updateQuery);
     		stat.executeUpdate(updateQuery1);
     		stat.executeUpdate(updateQuery2);
     		stat.executeUpdate(updateQuery3);
     		stat.executeUpdate(updateQuery4);
     		stat.executeUpdate(updateQuery5);
     		
     		stat.executeUpdate(updateStudentQuary1);
     		stat.executeUpdate(updateStudentQuary2);
     		System.out.println("updated date...");
     		
			stat.executeUpdate(deletQuary);
			stat.executeUpdate(deletQuary1);
			stat.executeUpdate(deletQuary2);
			stat.executeUpdate(deletQuary3);
			
			stat.executeUpdate(delectStudentQuary);
			
			System.out.println("deleting the items after updating...");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
