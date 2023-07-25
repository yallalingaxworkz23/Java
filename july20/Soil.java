class Soil{
	static String type;
	 int cost;
	static String colour;
	String place;
	
	 Soil(String type,int cost,String colour,String place){
		System.out.println("invoking in main method");
		this.type=type;
		this.cost=cost;
		this.colour=colour;
		this.place=place;
	}
	static {
		type="2nd";
		colour="red";
		System.out.println("invoking in static");
	}
	static void printstatic()
	{
		System.out.println("invoking in static ");
		System.out.println(type);
		System.out.println(colour);
	}
	void printlnstance()
	{
		System.out.println("invoiking in intance");
		System.out.println(cost);
		System.out.println(place);
	}
}