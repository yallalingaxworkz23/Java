class Wallet{
	String brand;
	String materialType;
	double price;
	
	Wallet(){ //no args
		System.out.println("Invoking no-arguments from Wallet");
		System.out.println("Wallet brand in Constructor:"+this.brand);
		System.out.println("Wallet voltage in Constructor:"+this.materialType);
		System.out.println("Wallet price in Constructor:"+this.price);
		this.brand="Spiffy"; 
		this.materialType="Leather";
		this.price=613;
	}
	Wallet(String brand,String materialType,double price){
		System.out.println("Invoking arguments from Wallet");
		this.brand=brand; 
		this.materialType=materialType;
		this.price=price;
	}
}