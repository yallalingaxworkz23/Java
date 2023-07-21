class PhoneRunner{
	public static void main(String[] args)
	{
		System.out.println("running in main method ");
		Phone phone=new Phone();
		System.out.println("brand:"+phone.brand);
		System.out.println("version:"+phone.version);
		System.out.println("how much:"+phone.price);
		System.out.println("time:"+phone.validity);
		
	}
}