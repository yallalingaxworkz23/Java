package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Snapchat;

public class SnapchatRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Snapchat snap=new Snapchat();
		
		snap.getname();
		snap.setname("yallu");
		System.out.println(" client name:"+snap.getname());
		
		snap.getid();
		snap.setid("yalli11");
		System.out.println("user id:"+snap.getid());
		
		snap.getusername();
		snap.setusername("kumar");
		System.out.println("usr name:"+snap.getusername());
		
		snap.getpassword();
		snap.setpassword("yallu112");
		System.out.println("user password:"+snap.getpassword());
		
		snap.getnoofcont();
		snap.setnoofcont(40);
		System.out.println("number of contants:"+snap.getnoofcont());
		
		snap.getnoofphotos();
		snap.setnoofphotos(20);
		System.out.println("user total photos:"+snap.getnoofphotos());
		
		snap.getnooffriends();
		snap.setnooffriends(50);
		System.out.println("number of friends:"+snap.getnooffriends());
		
		snap.getmutualfriends();
		snap.setmutualfriends(20);
		System.out.println("number of mutal friends:"+snap.getmutualfriends());
		
		snap.getaccounttype();
		snap.setaccounttype("public");
		System.out.println("user account type:"+snap.getaccounttype());
		
		snap.getnooflogin();
		snap.setnooflogin(2);
		System.out.println("number of userloing:"+snap.getnooflogin());

	}

}
