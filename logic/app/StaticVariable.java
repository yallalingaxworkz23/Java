package xworz.com.logic.app;
//static variable in instance method
public class StaticVariable {
	
	 
	static String fname;
	int num=1;
	public void Name() {
		
		
		System.out.println("name is :"+":"+num);
		
	}
	public void Name1() {
		
		String mname=fname;
		
		System.out.println("fname is :"+mname);
		
	}
	//static variable instance method is allowed
	//instance variable in static method not allowed
	//static variable in static method is allowed
	//instance variable in instance method is allowed
		
		
	}


