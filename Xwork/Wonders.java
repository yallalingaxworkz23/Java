class Wonders
{
	public static void main(String[] args)
	{
		System.out.println("running in the main method");
		String rammandir="Ram mandir";
		String anjanadri="Anjanadri";
		String kedarnath="Kedarnath";
		String mysore="Mysore";
		String dharmasthala="Dharmasthala";
		String[] wonders={rammandir,anjanadri,kedarnath,mysore,dharmasthala,"kashi","puri"};
		for(int words=0;words<wonders.length;words++)
		{
			System.out.println("elements at index :"+words+"is:"+wonders[words]);
		}
		System.out.println("element at index 2 befor change:"+wonders[2]);
		wonders[2]="ayodya";
		System.out.println("element at index 2 after change:"+wonders[2]);
		System.out.println("element at index 1 befor change:"+wonders[1]);
		wonders[1]="kanchi";
		System.out.println("element at index 1 after change:"+wonders[1]);
		for (int wonder=wonders.length-1;wonder>=0;wonder--)
		{
			System.out.println("elements at index:"+wonder+"is:"+wonders[wonder]);
		}
	}
}