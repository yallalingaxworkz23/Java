package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.NammaMetro;


public class  NammaMetroRunner {

	public static void main(String[] args) {
	  NammaMetro  metro=new NammaMetro();
	  
	  metro.getname();
	  metro.setname("yallalinga");
      System.out.println("user name is :" +metro.getname());
      
      metro.getusername();
      metro.setusername("yallu");
      System.out.println("user user name is :"+metro.getusername());
      
      metro.getpassword();
      metro.setpassword("yallu3630");
      System.out.println("user password is :"+metro.getpassword());
      
      metro.getmetroname();
      metro.setMatroname("move");
      System.out.println("metro  name is :"+metro.getmetroname());
      
      metro.getnoofmetro();
      metro.setnoofmetro(4);
      System.out.println("metro totalis:"+metro.getnoofmetro());
      
      metro.getuser();
      metro.setuser(44);
      System.out.println("metro user contacts is:"+metro.getuser());
      
      metro.getmaxuser();
      metro.setmaxuser(1000);
      System.out.println("metro  is :"+metro.getmaxuser());
      
      metro.getmetrotype();
      metro.setmetrotype("public");
      System.out.println("metro type is:"+metro.getmetrotype());
      
      metro.getmetronumber();
      metro.setmetronumber(4872232);
      System.out.println("metro  number:"+metro.getmetronumber());
      
      metro.getnumbofcoochs();
      metro.setnumbofcoochs(20);
      System.out.println(" no fo coochis:"+metro.getnumbofcoochs());
      
      metro.getsubscribe();
      metro.setsubscribe(100);
      System.out.println("subacriber:"+metro.getsubscribe());
      
      metro.getlikes();
      metro.setlikes(1000);
      System.out.println("number of likes:"+metro.getlikes());
      
      metro.getcomments();
      metro.setcomments(100);
      System.out.println("number od comments:"+metro.getcomments());
      
      metro.getshares();
      metro.setshare(10000);
      System.out.println("total shareing:"+metro.getshares());
      
	}

}
