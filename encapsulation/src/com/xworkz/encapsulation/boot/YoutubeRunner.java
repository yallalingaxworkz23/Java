package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Youtube;

public class YoutubeRunner {

	public static void main(String[] args) {
	  Youtube youtube=new Youtube();
      youtube.getname();
      youtube.setname("yallalinga");
      System.out.println("youtuber name is :" +youtube.getname());
      
      youtube.getusername();
      youtube.setusername("yallu");
      System.out.println("youtubr user name is :"+youtube.getusername());
      
      youtube.getpassword();
      youtube.setpassword("yallu3630");
      System.out.println("youtuber password is :"+youtube.getpassword());
      
      youtube.getchannelname();
      youtube.setchannelname("java");
      System.out.println("youtuber channel name is :"+youtube.getchannelname());
      
      youtube.getnoofchannel();
      youtube.setnoofchannel(2);
      System.out.println("total channels of youtuber is:"+youtube.getnoofchannel());
      
      youtube.getuserconatact();
      youtube.setuserconatct(87);
      System.out.println("youtuber user contacts is:"+youtube.getuserconatact());
      
      youtube.getnoofaccount();
      youtube.setnoofaccounat(1);
      System.out.println("youtuber accounts is :"+youtube.getnoofaccount());
      
      youtube.getaccountype();
      youtube.setaccountype("public");
      System.out.println("youtuber account type is:"+youtube.getaccountype());
      
      youtube.getaccountnumber();
      youtube.setaccountnumber(487232322);
      System.out.println("youtuber account number:"+youtube.getaccountnumber());
      
      youtube.getnumbofvideos();
      youtube.setnumbofvideos(20);
      System.out.println(" no fo videos:"+youtube.getnumbofvideos());
      
      youtube.getsubscribe();
      youtube.setsubscribe(100);
      System.out.println("subacriber:"+youtube.getsubscribe());
      
      youtube.getlikes();
      youtube.setlikes(1000);
      System.out.println("number of likes:"+youtube.getlikes());
      
      youtube.getcomments();
      youtube.setcomments(100);
      System.out.println("number od comments:"+youtube.getcomments());
      
      youtube.getshares();
      youtube.setshare(10000);
      System.out.println("total shareing:"+youtube.getshares());
      
	}

}
