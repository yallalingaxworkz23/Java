class Wood{
	String type;
	String brand;
	int price;
	double validity;
	int size;
	Wood(){
		super();
		System.out.println("invoking");
	}
	Wood(String type){
		this();
		this.type=type;
		System.out.println("invoking in the wood");
		}
    Wood(String type,String brand){
		this(type);
		this.brand=brand;
		System.out.println("invoking type and brand");
		}
	Wood(String type,String brand,int price){
		this(type,brand);
		this.price=price;
		System.out.println("invoking in price");
	}
	Wood(String type,String brand,int price,double validity){
		this(type,brand,price);
		this.validity=validity;
		System.out.println("invoking in validity");
	}
	Wood(String type,String brand,int price,double validity,int size){
		this(type,brand,price,validity,size);
		this.size=size;
		System.out.println("invoking in size");
	}
	
	
}