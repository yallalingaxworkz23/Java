class Stovee
{
	static void fire(String type,int price,String brand)
	{
		System.out.println("invoking name stovee fire");
		if(type!=null)
		{
			System.out.println("stove type is valide :"+type);
			
		}
		else
		{
			System.out.println("stove type is in-valid:"+type);	
			return;
		}
		if(price>=600)
		{
			System.out.println("price is valid:"+price);
		}
		else
		{
			System.out.println("price is in-allid:"+price);
			return;
		}
		if(brand=="yallu")
		{
			System.out.println("brand is valid:"+brand);
		}	
		else
		{
			System.out.println("brand is invalid:"+brand);
			return;
		}
		
		
	}
}