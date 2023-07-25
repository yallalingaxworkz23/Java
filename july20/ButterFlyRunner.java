class ButterFlyRunner{
	public static void main(String[] args)
	{
		System.out.println("invoking in main method");
		ButterFly butterfly=new ButterFly("suru","s",1,22);
		ButterFly.printstatic();
		butterfly.printlnstance();
	}
}