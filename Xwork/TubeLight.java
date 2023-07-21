class TubeLight{
	String brand;
	String color;
	double price;
	
	TubeLight(){ //no args
		System.out.println("Invoking no-arguments from Tubelight");
		System.out.println("TubeLight brand in Constructor:"+this.brand);
		System.out.println("TubeLight color in Constructor:"+this.color);
		System.out.println("TubeLight price in Constructor:"+this.price);
		this.brand="Philips"; 
		this.color="White";
		this.price=280;

	}
	TubeLight(String brand,String color,double price){
		System.out.println("Invoking arguments from TubeLight");
		this.brand=brand; 
		this.color=color;
		this.price=price;

		
	}
}