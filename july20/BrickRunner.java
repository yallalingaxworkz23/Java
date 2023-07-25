class BrickRunner{
	public static void main(String[] args)
	{
		System.out.println("invoking in main ");
		Brick brick=new Brick("1st","red","100days",1000);
		Brick.printstatic();
		brick.printlnstance();
	}
}