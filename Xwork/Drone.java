class Drone
{
	static double getDistanceByFlight(String operator,String event)
	{
		System.out.println("invoking in the drone ");
		if(operator!=null && event!=null)
		{
			System.out.println("given operator and event is valid");
			if("kumar"==operator && "work"==event)
			{
				return 1.0;
			}
			if("sai"==operator && "sleep"==event)
			{
				return 2.0;
			}
			
		}
		else
		{
		 System.out.println("given name and event is invalid");
         return 8.0; 		 
		}
		return 3.0;
	}
	

     static double getPricePerEvent(String eventName)
	 {
		 System.out.println("invoking in main method");
		 if(eventName!=null)
		 {
			 System.out.println("given event is vaid");
			 if("kumar"==eventName)
			 {
				 return 4.0;
			 }
			 
	     }
		 else
		 {
			 System.out.println("given event name is invalid");
			 return 7.7;
		 }
		 
         return 0.0;
     }
	 
	 static int getDiscountByEvent(String eventName,String refPerson)
	 {
		 System.out.println("invoking in method");
		 if(eventName!=null && refPerson!=null)
		 {
			System.out.println("given event name is valid"); 
			if("yallu"==eventName && "kumar"==refPerson)
			{
				return 1;
			}
			if("yallu"==eventName && "kumar"==refPerson)
			{
				return 3;
			}
			return -1;
			
		 }
		 else{
			 System.out.println("given event name is invalid");
			 return 23;
		 }
	 }
}

