package xworz.com.logic.boot;

import xworz.com.logic.app.MenAInterface;
import xworz.com.logic.app.MenBInterface;

public class MenInterfaceRunner {
	
	public static void main(String[] args) {
		System.out.println("running in main method..");
		MenAInterface men=new MenBInterface();
		System.out.println("smart"+men.Smart(2.2));
		men.Speed(300);
		//men.Name("yallu");
		
		
	}

}
