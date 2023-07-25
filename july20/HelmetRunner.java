class HelmetRunner{
	public static void main(String[] args)
	{
		System.out.println("running in main method");
		Helmet helmet=new Helmet("ordineary","half",500,"red");
		Helmet.printstatic();
		helmet.printlnstance();
	}
}