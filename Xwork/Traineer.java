class Traineer{
	static void teach()
	{
		System.out.println("Invoking teach() in Traineer");
	}
	static void teach(String topic)
	{
		System.out.println("Topic teach:"+topic);
	}
	static void student()
	{
		System.out.println("Invoking student() in Traineer");
		int numberstudent=70;
		System.out.println("Number of Student:"+numberstudent);
	}
	
	static void student(int numberStudent)
	{
		System.out.println("Number of Student:"+numberStudent);
	}
	static void develop(String skill)
	{
		System.out.println("Develop skills:"+skill);
	}
	static void trainingplan()
	{
		System.out.println("Training plan in Traineer");
	}
	static void trainingplan(int trainingHours)
	{
		System.out.println("Total training Hours:"+trainingHours);
	}
	static void trainingplan(int trainingHours, int numberDays)
	{
		System.out.println("Total training Hours:"+trainingHours);
		System.out.println("Total Number of training Days:"+numberDays);
	}
	static void trainingplan(String trainingMaterial)
	{
		System.out.println("Training material:"+trainingMaterial);
	}
	static void trainingplan(String trainingMaterial, String trainingMethod)
	{
		System.out.println("Training material:"+trainingMaterial);
		System.out.println("Training method:"+trainingMethod);
	}
	
	
}