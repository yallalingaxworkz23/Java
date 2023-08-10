package yallu.java_9_8.app;

public class Library {
	String name;
	String city;
	String area;
	int noofbooks;
	int noofworker;
	
	public void books()
	{
		System.out.println("involing the data in library ");
	}
	public void books(String name)
	{
		System.out.println("invoking the data in library with library name");
	}
	public void books( String name,String city)
	{
		System.out.println("invoking the data in library with library name and place");
	}
	public void books(int books,String area,String city)
	{
		System.out.println("invoking the data in library with library no of books and area and city");
	}
	public void books(int worker)
	{
		System.out.println("invoking the data in library witha library totao number of workers");
	}
	public void books(String name,int workers)
	{
		System.out.println("invoking the data in library with library name and workers");
	}

}
