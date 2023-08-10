package yallu.java_9_8.app;

public class Mall {
  public String mallname;
  public String mallloc;
  public int mallfloor;
  
  public void data()
  {
	  System.out.println("invokig the data for mall");
  }
  public void data(String name)
  {
	  System.out.println("invoking the data for mall with name");
  }
  public void data(String name,String loc)
  {
	  System.out.println("invoking tha data for mall with name and location");
  }
  public void data(int floor)
  {
	  System.out.println("invoking the data for mall with number of floor");
  }
  public void data(int floor,String name)
  {
	  System.out.println("invoking the data for mall with floor and company name");
  }
  public void data(String name,int floor)
  {
	  System.out.println("invoking the data for mall with mall name and nu of floor");
  }
}
