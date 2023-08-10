package yallu.java_9_8.boot;

import yallu.java_9_8.app.BcmHostel;
import yallu.java_9_8.app.Hostel;

public class HostelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("running in the main metod");
		
		Hostel hostel=new BcmHostel();
		hostel.warden();
		hostel.warden("sairam");
		hostel.warden("sairam","raichur");
		hostel.warden(50,"sairam","raichur");
		hostel.warden(50);
		hostel.warden("sairam",250);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$");
		
		Hostel hostel1=new BcmHostel();
		hostel1.warden();
		hostel1.warden("sairam");
		hostel1.warden("sairam","raichur");
		hostel1.warden(50,"sairam","raichur");
		hostel1.warden(50);
		hostel1.warden("sairam",250);
		
	}

}
