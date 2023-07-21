class Cycle
{
  String brand;
  int price;
  String name;
  
  Cycle(){
  System.out.println("invoking in main method:"+this.brand);
  System.out.println("invoking in main method:"+this.price);
  System.out.println("invoking in main method:"+this.name);
  this.brand="tata";
  this.price=10000;
  this.name="yallu";
  }
   Cycle(String brand,int price,String name){
	   System.out.println("invoking in main method:"+this.brand);
       System.out.println("invoking in main method:"+this.price);
       System.out.println("invoking in main method:"+this.name);
       this.brand=brand;
       this.price=price;
       this.name=name;
	   
   }
}