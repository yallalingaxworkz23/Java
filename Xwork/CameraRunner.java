class CameraRunner{
	public static void main (String[] args){
		System.out.println("Running main in CameraRunner");
		
		
		String location="Banglore";
		String date="07/06/2023";
		int howManyPeople=6;
		double resolutionInMp=180;
		String clarity="3HD";
		String cameraMan="Seemitha";
		
		String locName="Udupi";
		double resolutionInMP=10;
		
		Camera.click(location,date,howManyPeople,resolutionInMp,clarity,cameraMan);
		System.out.println("");
		Camera.click(locName,date,howManyPeople,resolutionInMP,clarity,cameraMan);
		
		
		
	}
}