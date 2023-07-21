class Camera{
	static void click(String location,String date,int howManyPeople ,double resolutionInMp,String clarity,String cameraMan){
		System.out.println("Invoking click() in Cake");
		if(location!=null){
			System.out.println("Location is valid:"+location);
		}
		else{
			System.out.println("Location is in-valid:"+location);
			return;
		}
		if(date!=null){
			System.out.println("Date is valid:"+date);
		}
		else{
			System.out.println("Date is in-valid:"+date);
			return;
		}
		if(howManyPeople>=0 && howManyPeople<=25){
			System.out.println("Number of peoples in photo is valid:"+howManyPeople);
		}
		else{
			System.out.println("Number of peoples in photo is in-valid:"+howManyPeople);
			return;
		}
		if(resolutionInMp>=20){
			System.out.println("Resolution of camera is valid:"+resolutionInMp);
		}
		else{
			System.out.println("Resolution of camera in-valid:"+resolutionInMp);
			return;
		}
		if(clarity!=null){
			System.out.println("Clarity is valid:"+clarity);
		}
		else{
			System.out.println("Clarity is in-valid:"+clarity);
			return;
		}
		if(cameraMan!=null){
			System.out.println("cameraMan is valid:"+cameraMan);
		}
		else{
			System.out.println("cameraMan is in-valid:"+cameraMan);
			return;
		}
	}
}