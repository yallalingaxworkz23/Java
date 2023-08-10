package yallu.java_9_8.app;

public class NewStreet extends Street{
    
	@Override
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
	public void cross(int num,String area,String city)
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
