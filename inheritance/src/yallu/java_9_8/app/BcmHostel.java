package yallu.java_9_8.app;

public class BcmHostel extends Hostel {
	
	 @Override
   	  public void warden()
		{
			System.out.println("involing the data in hostel ");
		}
		public void warden(String name)
		{
			System.out.println("invoking the data in  hostel with  hostel name");
		}
		public void warden( String name,String city)
		{
			System.out.println("invoking the data in  hostel with  hostel name and place");
		}
		public void warden(int room,String area,String city)
		{
			System.out.println("invoking the data in  hostel with  no of student and area and city");
		}
		public void warden(int room)
		{
			System.out.println("invoking the data in  hostel with  total number of room");
		}
		public void warden(String name,int people)
		{
			System.out.println("invoking the data in  hostel with  hostel name and student");
		}



}
