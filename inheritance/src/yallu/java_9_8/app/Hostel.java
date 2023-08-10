package yallu.java_9_8.app;

public class Hostel {
    public String hostelname;
    public  String city;
    public String area;
    public int noofstud;
	public  int noofroom;
   
   
   
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
	public void warden(int doors,String area,String city)
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
