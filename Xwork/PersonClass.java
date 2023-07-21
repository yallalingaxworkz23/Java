class PersonClass{
	static int getAgeByName(String name ){
		System.out.println("invoking getAgeByName in PersonClass{");
		if(name!=null){
			System.out.println("getAgeByName is valid");
			if("yallalinag"==name){
			return 22;
		    }
		    if("Santhosh"==name){
			return 52;
		    }
		    if("Janaka"==name){
			return 46;
		    }
		    if("Sinchan"==name){
			return 19;
		    }
		    if("Jayanath"==name){
			return 48;
		    }
		    if("Kanaka"==name){
			return 21;
		    }
			if("Shravya"==name){
			return 22;
		    }
			if("Chaitra"==name){
			return 35;
		    }
			if("Prabhu"==name){
			return 32;
		    }
			if("Prakash"==name){
			return 42;
		    }
			
		else{
			System.err.println("getAgeByName is in valid");
		    }
			
		}
		return 10;
		
	}
	
}