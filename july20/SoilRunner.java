class SoilRunner{
	public static void main(String[] args)
	{
		System.out.println("invoking in main method");
		Soil soil=new Soil("2nd",1000,"red","manvi");
		Soil.printstatic();
		soil.printlnstance();
	}
}