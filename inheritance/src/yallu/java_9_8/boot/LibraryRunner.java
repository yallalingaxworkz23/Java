package yallu.java_9_8.boot;

import yallu.java_9_8.app.Library;
import yallu.java_9_8.app.NewLibrary;

public class LibraryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("running in the main library method");
      Library library=new NewLibrary();
      
      library.books();
      library.books("SaiRam");
      library.books("SaiRam","Raichur");
      library.books(500,"jayanagar","Raichur");
      library.books(20);
      library.books("SaiRam",20);
      
      System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
      
      
     Library library1=new NewLibrary();
      
      library1.books();
      library1.books("SaiRam");
      library1.books("SaiRam","Raichur");
      library1.books(500,"jayanagar","Raichur");
      library1.books(20);
      library1.books("SaiRam",20);
	}
}
