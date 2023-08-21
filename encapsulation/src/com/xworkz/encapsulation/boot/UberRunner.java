package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Uber;

public class  UberRunner {

	public static void main(String[] args) {
	  Uber uber=new Uber();
	  
	  uber.getname();
	  uber.setname("yallalinga");
      System.out.println("uber name is :" +uber.getname());
      
      uber.getusername();
      uber.setusername("yallu");
      System.out.println("uber user name is :"+uber.getusername());
      
      uber.getpassword();
      uber.setpassword("yallu3630");
      System.out.println("uber password is :"+uber.getpassword());
      
      uber.getaccountname();
      uber.setaccountname("run");
      System.out.println("uber channel name is :"+uber.getaccountname());
      
      uber.getnoofaccount();
      uber.setnoofaccounat(1);
      System.out.println("uber channels of youtuber is:"+uber.getnoofaccount());
      
      uber.getuserconatact();
      uber.setuserconatct(56);
      System.out.println("uber user contacts is:"+uber.getuserconatact());
      
      uber.getnoofaccount();
      uber.setnoofaccounat(2);
      System.out.println("uber accounts is :"+uber.getnoofaccount());
      
      uber.getaccountype();
      uber.setaccountype("public");
      System.out.println("uber account type is:"+uber.getaccountype());
      
      uber.getaccountnumber();
      uber.setaccountnumber(434732322);
      System.out.println("uber account number:"+uber.getaccountnumber());
      
      uber.getnumbofvideos();
      uber.setnumbofvideos(22);
      System.out.println(" no fo videos:"+uber.getnumbofvideos());
      
      uber.getsubscribe();
      uber.setsubscribe(1000);
      System.out.println("subacriber:"+uber.getsubscribe());
      
      uber.getlikes();
      uber.setlikes(1000);
      System.out.println("number of likes:"+uber.getlikes());
      
      uber.getcomments();
      uber.setcomments(100);
      System.out.println("number od comments:"+uber.getcomments());
      
      uber.getshares();
      uber.setshare(10000);
      System.out.println("total shareing:"+uber.getshares());
      
	}

}
