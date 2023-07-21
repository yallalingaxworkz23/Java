class Oill{
	String brand;
	double viscosity;
	int quantity;
	
	Oill()
	{
		System.out.println("brand ":+this.brand);
		System.out.println("brand ":+this.viscosity);
		System.out.println("brand ":+this.quantity);
		this.brand="sunfree";
		this.viscosity=0.007f;
		this.quantity=700;
		
	}
	Oill(String brand,double viscosity,int quantity)
	{	
		System.out.println("brand ":+this.brand);
		System.out.println("brand ":+this.viscosity);
		System.out.println("brand ":+this.quantity);
		this.brand=brand;
		this.viscosity=viscosity;
		this.quantity=quantity;
	}
}