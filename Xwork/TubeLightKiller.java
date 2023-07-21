class TubeLightKiller{
	public static void main(String[] args){
		System.out.println("Invoking main in TubeLightKiller");
		
		TubeLight tubeLight=new TubeLight();
		System.out.println("TubeLight brand in main method:"+tubeLight.brand);
		System.out.println("TubeLight color in main method:"+tubeLight.color);
		System.out.println("TubeLight price in main method:"+tubeLight.price);
		
		System.out.println("*********************************");
		
		TubeLight tubeLight1=new TubeLight("Crompton","White",320);
		System.out.println("TubeLight brand in main method:"+tubeLight1.brand);
		System.out.println("TubeLight color in main method:"+tubeLight1.color);
		System.out.println("TubeLight price in main method:"+tubeLight1.price);
	}
}