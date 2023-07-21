class KulfiRunner{
	public static void main (String[] args){
		System.out.println("Running main in KulfiRunner");
		
		
		String brand="Amul";
		float qunatityInGrams=50.6f;
		int price=45;
		String type="Chocolate";
		
		
		String brandKulfi=null;
		int cost=10;
		
		Kulfi.tasty(brand,qunatityInGrams,price,type);
		System.out.println("############################");
		Kulfi.tasty(brandKulfi,qunatityInGrams,cost,type);
		
		
		
		
	}
}