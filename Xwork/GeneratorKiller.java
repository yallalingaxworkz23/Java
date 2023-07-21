class GeneratorKiller{
	public static void main(String[] args){
		System.out.println("Invoking main in GeneratorKiller");
		
		Generator generator=new Generator();
		System.out.println("Generator brand in main method:"+generator.brand);
		System.out.println("Generator voltage in main method:"+generator.voltage);
		System.out.println("Generator price in main method:"+generator.price);
		
		System.out.println("*********************************");
		
		Generator generator1=new Generator("Honda",180,65000);
		System.out.println("Generator brand in main method:"+generator1.brand);
		System.out.println("Generator voltage in main method:"+generator1.voltage);
		System.out.println("Generator price in main method:"+generator1.price);
		
	}
}