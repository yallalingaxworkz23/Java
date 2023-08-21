package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Facebook;


public class  FacebookRunner {

	public static void main(String[] args) {
	  Facebook book=new Facebook();
      book.getname();
      book.setname("yallalinga");
      System.out.println("faceBook name is :" +book.getname());
      
      book.getusername();
      book.setusername("yallu");
      System.out.println("faceBook user name is :"+book.getusername());
      
      book.getpassword();
      book.setpassword("yallu3630");
      System.out.println("faceBook password is :"+book.getpassword());
      
      book.getaccountname();
      book.setaccountname("java");
      System.out.println("faceBook channel name is :"+book.getaccountname());
      
      book.getnoofaccount();
      book.setnoofaccounat(2);
      System.out.println("faceBook channels of youtuber is:"+book.getnoofaccount());
      
      book.getuserconatact();
      book.setuserconatct(87);
      System.out.println("faceBook user contacts is:"+book.getuserconatact());
      
      book.getnoofaccount();
      book.setnoofaccounat(1);
      System.out.println("faceBook accounts is :"+book.getnoofaccount());
      
      book.getaccountype();
      book.setaccountype("public");
      System.out.println("faceBook account type is:"+book.getaccountype());
      
      book.getaccountnumber();
      book.setaccountnumber(487232322);
      System.out.println("faceBook account number:"+book.getaccountnumber());
      
      book.getnumbofvideos();
      book.setnumbofvideos(20);
      System.out.println(" no fo videos:"+book.getnumbofvideos());
      
      book.getsubscribe();
      book.setsubscribe(100);
      System.out.println("subacriber:"+book.getsubscribe());
      
      book.getlikes();
      book.setlikes(1000);
      System.out.println("number of likes:"+book.getlikes());
      
      book.getcomments();
      book.setcomments(100);
      System.out.println("number od comments:"+book.getcomments());
      
      book.getshares();
      book.setshare(10000);
      System.out.println("total shareing:"+book.getshares());
      
	}

}
