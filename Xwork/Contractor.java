class Contractor{
	
	static void servantLeadership(int numberOfServant)
	{
		System.out.println("invoking servant in contractor");
		System.out.println("Number of servant:"+ numberOfServant);
	}
	static void customer(String name)
	{
		System.out.println("invoking customer in contractor");
		System.out.println("Name:"+name);
	}
	static void customer(int numberOfCustomer)
	{
		System.out.println("invoking customer in contractor");
		System.out.println("Number of customer:"+numberOfCustomer);
	}
	static void Communication()
	{
		System.out.println("invoking communication in contractor");
		String communicationLanguage="Kannada";
		System.out.println("Communication:"+communicationLanguage);
	}
	static void location(String locationName)
	{
		System.out.println("invoking location in contractor");
		System.out.println("Location Name:"+locationName);
	}
	static void location(int distance)
	{
		System.out.println("invoking location in contractor");
		System.out.println("Distance:"+ distance);
	}
	static void workers(int numberOfWorkers)
	{
		System.out.println("invoking workers in contractor");
		System.out.println("Workers:"+numberOfWorkers);
	}
	static void time(int startTime)
	{
		System.out.println("invoking time in contractor");
		System.out.println("Start time:"+startTime);
	}
	static void time(float stopTime)
	{
		System.out.println("invoking time in contractor");
		System.out.println("Stop time:"+stopTime);
	}
	static void project(int number)
	{
		System.out.println("invoking project in contractor");
		System.out.println("Number of projects:"+number);
	}
}