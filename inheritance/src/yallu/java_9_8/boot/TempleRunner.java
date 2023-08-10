package yallu.java_9_8.boot;

import yallu.java_9_8.app.NweTemple;
import yallu.java_9_8.app.Temple;

public class TempleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("runningi in the main");
		
		Temple temple=new NweTemple();
		temple.god();
		temple.god("Ram");
		temple.god("Ram","manvi");
		temple.god(4,"jayanagar","manvi");
		temple.god(10);
		temple.god("Ram",10);
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&7");
		
		Temple temple1=new NweTemple();
		temple1.god();
		temple1.god("SaiRam");
		temple1.god("SaiRam","manvi");
		temple1.god(4,"jayanagar","manvi");
		temple1.god(10);
		temple1.god("SaiRam",10);

	}

}
