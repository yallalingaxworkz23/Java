class WalletKiller{
	public static void main(String[] args){
		System.out.println("Invoking main in WalletKiller");
		
		Wallet wallet=new Wallet();
		System.out.println("Wallet brand in main method:"+wallet.brand);
		System.out.println("Wallet Material Type in main method:"+wallet.materialType);
		System.out.println("Wallet price in main method:"+wallet.price);
		
		System.out.println("*********************************");
		
		Wallet wallet1=new Wallet("Storite","Metal",599);
		System.out.println("Wallet brand in main method:"+wallet1.brand);
		System.out.println("Wallet Material Type in main method:"+wallet1.materialType);
		System.out.println("Wallet price in main method:"+wallet1.price);
		
	}
}