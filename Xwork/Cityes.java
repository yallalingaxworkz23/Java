class Cityes
{
	public static void main(String[] args)
	{
		System.out.println("running in the main method");
		String manvi=("Manvi");
		String raichur=("Raichur");
		String sirwar=("Sirwar");
		String koppal=("Koppal");
		String nasalpur=("Nasalpur");
		String[] cityes={manvi,raichur,sirwar,koppal,nasalpur,"udupi","dharmasthala"};
		
		for (int yallu=0;yallu<cityes.length;yallu++)
		{
			System.out.println("element at index :"+yallu+"is:"+cityes[yallu]);
		}
		System.out.println("element at intex 6 is"+cityes[6]);
		cityes[6]="krishna";
		System.out.println("element at index 6 is:"+cityes[6]);
		for (int kumar=cityes.length-1;kumar>=0;kumar--)
		{
			System.out.println("element at index:"+kumar+"is:"+cityes[kumar]);
		}
	}
	
}