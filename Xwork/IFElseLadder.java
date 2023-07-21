class IFElseLadder
{
	public static void main(String[] args)
	{
		System.out.println("Example for IF ELSE Ladder...");
		System.out.println();
		int day = 3;
		String dayName;

		if (day == 1) 
		{
			dayName = "Monday";
		}
		else if (day == 2) 
		{
			dayName = "Tuesday";
		} 
		else if (day == 3) 
		{
			dayName = "Wednesday";
		} 
		else if (day == 4) 
		{
			dayName = "Thursday";
		} 
		else if (day == 5) 
		{
			dayName = "Friday";
		} 
		else if (day == 6) 
		{
			dayName = "Saturday";
		} else 
		{
			dayName = "Sunday";
		}

		System.out.println("Today is " + dayName + ".");

	}
}