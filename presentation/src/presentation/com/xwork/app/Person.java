package presentation.com.xwork.app;

public class Person {
	
	public String name;//instance variable
	public static int age;//static variable
	
	public void display(String name)//parameter variable
	{
		int a=10;//local variable
		System.out.println("Invoking display() in Person");
	}
	
	
	//initialisation of varibales
	//1.literals by using equals symbols
	
	String name1="yalalinga";
	
	static {
		age=30;
	}
	
	//2.contructors whenever we create object/ref
	
	public Person(String name)
	{
		this.name=name;
	}
	
	public static void main(String[] args) {
		System.out.println("invoking main() in Person");
		
		Person person=new Person("Vinay");//2.constructor varibale initialisation
		
		person.display("Rakesh");//3.method initialization
		
		person.name="someone";//4.initializing by using reference
		
		Person.age=20;
		person.age=30;
	}

}
