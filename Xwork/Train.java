class Train{
	static String getTrainName(int trainNum){
		System.out.println("invoking getTrainName in Train");
		if(trainNum>=1000){
			System.out.println("getAgeByName is valid");
			if(11013==trainNum){
				return "Coimbatore Express";
			}
			if(11014==trainNum){
				return "Lokmanya Tt Express";
			}
			if(12134==trainNum){
				return "Mumbai Express";
			}
			if(22691==trainNum){
				return "Rajdhani Express";
			}
		else{
			System.err.println("getTrainName is in valid");
		}	
		}
		return "Karnatka Express";
	
	}
}