package com.xworkz.maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class JdbcExcecution {

	public static void main(String[] args) {
		System.out.println("invoking in jdbc.");
		String url="jdbc:mysql://localhost:3306/mevan";
		String userName="root";
		String password="Xworkzodc@123";
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); //Step 1:Load and Register Driver Class//its a predefined
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("getting  connection.");
		String locationquary="INSERT INTO Location(id,name,city,state,pincode) VALUES(1,'rajajinagar','banglur','karnataka',56098)";
		String locationquary1="INSERT INTO Location(id,name,city,state,pincode) VALUES(2,'Raichur','sindanur','karnataka',52098)";
		String locationquary2="INSERT INTO Location(id,name,city,state,pincode) VALUES(3,'manvi','nermanvi','karnataka',56998)";
		String locationquary3="INSERT INTO Location(id,name,city,state,pincode) VALUES(4,'kopla','sindhi','karnataka',56097)";
		String locationquary4="INSERT INTO Location(id,name,city,state,pincode) VALUES(5,'krpuram','hydrabhad','Andhra',12345)";
		String locationquary5="INSERT INTO Location(id,name,city,state,pincode) VALUES(6,'vijaynagar','banglur','goa',13345)";
		String locationquary6="INSERT INTO Location(id,name,city,state,pincode) VALUES(7,'jaynagar','udupi','tamilnadu',11345)";
		String locationquary7="INSERT INTO Location(id,name,city,state,pincode) VALUES(8,'btm','maglour','kerala',12355)";
		String locationquary8="INSERT INTO Location(id,name,city,state,pincode) VALUES(9,'krmarket','shivamuga','uk',14345)";
		String locationquary9="INSERT INTO Location(id,name,city,state,pincode) VALUES(10,'kgf','tumkur','mp',12645)";
		String StudentInfoquary1="insert into StubentInfo(id,name,fname,mname,gender,place,pincode) values(1,'yallu','hanumantha','roopa','male','raichur',5841)";
		String StudentInfoquary2="insert into StubentInfo(id,name,fname,mname,gender,place,pincode) values(2,'yallu','hanumantha','roopa','male','raichur',5841)";
		String StudentInfoquary3="insert into StubentInfo(id,name,fname,mname,gender,place,pincode) values(3,'yallu','hanumantha','roopa','male','raichur',5841)";
		String StudentInfoquary4="insert into StubentInfo(id,name,fname,mname,gender,place,pincode) values(4,'yallu','hanumantha','roopa','male','raichur',5841)";
		String StudentInfoquary5="insert into StubentInfo(id,name,fname,mname,gender,place,pincode) values(5,'yallu','hanumantha','roopa','male','raichur',5841)";
		String StudentInfoquary6="insert into StubentInfo(id,name,fname,mname,gender,place,pincode) values(6,'yallu','hanumantha','roopa','male','raichur',5841)";
		
//		String cityquary="insert into City(id,cityname,population,totalmen,totalwomen) values(1,'Raichur',10000,5000,5000)";
//		String StudentInfoquary="insert into StubentInfo(id,name,fname,mname,gender,place,pincode) values(1,'yallu','hanumantha','roopa','male','raichur',5841)";
//    	String AddharInfoquary="insert into Addharinfo(id,name,dateofbirth,fname,mname,gender,address,addharnum) values(1,'yallalinga','1/2/ 2007','hanumantha','roopa','male','manvi',597627854846)";
////		String XworkzStudentInfoquary="insert into XworkzStudentInfo(id,name,emailId,dateofbirth,collagename,yearofpassing,course) values(1,'yallalinga','yallu.xworkz@gmail.com',1-6-2001,'SDMIT',2023,'Java')";
//		String ProductInfoquary="insert into ProductInfo(id,name,emailId,product,manifactur,expiredate,place,pincode) values(1,'yallu','yallu.xworkz@gmail.com','mobile',2-8-2022,23-12-26,'raichur',584123)";
//		String EmployInfoquary="insert into EmployInfo(id,name,employId,departmentname,totalWorkingDays,totalLiveDays,salary values(1,'yallalinga',123456,'Software Dewloper',28,2,58000)";
//        String BusBookingInfoquary="insert into BusBookingInfo(id,name,pnumber,busName,Wherefrom,WhereTo,bookingDate) values (1,'yallalinga',8431224817,'vrl','manvi',banglur',1-3-2023 12:30am)";
//        String PgBookingInfoquary="inser into PgBookingInfo(id,name,email,pnumber,pgname,Roomtype,price,place) values(1,'yallalinga','yallu.xworkz@gmail.com',8431224817,'sri Ram','8 Attach',4800,'vijaynagar')";
//        String ShopInfoquary="insert into ShopInfo(id,name,place,shopid,productsAvaliable,minimunPrice,maxPrice,openingTime,Closing) values(1,'durga','manvi',12345,'yes',500,5000,12:30,6:30)";
		try {
		 Connection connect=DriverManager.getConnection(url, userName, password);//Step 2: establish Connection from database
		  Statement stat= connect.createStatement();  //3 step : creat statment
		            stat.execute(locationquary);//4 step: excuteing the quarry
		            stat.execute(locationquary1);
		            stat.execute(locationquary2);
		            stat.execute(locationquary3);
		            stat.execute(locationquary4);
		            stat.execute(locationquary5);
		            stat.execute(locationquary6);
		            stat.execute(locationquary7);
		            stat.execute(locationquary8);
		            stat.execute(locationquary9);
		          
		            stat.execute(StudentInfoquary1);
		            stat.execute(StudentInfoquary2);
		            stat.execute(StudentInfoquary3);
		            stat.execute(StudentInfoquary4);
		            stat.execute(StudentInfoquary5);
		            System.out.println("quary is exicuated..");
		            
//	            stat.execute(cityquary);
//	            stat.execute(StudentInfoquary);
//	           stat.execute(AddharInfoquary);
//		            stat.execute(XworkzStudentInfoquary);
//		            stat.execute(ProductInfoquary);
//		            stat.execute(EmployInfoquary);
//		            stat.execute(BusBookingInfoquary);
//		            stat.execute(PgBookingInfoquary);
//		            stat.execute(ShopInfoquary);
		            
		            
		            
			System.out.println("getd connected.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
// 5.process the resultent data
// 6.closing the 
	//prepared statement ( quary wirte once excut many times)
}
