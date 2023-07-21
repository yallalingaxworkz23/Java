class Malll
{
  String name;
  String location;
  String ownername;
  int mallcost;
  double mallsizeft;
   int mallheight;
  String city;
   Malll(){
	super();
	System.out.println("about mall");
	}
	Malll(String name){
		this();
		this.name=name;
		System.out.println("mall name");
	}
	Malll(String name,String location){
		this(name);
		this.location=location;
		System.out.println("mall location");
	}
	Malll(String name,String location,String ownername){
		this(name,location);
		this.ownername=ownername;
		System.out.println("mall ownername");
	}
	Malll(String name,String location,String ownername,int mallcost){
		this(name,location,ownername);
		this.mallcost=mallcost;
		System.out.println("mall cost");
	}
	Malll(String name,String location,String ownername,int mallcost,double mallsizeft){
		this(name,location,ownername,mallcost);
		this.mallsizeft=mallsizeft;
		System.out.println("mall sizeft");
	}
	Malll(String name,String location,String ownername,int mallcost,double mallsizeft,int mallheight){
		this(name,location,ownername,mallcost,mallsizeft);
		this.mallheight=mallheight;
		System.out.println("mallheight");
	}
	Malll(String name,String location,String ownername,int mallcost,double mallsizeft,int mallheight,String city){
		this(name,location,ownername,mallcost,mallsizeft,mallheight);
		this.city=city;
		System.out.println("mall city");
	}
	
   
}