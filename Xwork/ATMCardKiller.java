class ATMCardKiller{
	public static void main(String[] args){
		System.out.println("Invoking main in ATMCardKiller");
		
		ATMCard atmCard=new ATMCard();
		System.out.println("ATM card type in main method:"+atmCard.type);
		System.out.println("ATM card holder name in main method:"+atmCard.holderName);
		System.out.println("ATM card pin number in main method"+atmCard.pinNumber);
		
		System.out.println("*********************************");
		
		ATMCard atmCard1=new ATMCard("RuPay","Sinchana",7656);
		System.out.println("ATM card type in main method:"+atmCard1.type);
		System.out.println("ATM card holder name in main method:"+atmCard1.holderName);
		System.out.println("ATM card pin number in main method"+atmCard1.pinNumber);
		
	}
}