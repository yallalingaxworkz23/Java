class PocketKiller{
	public static void main(String[] values){
		System.out.println("invoking main in PocketKiller");
		Pocket pocket=new Pocket();
		System.out.println(pocket.price);
		System.out.println(pocket.brand);
		System.out.println(pocket.type);
		System.out.println(pocket.material);
		System.out.println(pocket.usedFor);
		System.out.println("##########################################");
		Pocket pocket1=new Pocket();
		pocket1.brand="Moncler";
		pocket1.type="Patch pocket";
		pocket1.price=500;
		pocket1.material="Polyethelyne";
		pocket1.usedFor="Store";
		System.out.println(pocket1.price);
		System.out.println(pocket1.brand);
		System.out.println(pocket1.type);
		System.out.println(pocket1.material);
		System.out.println(pocket1.usedFor);
		
	}
}