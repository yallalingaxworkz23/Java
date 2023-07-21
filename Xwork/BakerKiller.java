class BakerKiller{
	public static void main (String[] args){
		System.out.println("Running main in BakerKiller`");
		
		
		String foodItem="Samosa";
		int noOfPeople=5;
		String workingFor="";
		int exp=2;
		int duration=5;
		String assistance="yes";
		
		String item="Ice Cake";
		int hours=7;
		
		Baker.cooking(foodItem,noOfPeople,workingFor,exp,duration,assistance);
		System.out.println("");
		Baker.cooking(item,noOfPeople,workingFor,exp,hours,assistance);
		
	
		
		
	}
}