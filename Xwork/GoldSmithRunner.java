class GoldSmithRunner{
	public static void main (String[] args){
		System.out.println("Running main in SodaRunner");

		String designType="Gold-plated";
		float qunatityInGrams=2;
		int price=9500;
		String goldSmithName="Raghu";
		int exp=2;
		
		
		String type="Solid Gold";
		int cost=1000;
		
		GoldSmith.designType(designType,qunatityInGrams,price,goldSmithName,exp);
		System.out.println("############################");
		GoldSmith.design(type,qunatityInGrams,cost,goldSmithName,exp);
		
		
		
		
		
	}
}