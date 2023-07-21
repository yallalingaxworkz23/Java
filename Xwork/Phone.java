class Phone{
	String brand;
	int version;
	double price;
	double validity;
	
	Phone(){
		System.out.println("name:"+this.brand);
		System.out.println("version:"+this.version);
		System.out.println("amount:"+this.price);
		System.out.println("years:"+this.validity);
		this.brand="mi";
		this.version=10;
		this.price=15000;
		this.validity=10;
	}
}