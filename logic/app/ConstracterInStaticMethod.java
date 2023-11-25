package xworz.com.logic.app;

public class ConstracterInStaticMethod {
	String name="yallu";
	String fname="hanumantha";
	
	public ConstracterInStaticMethod() {
		
		System.out.println("invoking in constracter.."+fname);
		
	}
	public static void Method() {
		ConstracterInStaticMethod cms=new ConstracterInStaticMethod();
		System.out.println(" invoking in static methiod:"+cms.name);
			
	}
	public static void main(String[] args) {
		System.out.println("invoking in main method...");
		ConstracterInStaticMethod csm=new ConstracterInStaticMethod();
		csm.Method();
		
		
	}
	

}
