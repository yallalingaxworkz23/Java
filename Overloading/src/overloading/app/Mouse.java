package overloading.app;

public class Mouse {
	public void select()
	{
		System.out.println("invokin the no args");
		select("yes",5);
	}
	public void select(String wired)
	{
		System.out.println("invoking the args for mouse");
		System.out.println("mouse is:"+wired);
	}
	public void select(int noofwire)
	{
		System.out.println("invoiking th arges for mouse");
		System.out.println("number of wire:"+noofwire);
	}
	public void select(String wired,int noofwire)
	{
		System.out.println("invoking both wired and number of wire ");
		select(wired);
		select(noofwire);
	}
}