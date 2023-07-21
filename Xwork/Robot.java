class Robot
{
	static String aboutRobot(String name)
	{
		if(name!=null)
		{
		System.out.println("informaction about robot");
		       if("robot"==name)
		       {
	              System.out.println("i am robo");
				  return "i am robot";
                }
				else
				{System.err.println("i am not robo");
			
				}	
		if("back"==name)
		{
			return "forword moving";
		}
		}
		
		else{
			System.err.println("given statement is invalid");
		
		}
		
	return "hii";
	}
}
	
