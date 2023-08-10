package yallu.java_9_8.boot;

import yallu.java_9_8.app.Hotel;
import yallu.java_9_8.app.NewHotel;

public class HotelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("running in the main HotelRunner");
      Hotel hotel=new NewHotel();
      hotel.hotelemploy();
      hotel.hotelemploy("yallu");
      hotel.hotelemploy("yallu","manvi");
      hotel.hotelemploy("yallu","manvi","raichur");
      hotel.hotelemploy(5);
      hotel.hotelemploy(5,50);
      
      System.out.println("%%%%%%%%%%%%%%");
      
      Hotel hotel1=new NewHotel();
      hotel1.hotelemploy();
      hotel1.hotelemploy("kumar");
      hotel1.hotelemploy("kumar","manvi");
      hotel1.hotelemploy("kumar","manvi","raichur");
      hotel1.hotelemploy(7);
      hotel1.hotelemploy(7,57);
      
      
      
	}

}
