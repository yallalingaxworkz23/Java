class Power{
	static String volts;
	static String place;
	int cost;
	int numofhouse;
	
	Power(String volts,String place,int cost,int numofhouse)
	{
		this.volts=volts;
		this.place=place;
		this.cost=cost;
		this.numofhouse=numofhouse;
	}
	static{
		System.out.println("invoking in static");
		volts="750v";
		place="manvi";
	}
	static void printstatic()
	{
		System.out.println("invoking in static ");
		System.out.println(volts);
		System.out.println(place);
	}
	void printlnstance()
	{
		System.out.println("invoking in instance");
		System.out.println(cost);
		System.out.println(numofhouse);
	}
	
}