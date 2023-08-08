package overloading.app;

public class Specs {
     public void types() 
     {
    	System.out.println("invoking in no args"); 
    	types(3,"human");
     }
     public void types(int types)
     {
    	  System.out.println("invoking typs");
    	  System.out.println("no of types:"+types);
     }
     public void types(String name)
     {
    	 System.out.println("invoking types name");
    	 System.out.println("types name:"+name);
     }
     public void types(int types,String name)
     {
    	 System.out.println("invoking types and name");
    	 types(types);
    	 types(name);
     }
}
