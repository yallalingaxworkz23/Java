class DroneRunner
{
	public static void main(String[] values)
	{
		System.out.println("running in the main method");
		double ref=Drone.getDistanceByFlight("kumar","work");
		System.out.println("ref is:"+ref);
		
		double ref1=Drone.getDistanceByFlight("sai","sleep");
		System.out.println("ref is:"+ref1);
		
	    double ref2=Drone.getDistanceByFlight(null,null);
		System.out.println("ref is:"+ref2);
		
		System.out.println("&&&&&&&&&&&&");
		
		double ref3=Drone.getPricePerEvent("jumping");
		System.out.println("ref is:"+ref3);
		
		double ref4=Drone.getPricePerEvent("kumar");
		System.out.println("ref is:"+ref4);
		
		double ref5=Drone.getPricePerEvent(null);
		System.out.println("ref is:"+ref5);
		
		System.out.println("&&&&&&&&&7");
		
		int ref7=Drone.getDiscountByEvent("yallu","kumar");
		ref7=Drone.getDiscountByEvent(null,null);
		
		
		
		
		
		
		
	}
}