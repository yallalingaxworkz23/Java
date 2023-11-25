package xworz.com.logic.app;

public class SampleIneritance {
	String name;
	String fname;
	String mname;
	
	public void Sun1() {
		
	}
	public void Sun1(String name) {
		this.name=name;
		System.out.println("sun1 name:"+name);
		
	}
	public void Sun1(String name,String fname) {
		this.name=name;
		this.fname=fname;
		System.out.println("sun1 name and:"+name+"father name is :"+fname);
	}
	public void Sun1(String fname,String mname,String name) {
		this.fname=fname;
		this.mname=mname;
		this.name=name;
		System.out.println("sun1 father name is:"+fname+" :mother name is:"+mname+" name is:"+name);
	}

}
