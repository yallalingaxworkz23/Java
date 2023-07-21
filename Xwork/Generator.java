class Generator{
	String brand;
	int voltage;
	double price;
	
	Generator(){ //no args
		System.out.println("Invoking no-arguments from Generator");
		System.out.println("Generator brand in Constructor:"+this.brand);
		System.out.println("Generator voltage in Constructor:"+this.voltage);
		System.out.println("Generator price in Constructor:"+this.price);
		this.brand="ECOFLOW"; 
		this.voltage=120;
		this.price=54000;

	}
	Generator(String brand,int voltage,double price){
		System.out.println("Invoking arguments from Generator");
		this.brand=brand; 
		this.voltage=voltage;
		this.price=price;

		
}
	}