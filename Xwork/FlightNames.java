class FlightNames
{
	public static void main(String[] args)
	{
		System.out.println("running in the main method");
		String kingfisher="Kingfisher";
		String emirates="Emirates";
		String airindia="AirIndia";
		String indeigo="Indeigo";
		String qatar="Qatar";
		String[] Flightnames={kingfisher,emirates,airindia,indeigo,qatar,"airasia","vistara"};
		for (int flight=0;flight<Flightnames.length;flight++)
		{
			System.out.println("elements at index:"+flight+"is:"+Flightnames[flight]);
		}
		System.out.println("elements at index 5 before change:"+Flightnames[5]);
		Flightnames[5]="vistara";
		System.out.println("elementa at index 5 after change:"+Flightnames[5]);
		System.out.println("elements at index 2 before change :"+Flightnames[2]);
		Flightnames[2]="airasia";
		System.out.println("elements at index 2 after change:"+Flightnames[2]);
		for (int names=Flightnames.length-1;names>=0;names-- )
		{
			System.out.println("elements at index:"+names+"is:"+Flightnames[names]);
		}
	}
}