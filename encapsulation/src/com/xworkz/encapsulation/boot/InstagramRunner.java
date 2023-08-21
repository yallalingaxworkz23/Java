package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Instagram;

public class InstagramRunner {

	public static void main(String[] args) {
		
		Instagram insta=new Instagram();
		
		System.out.println("name:"+insta.getname());
		insta.setname("yallu");
		System.out.println("name is:"+insta.getname());
		
		System.out.println("username is:"+insta.getusername());
		insta.setusername("yallu");
		System.out.println("username is:"+insta.getusername());
		
		System.out.println("password is:"+insta.getpassword());
		insta.setpassword("kumar");
		System.out.println("password is ;"+insta.getpassword());
		
		System.out.println("insta bio is:"+insta.getbio());
		insta.setbio("SDMIT");
		System.out.println("insta bio is:"+insta.getbio());
		
		System.out.println("user contact is:"+insta.getcontnum());
		insta.setcontnum("8431224817");
		System.out.println("inst contact is:"+insta.getcontnum());
		
		System.out.println("num of follower:"+insta.getnooffollower());
		insta.setnooffollower(256);
		System.out.println("num of follower:"+insta.getnooffollower());
		
		System.out.println("number of following:"+insta.getnooffollowing());
		insta.setnooffollowing(250);
		System.out.println("number of following:"+insta.getnooffollowing());
		
		System.out.println("account type:"+insta.getacounttype());
		insta.setacounttype("public");
		System.out.println("account type:"+insta.getacounttype());
		
		System.out.println("number of post:"+insta.getnoofpost());
		insta.setnoofpost(12);
		System.out.println("number of post:"+insta.getnoofpost());
		
		System.out.println("number of likes:"+insta.getnooflike());
		insta.setnooflike(250);
		System.out.println("number of likes:"+insta.getnooflike());
		
		System.out.println("number of comeents:"+insta.getcomments());
		insta.setcomments(50);
		System.out.println("number of comments:"+insta.getcomments());
		
		System.out.println("account is block:"+insta.isblook());
		insta.setblook(true);
		System.out.println("number of block:"+insta.isblook());
		
		System.out.println("number of report:"+insta.getReport());
		insta.setreport("wast");
		System.out.println("number of report:"+insta.getReport());
		
		System.out.println("date of birth:"+insta.getdateofbirth());
		insta.setdateofbirth("2000");
		System.out.println("date of birth:"+insta.getdateofbirth());
		
		
		
		
		
		
		
		

	}

}
