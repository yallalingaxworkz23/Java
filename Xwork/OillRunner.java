class OillRunner
{
	public static void main(String[] args)
	{
		System.out.println("invoking in main mathod");
		
		Oill oill=new Oill();
		System.out.println("brand:"+oill.brand);
		System.out.println("brand:"+oill.viscosity);
		System.out.println("brand:"+oill.quantity);
		
		Oill oill=new Oill("sun",50.0,5);
		System.out.println("brand:"+oill1.brand);
		System.out.println("brand:"+oill1.viscosity);
		System.out.println("brand:"+oill1.quantity);
		
	}
}