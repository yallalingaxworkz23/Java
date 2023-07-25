class ButterFly{
	static String name;
	static String type;
	int numofbf;
	int age;
	
	ButterFly(String name,String type,int numofbf,int age)
	{
		
		this.name=name;
		this.type=type;
		this.numofbf=numofbf;
		this.age=age;
	}
	static{
		name="suru";
		type="s";
		System.out.println("invoking in the static ");
	}
	static void printstatic(){
		System.out.println("invoking in static");
		System.out.println(name);
		System.out.println(type);
		
	}
	void printlnstance()
	{
		System.out.println("invoking in instance");
		System.out.println(numofbf);
		System.out.println(age);
	}
}