class GraphicsCardKiller{
	public static void main(String[] args){
		System.out.println("Invoking main in GraphicsCardKiller");
		
		GraphicsCard graphicsCard=new GraphicsCard();
		System.out.println("GraphicsCard brand in main method:"+graphicsCard.brand);
		System.out.println("GraphicsCard RAM in GB in main method:"+graphicsCard.RAMInGB);
		System.out.println("GraphicsCard price in main method:"+graphicsCard.price);
		
		System.out.println("*********************************");
		
		GraphicsCard graphicsCard1=new GraphicsCard("ASUS",8,15000);
		System.out.println("GraphicsCard brand in main method:"+graphicsCard1.brand);
		System.out.println("GraphicsCard RAM in GB in main method:"+graphicsCard1.RAMInGB);
		System.out.println("GraphicsCard price in main method:"+graphicsCard1.price);
		
	}
}