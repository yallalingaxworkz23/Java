package presentation.com.xwork.app;

public class Parson2 {
	public String name;//instance variable
	public static int age;// static varialbe
	public void Person(String name1)//parameterise variable
	{
		int a=10;//local variable
		
	}

	//1.literals
	public int age1=30;
	
	//contracter it creat an object
	public Parson2(String name) 
	{
		this.name=name;
	}
	public static void main(String[] args) {
		int num;//local variable
		Parson2 person=new Parson2("yallalinga");
		person.Person("kumar");
		person.name="someone";
	}
	
	
}
