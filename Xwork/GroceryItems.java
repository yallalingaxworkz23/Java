class GroceryItems
{
	public static void main(String[] items)
	{
		System.out.println("running in main method");
		String rice="Rice";
		String milk="Milk";
		String sugar="Sugar";
		String wheat="Wheat";
		String javar="Javar";
		String[] SroceryItems={rice,milk,sugar,wheat,javar,"oil","spice"};
		for (int yallu=0;yallu<SroceryItems.length;yallu++)
		{
			System.out.println("elements at index:"+yallu+"is:"+SroceryItems[yallu]);
		}
		 System.out.println("elements at index 5 befor change :"+SroceryItems[5]);
		 SroceryItems[5]="nuts";
		 System.out.println("elements at index 5 befor change :"+SroceryItems[5]);
		 System.out.println("elements at index 3 befor change :"+SroceryItems[3]);
		 SroceryItems[3]="biskects";
		 System.out.println("elements at index 3 befor change :"+SroceryItems[3]);
		 for (int kumar=SroceryItems.length-1;kumar>=0;kumar--)
		 {
			 System.out.println("elements at index:"+kumar+"is:"+ SroceryItems[kumar]);
		 }
	}
}