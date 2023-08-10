package yallu.java_9_8.boot;

import yallu.java_9_8.app.NewTheater;
import yallu.java_9_8.app.Theater;

public class TheaterRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theater theater=new NewTheater();
		theater.movie();
		theater.movie("yallu");
		theater.movie("yallu","manvi");
		theater.movie("yallu",150);
		theater.movie(4,"yallu");
		theater.movie(4,150);
		
    System.out.println("#################");		
     
    Theater theater1=new NewTheater();
    theater1.movie();
	theater1.movie("yallu");
	theater1.movie("yallu","manvi");
	theater1.movie("yallu",150);
	theater1.movie(4,"yallu");
	theater1.movie(4,150);
	

	}

}
