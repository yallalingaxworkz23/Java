package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Netflix;

public class  NetflixRunner {

	public static void main(String[] args) {
	  Netflix netflix=new Netflix();
	  
	  netflix.getname();
	  netflix.setname("yallalinga");
      System.out.println("netflix name is :" +netflix.getname());
      
      netflix.getusername();
      netflix.setusername("yallu");
      System.out.println("netflix user name is :"+netflix.getusername());
      
      netflix.getpassword();
      netflix.setpassword("yallu3630");
      System.out.println("netflix password is :"+netflix.getpassword());
      
      netflix.getaccountname();
      netflix.setaccountname("film");
      System.out.println("netflix channel name is :"+netflix.getaccountname());
      
      netflix.getnoofaccount();
      netflix.setnoofaccounat(2);
      System.out.println("netflix channels of youtuber is:"+netflix.getnoofaccount());
      
      netflix.getuserconatact();
      netflix.setuserconatct(87);
      System.out.println("netflix user contacts is:"+netflix.getuserconatact());
      
      netflix.getnoofaccount();
      netflix.setnoofaccounat(1);
      System.out.println("netflix accounts is :"+netflix.getnoofaccount());
      
      netflix.getaccountype();
      netflix.setaccountype("public");
      System.out.println("netflix account type is:"+netflix.getaccountype());
      
      netflix.getaccountnumber();
      netflix.setaccountnumber(487232322);
      System.out.println("netflix account number:"+netflix.getaccountnumber());
      
      netflix.getnumbofvideos();
      netflix.setnumbofvideos(20);
      System.out.println(" no fo videos:"+netflix.getnumbofvideos());
      
      netflix.getsubscribe();
      netflix.setsubscribe(100);
      System.out.println("subacriber:"+netflix.getsubscribe());
      
      netflix.getlikes();
      netflix.setlikes(1000);
      System.out.println("number of likes:"+netflix.getlikes());
      
      netflix.getcomments();
      netflix.setcomments(100);
      System.out.println("number od comments:"+netflix.getcomments());
      
      netflix.getshares();
      netflix.setshare(10000);
      System.out.println("total shareing:"+netflix.getshares());
      
	}

}
