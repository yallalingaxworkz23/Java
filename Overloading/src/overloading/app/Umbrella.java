package overloading.app;

public class Umbrella {
   public void rain()
   {
	   System.out.println("invoing with no args");
	   rain(250,5);
   }
   public void rain(double cost)
   {
	   System.out.println("invoking umbrella cost");
	   System.out.println("umbralla price:"+cost);
   }
   public void rain(int count)
   {
	   System.out.println("invoking umbrella count");
	   System.out.println("number of uberalla:"+count);
   }
   public void rain(double cost,int count)
   {
	   System.out.println("invoking both cost and count");
	   rain(cost);
	   rain(count);
   }
}
