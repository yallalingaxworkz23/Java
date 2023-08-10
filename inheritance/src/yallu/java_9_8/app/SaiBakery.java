package yallu.java_9_8.app;
public class SaiBakery extends Bakery{
	
	@Override
	 public void makeCake()
    {
  	  System.out.println("invoking makeCake in Saibakery");
    }
    public void makeCake(String name)
    {
  	  System.out.println("invoking the makeCake emplayname");
    }
    public void makeCake(String name,String place)
    {
  	  System.out.println("invoking the makeCake emplyname and place"); 
    }
    public void makeCake(String name,String place,String city)
    {
  	  System.out.println("invoking the makeCake emplyname and place and city");
    }
    public void makeCake(String name,String place,String city,int cakecost)
    {
  	  System.out.println("invoking the makeCake eemplyname and place and city and cakecost");
    }
    public void makeCake(String name,String place,String city,int cakecost,int noofworker)
    {
  	  System.out.println("invoking the makeCake emplyname and place and city and cakecost and noofworker");
    }
}
