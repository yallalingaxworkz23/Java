class Mall{
	String name;
	String mallType;
	String location;
	String owner;
	int components;
	double constructionCost;
	int areaInSqft;
	
	Mall(){
		super();
		System.out.println("Invoking no-arg constructor of Mall");
	}
	Mall(String name,String mallType){
		this();
		this.name=name;
		this.mallType=mallType;
		System.out.println("Invoking string,stringconstructor of Mall");	
	}
	Mall(String name,String mallType,String location){
		this();
		this name=name;
		this mallType=mallType;
		this.location=location;
		System.out.println("Invoking string,string,string constructor of Mall");
	}
	Mall(String name,String mallType,String location,String owner){
		this name=name;
		this mallType=mallType;
		this location=location;
		this.owner=owner;
		System.out.println("Invoking string,string,String,string constructor of Mall");
	}
	Mall(String name,String mallType,String location,String owner,int components){
		this(name,mallType,location,owner);
		this.components=components;
		System.out.println("Invoking string,String,string,String,int constructor of Mall");
	}
	Mall(String name,String mallType,String location,String owner,int components,double constructionCost){
		this(name,mallType,location,owner,components);
		this.constructionCost=constructionCost;
		System.out.println("Invoking string,String,string,String,int,double constructor of Mall");
	}
	Mall(String name,String mallType,String location,String owner,int components,double constructionCost,int areaInSqft){
		this(name,mallType,location,owner,components,constructionCost);
		this.areaInSqft=areaInSqft;
		System.out.println("Invoking string,double,String,string,int constructor of Mall");
	}
}