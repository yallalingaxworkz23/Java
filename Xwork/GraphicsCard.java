class GraphicsCard{
	String brand;
	int RAMInGB;
	double price;
	
	GraphicsCard(){ //no args
		System.out.println("Invoking no-arguments from GraphicsCard");
		System.out.println("GraphicsCard brand in Constructor:"+this.brand);
		System.out.println("GraphicsCard size in Constructor:"+this.RAMInGB);
		System.out.println("GraphicsCard price in Constructor:"+this.price);
		this.brand="Colorful"; 
		this.RAMInGB=4;
		this.price=8500;

	}
	GraphicsCard(String brand,int RAMInGB,double price){
		System.out.println("Invoking arguments from GraphicsCard");
		this.brand=brand; 
		this.RAMInGB=RAMInGB;
		this.price=price;

		
	}
}