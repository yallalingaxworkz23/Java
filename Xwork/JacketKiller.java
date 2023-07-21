class JacketKiller
{
	public static void main(String[] args)
	{
		System.out.println("invokink in main method");
		Jacket jacket=new Jacket();
		System.out.println(jacket.brand);
		System.out.println(jacket.size);
		System.out.println(jacket.price);
		System.out.println(jacket.usedFor);
		System.out.println("&&&&&&&&&&&&&");
		Jacket jacket1=new Jacket();
		jacket1.brand="yallu";
		jacket1.size="m";
		jacket1.price=10000;
		jacket1.usedFor="formals";
		System.out.println(jacket1.brand);
		System.out.println(jacket1.size);
		System.out.println(jacket1.price);
		System.out.println(jacket1.usedFor);
		
		
	
		
		
		
	}
}