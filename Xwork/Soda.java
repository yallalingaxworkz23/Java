class Soda{
	static void drink(String name,int calories,double price){
		System.out.println("Invoking drink() in Soda");
		if(name=="yallu")
		{
			System.out.println("Name is valid:"+name);
		}
		else
		{
			System.err.println("Name is invalid:"+name);
			return;
		}
		if(calories>=120)
		{
		     System.out.println("Calories is valid:"+calories);
		}
		else
		{
			System.err.println("Calories is invalid:"+calories);
			return;
		}
		if(price>=40)
		{
			System.out.println("Price is valid:"+price);
		}
		else
		{
			System.out.println("Price is invalid:"+price);
			return;
		}
	}
}