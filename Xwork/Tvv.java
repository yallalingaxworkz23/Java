class Tvv
{
	String name;
	String size;
	int price;
	
	Tvv(){
		System.out.println("name:"+this.name);
		System.out.println("size:"+this.size);
		System.out.println("price:"+this.price);
		this.name="yallu";
		this.size="m";
		this.price=1000;
	}
	Tvv(String name,String size,int price){
		System.out.println("name:"+this.name);
		System.out.println("size:"+this.size);
		System.out.println("price:"+this.price);
		this.name=name;
		this.size=size;
		this.price=price;
	}
}