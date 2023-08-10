package yallu.java_9_8.boot;

import yallu.java_9_8.app.Bakery;
import yallu.java_9_8.app.SaiBakery;

public class BakeryRunner {

	public static void main(String[] args) {
		System.out.println("Running main in HotelRunner");

		Bakery bakery = new SaiBakery();
		bakery.makeCake();
		bakery.makeCake("Shri");
		bakery.makeCake("Shri", "Bangalore");
		bakery.makeCake("Shri", "Bangalore", " SaiBakery");
		bakery.makeCake("Shri", "Bangalore", "Gourmet Bakery",9);
		bakery.makeCake("Shri", "Bangalore", "Gourmet Bakery",9,10);

		System.out.println("****************************");
		SaiBakery bakery1 = new SaiBakery();
		bakery1.makeCake();
		bakery1.makeCake("Shri");
		bakery1.makeCake("Shri", "Bangalore");
		bakery1.makeCake("Shri", "Bangalore", "SaiBakery");
		bakery1.makeCake("Shri", "Bangalore", "YalluBakery",90);
		bakery1.makeCake("Shri", "Bangalore", "KumarBakery",90,100);



	}

}
