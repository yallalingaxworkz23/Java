class FabricRunner
{
	public static void main(String[] values){
	System.out.println("Invoking main in FabricRunner");
	
	int ref1=Fabric.getPrice("silk");
	System.out.println("Ref 1 is:"+ref1);
	int ref2=Fabric.getPrice("nylon");
	System.out.println("Ref 1 is:"+ref2);
	int ref3=Fabric.getPrice("woolen");
	System.out.println("Ref 1 is:"+ref3);
	int ref4=Fabric.getPrice("linen");
	System.out.println("Ref 1 is:"+ref4);
	int ref5=Fabric.getPrice("polyster");
	System.out.println("Ref 1 is:"+ref5);
	int ref6=Fabric.getPrice("cotton");
	System.out.println("Ref 1 is:"+ref6);
	}
}