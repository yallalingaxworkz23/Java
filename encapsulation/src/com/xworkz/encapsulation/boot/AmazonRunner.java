package com.xworkz.encapsulation.boot;
import com.xworkz.encapsulation.app.Amazon;

public class AmazonRunner {

	public static void main(String[] args) {
		
		Amazon name=new Amazon();
		
	    System.out.println(name.getcompanyname());
		name.setcompanyname("hp");
		System.out.println("comapany:"+name.getcompanyname());
		
		System.out.println("place:"+name.getplace());
		name.setplace("manvi");
		System.out.println("place:"+name.getplace());
		
		System.out.println("city"+name.getcity());
		name.setcity("Raichur");
		System.out.println("city:"+ name.getcity());
		
		System.out.println("number of branch:"+ name.getnoofBranch());
		name.setnoofBranch(4);
		System.out.println("number of branch:"+name.getnoofBranch());
		
		System.out.println("is it company:"+name.iscompany());
		name.setcompany(true);
		System.out.println("is it copmany:"+name.iscompany());
		
		System.out.println("email id:"+name.getEmailid());
		name.setEmailid("yallu3630@gmail.com");
		System.out.println("email id:"+name.getEmailid());
		
		System.out.println("employ name:"+name.getEmployname());
		name.setemployname("yallalinga");
		System.out.println("employ name is :"+name.getEmployname());
		
		System.out.println("monthly salary:"+name.getsalary());
		name.setsalary(50000);
		System.out.println("monthly salary:"+name.getsalary());
		
		System.out.println("work expreance:"+name.getworkExpreance());
		name.setworkExpreance(2);
		System.out.println("work expreance:"+name.getworkExpreance());
		
		System.out.println("employ bond:"+name.getcompanyBond());
		name.setcompanyBond(3);
		System.out.println("employ bond:"+name.getcompanyBond());
		
		System.out.println("company main branch:"+name.getmainBrangh());
		name.setmainBranch("benglur");
		System.out.println("company main branch:"+name.getmainBrangh());
		
		System.out.println("md gender:"+name.getMd());
		name.setMd("boy");
		System.out.println("md gender:"+name.getMd());
		
		System.out.println("get md name:"+name.getmdname());
		name.setmdname("kumar");
		System.out.println("get md name:"+name.getmdname());
		
	
		
		
		
		
		
		

	}

}
