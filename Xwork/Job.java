class Job
{
	static void apply()
	{
		System.out.println("invoking apply in job");
	}
	static void apply(String personname,int exc)
	{
		System.out.println("invoking apply(String,int)in job");
		System.out.println("name:"+personname+",experence:"+exc);
		System.out.println("");
	}
	static void apply(String name,int exp,String refName)
	{   
		System.out.println("invoking apply in job");
		System.out.println("name:"+name+",exp:"+exp+",personname :"+refName);
		System.out.println("");
	}
	static void apply(int exp)
	{  System.out.println("invoking apply(int exp)");
	   System.out.println("expreance:"+exp);
	}
	static void rejectOffer()
	{
		System.out.println("invoking rejectoffer()");
		Boolean rejectoffer=true;
		System.out.println("reject off:"+rejectoffer);
	}
}