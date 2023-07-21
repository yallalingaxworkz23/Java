class PersonAge
{
	static int getAgeByName(String personName)
	{
		System.out.println("Invoking getAgeByName() in Person");
		if(personName!=null)
		{
			System.out.println("Person Name is Valid");
			if(personName=="Archana")
			{
				return 21;
			}
			if(personName=="Darshan")
			{
				return 20;
			}
			if(personName=="Sai")
			{
				return 22;
			}
			if(personName=="Anjali")
			{
				return 45;
			}
			if(personName=="Akshay")
			{
				return 25;
			}
			if(personName=="Kavya")
			{
				return 10;
			}
			if(personName=="Sanjay")
			{
				return 23;
			}
			if(personName=="Satyam")
			{
				return 12;
			}
			if(personName=="Ranjita")
			{
				return 20;
			}
			if(personName=="Amulya")
			{
				return 30;
			}
			if(personName=="Harshita")
			{
				return 21;
			}
		}
		else
		{
			System.err.println("Name is not valid");
		}
		return 100;
	}
	
}