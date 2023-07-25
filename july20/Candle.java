class Candle{
	static String name;
	static int price;
	String companyname;
	int length;
	 
	
	
	Candle(String name,int price,String companyname,int length)
	{
		System.out.println("invoking in main method");
		this.name=name;
		this.price=price;
		this.companyname=companyname;
		this.length=length;
		
	}
	static{
		 name="kumar";
		 price=10;
		 System.out.println("invoking in static ");
	}
	 static void printstatic()
	 {
		 System.out.println("invoking in static candle");
		 System.out.println(name);
		 System.out.println(price);
	 }
	 void printlnstance()
	 {
		 System.out.println("invoking in instance of candle");
		 System.out.println(companyname);
		 System.out.println(length);
	 }
}
	
	
	
	
