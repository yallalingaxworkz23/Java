class GassStove
{
	static void cooking(String name,int price,int numOfBurner )
	{
		System.out.println("invoiking in the main method");
		if(name!=null)
		{
			System.out.println("name is valid:"+name);
		}
		else
		{
			System.out.println("name is invalid:"+name);
			return;
		}
		if(price>=1000)
		{
			System.out.println("price is valide:"+price);
		}
		else
		{
			System.out.println("price is invalide:"+price);
			return;
		}
		if(numOfBurner>=1)
		{
		 System.out.println("the give gassstove is good:"+numOfBurner);	
		}
		else
		{
			System.out.println("the give gassstove is not good:"+numOfBurner);
		}
	}
}