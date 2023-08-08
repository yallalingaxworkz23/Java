package overloading.app;

public class Hotel {
   public void cook()
   {
	System.out.println("invoking hotel with no args");
	cook("sairam ",5);
	
   }
   public void cook(String name)
   {
	   System.out.println("invoking hotal name");
	   System.out.println("hotel name is :"+name);
   }
   public void cook(double distance)
   {
	   System.out.println("invoking hotal place");
	   System.out.println("hotal distance in km:"+distance);
   }
   public void cook(String name,double distance)
   {
	   System.out.println("hotal name and location");
	   cook(name);
	   cook(distance);
   }
}
