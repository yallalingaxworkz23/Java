class VegetablePrice
{
	public static void main(String[] prices)
	{
		System.out.println("running in the main method");
		float tomato=50f;
		float carret=60f;
		float onien=60f;
		float chelly=40f;
		float beetroot=60f;
		float brinjal=50f;
		float potato=60f;
		float[] vegetableprice={tomato,carret,onien,chelly,beetroot,brinjal,potato};
		for(int price=0;price<vegetableprice.length;price++)
		{
			System.out.println("elements at index :"+price+"is:"+vegetableprice[price]);
		}
		System.out.println("element at index 3 befor change:"+vegetableprice[3]);
		vegetableprice[3]=68;
		System.out.println("elements at index 3 after change:"+vegetableprice[3]);
		System.out.println("elements at index 6 befor change:"+vegetableprice[6]);
		vegetableprice[6]=90;
		System.out.println("elements at index 6 after change:"+vegetableprice[6]);
		for(int vege=vegetableprice.length-1;vege>=0;vege--)
		{
			System.out.println("elemente at intex :"+vege+"is:"+vegetableprice[vege]);
		}
		
	     	
	}
}