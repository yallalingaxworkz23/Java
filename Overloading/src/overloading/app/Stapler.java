package overloading.app;

public class Stapler {
   public void pin()
   {
	   System.out.println("invoking the 0 args");
	   pin(50,"tata");
   }
   public void pin(int price)
   {
	   System.out.println("invoking the pins");
	   System.out.println("stapler price is:"+price);
	   
   }
   public void pin(String brand)
   {
	   System.out.println("invoking the brand name");
	   System.out.println("company name is :"+brand);
   }
   public void pin(int price,String brand)
   {
	   System.out.println("invoking both price and brand ");
	   pin(price);
	   pin(brand);
   }
}
