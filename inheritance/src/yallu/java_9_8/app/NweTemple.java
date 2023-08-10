package yallu.java_9_8.app;

public class NweTemple extends Temple{
	
	  @Override
	   public void god()
		{
			System.out.println("involing the data in library ");
		}
		public void god(String name)
		{
			System.out.println("invoking the data in Temple with Temple name");
		}
		public void god( String name,String city)
		{
			System.out.println("invoking the data in Temple with Temple name and place");
		}
		public void god(int doors,String area,String city)
		{
			System.out.println("invoking the data in Temple with Temple no of dors and area and city");
		}
		public void god(int worker)
		{
			System.out.println("invoking the data in Temple witha Temple total number of workers");
		}
		public void god(String name,int workers)
		{
			System.out.println("invoking the data in Temple with Temple name and workers");
		}
}



