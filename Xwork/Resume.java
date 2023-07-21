class Resume
{
	static void formate()
	{
		System.out.println("invoking resume in job");
		String type="combitional resume";
		System.out.println("resume type:"+type);
		
	}
	static void formate(String type)
	{
		System.out.println("invoking formate in resume:"+type);
	}
	static void formate(String type,int pages)
	{
		System.out.println("involking formate type:"+type+"pages:"+pages);
	}
	static void clear()
	{
		System.out.println("invoking clear in the resume");
	}
	static void delete()
	{
		System.out.println("invoking delete in the resume");
	}
}