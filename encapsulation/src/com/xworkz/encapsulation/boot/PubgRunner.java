package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Pubg;

public class  PubgRunner {

	public static void main(String[] args) {
	  Pubg pubg=new Pubg();
	  pubg.getname();
	  pubg.setname("yallalinga");
      System.out.println("pubg name is :" +pubg.getname());
      
      pubg.getusername();
      pubg.setusername("yallu");
      System.out.println("pubg user name is :"+pubg.getusername());
      
      pubg.getpassword();
      pubg.setpassword("yallu3630");
      System.out.println("pubg password is :"+pubg.getpassword());
      
      pubg.getaccountname();
      pubg.setaccountname("java");
      System.out.println("pubg channel name is :"+pubg.getaccountname());
      
      pubg.getnoofaccount();
      pubg.setnoofaccounat(2);
      System.out.println("pubg channels of youtuber is:"+pubg.getnoofaccount());
      
      pubg.getuserconatact();
      pubg.setuserconatct(87);
      System.out.println("pubg user contacts is:"+pubg.getuserconatact());
      
      pubg.getnoofaccount();
      pubg.setnoofaccounat(1);
      System.out.println("pubg accounts is :"+pubg.getnoofaccount());
      
      pubg.getaccountype();
      pubg.setaccountype("public");
      System.out.println("pubg account type is:"+pubg.getaccountype());
      
      pubg.getaccountnumber();
      pubg.setaccountnumber(487232322);
      System.out.println("pubg account number:"+pubg.getaccountnumber());
      
      pubg.getnumbofvideos();
      pubg.setnumbofvideos(20);
      System.out.println(" no fo videos:"+pubg.getnumbofvideos());
      
      pubg.getsubscribe();
      pubg.setsubscribe(100);
      System.out.println("subacriber:"+pubg.getsubscribe());
      
      pubg.getlikes();
      pubg.setlikes(1000);
      System.out.println("number of likes:"+pubg.getlikes());
      
      pubg.getcomments();
      pubg.setcomments(100);
      System.out.println("number od comments:"+pubg.getcomments());
      
      pubg.getshares();
      pubg.setshare(10000);
      System.out.println("total shareing:"+pubg.getshares());
      
	}

}
