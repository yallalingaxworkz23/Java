class GoldSmith{
	
	static void design(String designType,float qunatityInGrams,int price,String goldSmithName, int exp){
		System.out.println("Invoking design in GoldSmith");
		if(designType!=null){
			System.out.println("Kulfi brand  is valid:"+designType);
		}
		else{
			System.out.println("Kulfi brand  is in-valid:"+designType);
			return;
		}
		if(qunatityInGrams>=1){
			System.out.println("qunatity in grams is valid:"+qunatityInGrams);
		}
		else{
			System.out.println(" qunatity in gramsis in-valid:"+qunatityInGrams);
			return;
		}
		if(price>=4500){
			System.out.println("Price is valid:"+price);
		}
		else{
			System.out.println("Price is in-valid:"+price);
			return;
		}
		
		if(goldSmithName!=null){
			System.out.println("Name of the goldsmith is valid:"+goldSmithName);
		}
		else{
			System.out.println("Name of the goldsmith is in-valid:"+goldSmithName);
			return;
		}
		if(exp>0){
			System.out.println("Excperince is valid:"+exp);
		}
		else{
			System.out.println("Excperince is in-valid:"+exp);
			return;
		}
		
	}
}