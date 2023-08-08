package xwork.app;

public class Company {
  public String name;
  public String ceo;
  public String origineCountary;
  
  public Company(String name,String ceo,String origineCountry)
  {
	this.name=name;
	this.ceo=ceo;
	this.origineCountary=origineCountry;
  }
  public void printInfo()
  {
	  System.out.println("name:"+name);
	  System.out.println("ceo:"+ceo);
	  System.out.println("origineCountry:"+origineCountary);
	  
  }
  
}
