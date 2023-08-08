package overloading.app;

public class Elevator {


	public void lift()
	{
		System.out.println("invoking material with no args");
		lift("tata",1000);
	}
	public void lift(String brand ) 
	{
		System.out.println("invoking material with args");
		System.out.println("brand name is :"+brand);
	}
	public void lift(double cost)
	{
		System.out.println("invoking in material cost");
		System.out.println("lift price:"+cost);
	}
	public void lift(String brand,double price)
	{
		System.out.println("invoking the brand and cost");
		lift(brand);
		lift(price);
		
	}

}

