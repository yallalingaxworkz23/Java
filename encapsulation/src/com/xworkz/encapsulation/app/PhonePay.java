package com.xworkz.encapsulation.app;

public class PhonePay {
	private String name;
	private String id;
	private  String username;
	private String password;
	private int noofcont;
	private int nooffeaturs;
	private float balance ;
	private int accountnumb;
	private String acounttype;
	private int noofaccount;
	
	public String getname()
	{
	  return this.name;	
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String  getid()
	{
		return this.id;
	}
	public void setid(String id)
	{
		this.id=id;
	}
	public String getusername()
	{
		return this.username;
	}
	public void setusername(String username)
	{
		this.username=username;
	}
	public String getpassword()
	{
		return this.password;
	}
	public void setpassword(String password)
	{
		this.password=password;
	}
	public int getnoofcont()
	{
		return this.noofcont;
	}
	public void  setnoofcont(int noofcont)
	{
		this.noofcont=noofcont;
	}
	public int getnooffeaturs()
	{
		return this.nooffeaturs;
	}
	public void  setnooffeaturs(int nooffeaturs)
	{
		this.nooffeaturs=nooffeaturs;
	}
	public float getbalance()
	{
		return this.balance;
	}
	public void   setbalance(float balance)
	{
		this.balance=balance;
	}
	public int getaccountnumb()
	{
		return this.accountnumb;
	}
	public void  setaccountnumb(int accountnumb)
	{
		this.accountnumb=accountnumb;
	}
	public String getacounttype()
	{
		return this.acounttype;
	}
	public void setacounttype(String acounttype)
	{
		this.acounttype=acounttype;
	}
	public int getnoofaccount()
	{
		return this.noofaccount;
	}
	public void setnoofaccount(int noofaccount)
	{
		this.noofaccount=noofaccount;
	}	
}
