class Park{
	String name;
	String owner;
	String area;
	String city;
	int fee;
	double length;
	int noofpeople;
	int chars;
	int limits;
	
	Park(){
		super();//it call another object class constructor
		System.out.println("park");
	}
	Park(String name){
		this();
		this.name=name;
		System.out.println("about park");
	}
	Park(String name,String owner){
		this(name);
		this.owner=owner;
		System.out.println("about owner");
	}
	Park(String name,String owner,String area){
		this(name,owner);
		this.area=area;
		System.out.println("about area");
	}
	Park(String name,String owner,String area,String city){
		this(name,owner,area);
		this.city=city;
		System.out.println("about area");
	}
	Park(String name,String owner,String area,String city,int fee){
		this(name,owner,area,city);
		this.fee=fee;
		System.out.println("about fee");
	}
	Park(String name,String owner,String area,String city,int fee,double length){
		this(name,owner,area,city,fee);
		this.length=length;
		System.out.println("about leangth");
	}
	Park(String name,String owner,String area,String city,int fee,double length,int noofpeople){
		this(name,owner,area,city,fee,length);
		this.noofpeople=noofpeople;
		System.out.println("about no of people");
	}
	Park(String name,String owner,String area,String city,int fee,double length,int noofpeople,int chars){
		this(name,owner,area,city,fee,length,noofpeople);
		this.chars=chars;
		System.out.println("about chars");
	}
	Park(String name,String owner,String area,String city,int fee,double length,int noofpeople,int chars,int limits){
		this(name,owner,area,city,fee,length,noofpeople,chars);
		this.limits=limits;
		System.out.println("about people limits");
	}
}