class CarpenterRunning
{
	public static void main(String[] args)
	{
		System.out.println("invoking in the main Carpenter");
        Carpenter.buildStructure();
	    Carpenter.buildStructure("hammer","wateless");
        Carpenter.make("yallalinga");
        Carpenter.make("yallu",50000);
        Carpenter.toolUsed("hammer",2);
        Carpenter.toolUsed("hammer gun");
        Carpenter.toolUsed("liver","kumar",60000);
        Carpenter.toolUsed(100);
        Carpenter.workExp();
        Carpenter.workExp(2);
           		
	}
}