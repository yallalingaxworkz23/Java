package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.PhonePay;

public class PhonePayRunner {

	public static void main(String[] args) {
		PhonePay phonepay=new PhonePay();
		
		phonepay.getname();
		phonepay.setname("yallalinga");
		System.out.println("person name is :"+phonepay.getname());
		
		phonepay.getid();
		phonepay.setid("yallu112");
		System.out.println("user id is :"+phonepay.getid());
		
		phonepay.getusername();
		phonepay.setusername("yallu");
		System.out.println("user name is :"+phonepay.getusername());
		
		phonepay.getpassword();
		phonepay.setpassword("yallu@123");
		System.out.println("user password is :"+phonepay.getpassword());
		
		phonepay.getnoofcont();
		phonepay.setnoofcont(84);
		System.out.println("user total contactes is :"+phonepay.getnoofcont());
		
		phonepay.getnooffeaturs();
		phonepay.setnooffeaturs(17);
		System.out.println("phone pay features is :"+phonepay.getnooffeaturs());
		
		phonepay.getbalance();
		phonepay.setbalance(100);
		System.out.println("user total balance is:"+phonepay.getbalance());
		
		phonepay.getaccountnumb();
		phonepay.setaccountnumb(7382378);
		System.out.println("user account number is:"+phonepay.getaccountnumb());
		
		phonepay.getacounttype();
		phonepay.setacounttype("saving");
		System.out.println("user account type is:"+phonepay.getacounttype());
		
		phonepay.getnoofaccount();
		phonepay.setnoofaccount(2);
		System.out.println("user have accounts in bank is:"+phonepay.getnoofaccount());
		
	}

}
