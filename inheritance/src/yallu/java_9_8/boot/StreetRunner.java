package yallu.java_9_8.boot;

import yallu.java_9_8.app.NewStreet;
import yallu.java_9_8.app.Street;

public class StreetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Street street=new NewStreet();
		street.cross();
		street.cross("bashamcircle");
		street.cross("bashamcircle","benglour");
		street.cross(6,"6th","benglour");
		street.cross("b");
		street.cross("bshamcircle",3);
		
		System.out.println("%%%%%%%%%%%%");
		
		Street street1=new NewStreet();
		street1.cross();
		street1.cross("vijaynagar");
		street1.cross("vijaynagar","benglour");
		street1.cross(4,"7th","benglour");
		street1.cross("d");
		street1.cross("vijay nagar",6);
		

	}

}
