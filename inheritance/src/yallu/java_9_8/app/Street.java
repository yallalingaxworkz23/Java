package yallu.java_9_8.app;

public class Street {
    String streetname;
    String city;
    String cross;
    int streetnu;
	char streetblock;
   
    public void cross()
	{
		System.out.println("involing the data in street ");
	}
	public void cross(String name)
	{
		System.out.println("invoking the data in street with street name");
	}
	public void cross( String name,String city)
	{
		System.out.println("invoking the data in street with street name and place");
	}
	public void cross(int num,String cross,String city)
	{
		System.out.println("invoking the data in street with  no of road and area and city");
	}
	public void cross(char block)
	{
		System.out.println("invoking the data in street with street total number of block");
	}
	public void cross(String name,int num)
	{
		System.out.println("invoking the data in street with street name and number");
	}

}
