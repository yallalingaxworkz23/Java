class ResumeRunner
{
	public static void main(String[] args)
	{
		System.out.println("running  main in resume running");
		Resume.formate();
		Resume.formate("skill based");
		Resume.formate("functional resume",2);
		Resume.clear();
		Resume.delete();
		
	}
}