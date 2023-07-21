class CycleRunner
{
	public static void main(String[] args)
	{
		System.out.println("invoking in main method");
		Cycle cycle=new Cycle();
		System.out.println("brans:"+cycle.brand);
		System.out.println("prince:"+cycle.price);
		System.out.println("compay:"+cycle.name);
		
		Cycle cycle1=new Cycle("bajaj",10000,"kumar");
		System.out.println("brans:"+cycle1.brand);
		System.out.println("prince:"+cycle1.price);
		System.out.println("compay:"+cycle1.name);
		
	}
	
}