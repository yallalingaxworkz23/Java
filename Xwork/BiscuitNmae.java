class BiscuitNmae
{
	public static void main(String[] names)
	{
		System.out.println("running in main method");
		String parlea="Parlea";
		String golds="Golds";
		String silver="Silver";
		String grb="Grb";
		String ammul="Ammul";
		String[] Biscuits={parlea,golds,silver,grb,ammul,"marreygold","marreysilver"};
		for (int name=0;name<Biscuits.length;name++)
		{
			System.out.println("biscuits at index:"+name+"is:"+Biscuits[name]);
		}
		System.out.println("element at index 2 before change is:"+Biscuits[2]);
		Biscuits[2]="yjr";
		System.out.println("element at index 2 after change is:"+Biscuits[2]);
		System.out.println("element at index 1 before change is:"+Biscuits[1]);
        Biscuits[1]="copper";		
		System.out.println("element at index 1 after change is:"+Biscuits[1]);
		for (int revers=Biscuits.length-1;revers>=0;revers--)
		{
			System.out.println("biscuits at index:"+revers+"is:"+Biscuits[revers]);
		}
	}
}