package presentation.com.xwork.app;

public class Info {
	 public String name;
	 public String fname;
	public Info(String name,String fname) {
		this.name=name;
		this.fname=fname;
	}
	

}
class InfoRunner{

	public static void main(String[] args) {
		Info info=new Info("yallu","kumar");
		System.out.println("name is :"+info.name);
		System.out.println("fname is :"+info.fname);
				
	}
	
}