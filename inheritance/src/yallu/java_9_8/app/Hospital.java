package yallu.java_9_8.app;

public class Hospital {
   public String name;
   public String place;
   public String dcname;
   public int nofodoc;
   public int fee;
    
   
   public void doc()
   {
	  System.out.println("invoking the data in Doctor"); 
   }
   public void doc(String name)
   {
	   System.out.println("invoking tha date in doctor with name");
   }
   public void doc(String name,String place)
   {
	   System.out.println("invoking tha data in doctor with name and place");
   }
   public void doc(String name,String place,String dcname)
   {
	   System.out.println("invoking tha data in doctor with name and place and doctor name");
   }
   public void doc(int nofodoc)
   {
	   System.out.println("invoking tha data in doctor with num of doctor in hospital");
   }
   public void doc(String dcname,int fee)
   {
	   System.out.println("invoking the data in doctor fee with name");
   }
}
