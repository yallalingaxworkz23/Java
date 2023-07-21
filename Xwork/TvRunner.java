class TvRunner
{
	public static void main(String[] args)
	{
		System.out.println("invlking in main method");
		Tvv tv=new Tvv();
		System.out.println("name:"+tv.name);
		System.out.println("size:"+tv.size);
		System.out.println("price:"+tv.price);
		System.out.println("##############");
		
		Tvv tv1=new Tvv("kumar","king",1000);
		System.out.println("name:"+tv1.name);
		System.out.println("size:"+tv1.size);
		System.out.println("price:"+tv1.price);
	}
}