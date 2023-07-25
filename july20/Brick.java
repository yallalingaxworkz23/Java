class Brick{
	static String type;
	static String colour;
	String lifespan;
	int cost;
	
	Brick(String type,String colour,String lifespan,int cost)
	{
		this.type=type;
		this.colour=colour;
		this.lifespan=lifespan;
		this.cost=cost;
	}
	static{
		System.out.println("invoking in static ");
		type="1st";
		colour="red";
	}
	static void printstatic()
	{
		System.out.println("invoking in static");
		System.out.println(type);
		System.out.println(colour);
	}
	void printlnstance()
	{
		System.out.println("invoking in instance");
		System.out.println(lifespan);
		System.out.println(cost);
	}
}