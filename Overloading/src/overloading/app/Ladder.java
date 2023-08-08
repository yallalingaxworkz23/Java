package overloading.app;

public class Ladder {
	public void climb()
	{
		System.out.println("invoking in with no arguments");
		climb(70,"folded");
	}
	public void climb(double height)
	{
	 System.out.println("invoking in ladder height ");
	 System.out.println("ladder hight is:"+height);
	}
	public void climb(String type)
	{
		System.out.println("invoking the ladder type");
		System.out.println("ladder type is:"+type);
	}
	public void climb(double height,String type)
	{
		System.out.println("invoking both height and type");
		climb(height);
		climb(type);
	}

}
