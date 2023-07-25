class Helmet{
	static String type;
	static String logo;
	int price;
	String color;
	
	Helmet(String type,String logo,int price,String color)
	{
		System.out.println("invoking in main method");
		this.type=type;
		this.logo=logo;
		this.price=price;
		this.color=color;
	}
	static{
		type="ordineary";
		logo="half";
		System.out.println("invoking in static helmet");
		
	}
	static void printstatic()
	{
		System.out.println("invoking in void static helmet");
		System.out.println(type);
		System.out.println(logo);
	}
	void printlnstance()
	{
		System.out.println("invoking in instance helmet");
		System.out.println(price);
		System.out.println(color);
	}
	
}