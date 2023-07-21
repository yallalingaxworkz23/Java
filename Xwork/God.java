class God{
	String name;
	String sons;
	int number;
	
	God(){
		System.out.println("name:"+this.name);
		System.out.println("sons:"+this.sons);
		System.out.println("how many:"+this.number);
		this.name="RAM";
		this.sons="lava";
		this.number=1;
		
	}
	God(String name,String sons,int number){
		System.out.println("name:"+this.name);
		System.out.println("sons:"+this.sons);
		System.out.println("number:"+this.number);
		this.name=name;
		this.sons=sons;
		this.number=number;
	}
    God(String name,int number,String sons){
		System.out.println("name:"+this.name);
		System.out.println("sons:"+this.sons);
		System.out.println("how maney:"+this.number);
		this.name=name;
		this.sons=sons;
		this.number=number;
		return ;
	}
		
	//}
}