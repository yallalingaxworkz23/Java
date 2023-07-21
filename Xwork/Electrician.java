class Electrician{

  static void repair(){
	   System.out.println("He does electric device repair");
	}
  static void repair(String name){
	  System.out.println("he repairs:"+name);
	}
  static void repair(int exp){
	   System.out.println("He has electric repair experience of:"+exp);
	}
  static void repair(float salary){
	  System.out.println("he has a salary of rs:"+salary);
  }
  static void repair(byte age){
	 System.out.println("the electrician age is :"+age); 
	 
  }
  static void install(String name){
	  System.out.println("Electrician installs electric devices:"+name);
	  
  }
  static void install(int num){
	  System.out.println("Electrician installs electric devices:"+num);
  }
  static void maintains(){
	  System.out.println("Electrician maintains the electric device he installs");
  }
  static void replace(){
	  System.out.println("Electrician replaces the device which is not working");
  }
  static void checkStatus(){
	  System.out.println("Electrician check status o working electric devices");
  }
  

  
}