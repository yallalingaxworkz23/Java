package overloading.app;

public class IronBox {  
	public void heat()
	{
		System.out.println("invoking iron with no args");
		heat("bajaj",5000);
	}
	public void heat(String brand)
	{
          System.out.println("invoking iron with brand ");
          System.out.println("brand is :"+brand);
	}
	public void heat(double cost)
	{
		System.out.println("invokin iron with price");
		System.out.println("price is:"+cost);
	}
	public void heat(String brand,double cost)
	{
		System.out.println("invoking brand and price");
		heat(brand);
		heat(cost);
	}

}
