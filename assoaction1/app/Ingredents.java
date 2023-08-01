package xwork.app;

public class Ingredents{
	public String name;
	public int quantity;
	public int cost;
	
	public Ingredents(String name,int quantity,int cost)
	{
		this.name=name;
		this.quantity=quantity;
		this.cost=cost;
	}
	
	public void printInfo()
	{
		System.out.println("company name:"+name);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+cost);
	}

}
