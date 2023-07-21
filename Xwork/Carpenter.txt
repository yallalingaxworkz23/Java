class Carpenter
{
	static void buildStructure()
	{
		System.out.println("Running buildStructure() in Carpenter class");
		System.out.println("\n");
	}
	
	static void buildStructure(String tool, String type)
	{
		System.out.println("Running buildStructure() in Carpenter class");
		System.out.println("Tool:"+tool);
		System.out.println("Type:"+type);
		System.out.println("\n");
	}
	
	static void make(String carpName)
	{
	    System.out.println("Running make(String) in Carpenter class");
		System.out.println("Name:"+carpName);
		System.out.println("\n");
		
	}
	
	static void make(String carpName, int cost)
	{
	    System.out.println("Running make(String, int) in Carpenter class");
		System.out.println("Name:"+carpName);
		System.out.println("Cost:"+cost);
		System.out.println("\n");
		
	}
	static void toolsUsed(String toolName, int quantity)
	{
		System.out.println("Running toolsUSed(String, int) in Carpenter class");
		System.out.println("Name:"+toolName);
		System.out.println("Quantity:"+quantity);
	}
	static void toolsUsed(String toolName)
	{
		System.out.println("Running toolsUSed(String) in Carpenter class");
		System.out.println("Name:"+toolName);
		
	}
	static void toolsUsed(String name, String workerName,int cost)
	{
		System.out.println("Running toolsUSed(String, String, int) in Carpenter class");
		System.out.println("Name:"+name);
		System.out.println("Worker Name:"+workerName);
		System.out.println("Cost:"+cost);
		System.out.println("\n");
	}
	static void toolsUsed(int cost)
	{
		System.out.println("Running toolsUSed(int) in Carpenter class");
		System.out.println("Cost:"+cost);
		System.out.println("\n");
	}
	static void workExp()
	{
		System.out.println("Running workExp(int) in Carpenter class");
		workExp(5);
		System.out.println("\n");
	}
	static void workExp(int exp)
	{
		System.out.println("Running workExp(int) in Carpenter class");
		System.out.println("Experience:"+exp);
	}
}