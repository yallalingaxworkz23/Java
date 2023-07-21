class Stove{
	static void fire(String type,int price,String brandname)
	{
		System.out.println("invoking fire in Stove");
		if(type!=null){
			System.out.println("type is valid:"+type);
		}
		else{
			System.err.println("type  is in-valid:"+type);
			return;
		}
		if(price>=1000){
			System.out.println("price is valid:"+price);
		}
		else{
			System.err.println("price is in-valid:"+price);
			return;
		}
		if(brand!=null){
			System.out.println("Brand is valid:"+brandname);
		}
		else{
			System.err.println("Brand is in-valid:"+brandname);
			return;
		}
	}
}