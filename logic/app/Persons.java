package xworz.com.logic.app;

public class Persons {
	
	String name;
	public static void Name(){
		System.out.println("in static method:");
		Persons p2=new Persons();
		p2.Name2();
	}
	public void Name2() {
		
	System.out.println("non static method");	 
		
		
	}
	
	

}
