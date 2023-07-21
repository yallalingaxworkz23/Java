class JobRunner
{
    public static void main(String[] args)
	{
		System.out.println("Running in main method");
		Job.apply();
		Job.apply("yallu",1);
		Job.apply("yallu",2,"kumar");
		Job.apply(3);
		Job.rejectOffer();
	}
}