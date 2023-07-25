class PowerRunner{
	public static void main(String[] args)
	{
		System.out.println("invoking in main methid");
		Power power=new Power("750v","manvi",1000,50);
		Power.printstatic();
		power.printlnstance();
	}
}