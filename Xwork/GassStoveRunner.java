class GassStoveRunner
{
	public static void main(String[] args)
	{
		System.out.println("running in main method");
		String gassName="yalu";
		int price=1110;
		int numOfBurner=0;
		
		String company="kumar";
		int cost=150;
		int people=0;
		GassStove.cooking(gassName,price,numOfBurner);
		System.out.println("$$$$$$$$$$$$$$$$$$$$");
		GassStove.cooking(company,cost,people);
	}
	
	
}