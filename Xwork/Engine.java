class Engine
{
	static int getCCByModel(String modelName)
	{
		System.out.println("Invoking getCCByModel() method in Engine ");
		
		if(modelName!=null)
		{
		System.out.println("Model Name is valid");
		 if("Swift"==modelName)
		 {
			 return 1120;
		 }		
         if("Rapid"==modelName)
		 {
			 return 999;
		 }	
          if("BMW"==modelName)
		 {
			 return 2998;
		 }	
         if("Benz"==modelName)
		 {
			 return 1993;
		 }		
         if("Audi"==modelName)
		 {
			 return 1998;
		 }	
         if("Bently"==modelName)
		 {			 
			 return 3993;
		 }
		}
		else
		{
			System.err.println("Not valid");
		
		}
		return 999;
	}
	

}