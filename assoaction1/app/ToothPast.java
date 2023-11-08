package xwork.app;

public class ToothPast {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
     public  String name;
     public String brand;
     public Company company;
     public Ingredents[] ingredents;
     
   public ToothPast(String name,String brand,Company company,Ingredents[] ingredents) {
	   this.name=name;
	   this.brand=brand;
	   this.company=company;
	   this.ingredents=ingredents;
   }
   public void printInfo() {
	   System.out.println("toothpast name:"+this.name);
	   System.out.println("toothpast brand:"+this.brand);
	   
	   company.printInfo();  
	   for (int inger = 0; inger <= ingredents.length-1; inger++)
	   {
		Ingredents ref1=ingredents[inger];
		System.out.println("ingredents is:"+ref1);
		ref1.printInfo();
	   }
   

}
   }
