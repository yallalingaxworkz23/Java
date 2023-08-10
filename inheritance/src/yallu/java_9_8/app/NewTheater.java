package yallu.java_9_8.app;

public class NewTheater extends Theater {
   
    @Override
	public void movie()
	{
		System.out.println("invoking the data in theater ");
	}
	public void movie(String name)
	{
		System.out.println("invoking the data in theater name");
	}
	public void movie(String name,String plce)
	{
		System.out.println("invoking the data in theater name and place");
	}
	public void movie(String name,int sets)
	{
		System.out.println("invoking the data in theater name and number of sets");
	}
	public void movie(int noofscreen,String name)
	{
		System.out.println("invoking the data in theater name and number of screen");
	}
	public void movie(int noofscreen,int sets)
	{
		System.out.println("invoking the data in theater no of screen and sets");
	}
	
}
