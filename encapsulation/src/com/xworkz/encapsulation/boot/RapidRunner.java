package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Rapid;

public class  RapidRunner {

	public static void main(String[] args) {
	  Rapid rapid=new Rapid();
	  
	  rapid.getname();
	  rapid.setname("yallalinga");
      System.out.println("rapid name is :" +rapid.getname());
      
      rapid.getusername();
      rapid.setusername("yallu");
      System.out.println("rapid user name is :"+rapid.getusername());
      
      rapid.getpassword();
      rapid.setpassword("yallu3630");
      System.out.println("rapid password is :"+rapid.getpassword());
      
      rapid.getaccountname();
      rapid.setaccountname("move");
      System.out.println("rapid channel name is :"+rapid.getaccountname());
      
      rapid.getnoofaccount();
      rapid.setnoofaccounat(4);
      System.out.println("rapid channels of youtuber is:"+rapid.getnoofaccount());
      
      rapid.getuserconatact();
      rapid.setuserconatct(44);
      System.out.println("rapid user contacts is:"+rapid.getuserconatact());
      
      rapid.getnoofaccount();
      rapid.setnoofaccounat(1);
      System.out.println("rapid accounts is :"+rapid.getnoofaccount());
      
      rapid.getaccountype();
      rapid.setaccountype("public");
      System.out.println("rapid account type is:"+rapid.getaccountype());
      
      rapid.getaccountnumber();
      rapid.setaccountnumber(487232232);
      System.out.println("rapid account number:"+rapid.getaccountnumber());
      
      rapid.getnumbofvideos();
      rapid.setnumbofvideos(20);
      System.out.println(" no fo videos:"+rapid.getnumbofvideos());
      
      rapid.getsubscribe();
      rapid.setsubscribe(100);
      System.out.println("subacriber:"+rapid.getsubscribe());
      
      rapid.getlikes();
      rapid.setlikes(1000);
      System.out.println("number of likes:"+rapid.getlikes());
      
      rapid.getcomments();
      rapid.setcomments(100);
      System.out.println("number od comments:"+rapid.getcomments());
      
      rapid.getshares();
      rapid.setshare(10000);
      System.out.println("total shareing:"+rapid.getshares());
      
	}

}
