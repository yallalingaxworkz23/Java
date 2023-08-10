package yallu.java_9_8.app;

public class Hotel {
      public String name;
      public String place;
      public String city;
      public int noofhotel;
      public int noofworker;
      
      public void hotelemploy()
      {
    	  System.out.println("invoking the data in hotelemploy");
      }
      public void hotelemploy(String name) 
      {
    	  System.out.println("invoking tha data in hotelemploy with name");
      }
      public void hotelemploy(String name,String place)
      {
    	  System.out.println("invoking the data in hotelemploy with name and place");
      }
      public void hotelemploy(String name ,String place,String city)
      {
    	  System.out.println("invokig the date in hotelemploy with name and place and city ");
      }
      public void hotelemploy(int nofohotel)
      {
    	  System.out.println("invoking tha data in hotelemlploy with num of hotel");
      }
      public void hotelemploy(int nofohotel,int noofworker)
      {
    	  System.out.println("invoking tha data in hotelemploy with number of hotel and no of worker");
      }

}
