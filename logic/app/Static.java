package xworz.com.logic.app;

public class Static {
	
	static int num1=3;
	
	public  void Number() {
		
		int num2=num1;
		System.out.println("number in static method:"+num2);
		
	}
	public static void main(String[] args) {
		Static st=new Static();
		st.Number();
		System.out.println();
		
	}  
     //instance variable static method not allowed
	//static variable instance method allowed
}
