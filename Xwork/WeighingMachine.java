class WeighingMachine{
	
	static void measureWeight(String machineType,String scaleOfMeasure,int machineCapacityInKg,String itemName){
		System.out.println("Invoking measureWeight() in WeighingMachine");
		if(machineType!=null){
			System.out.println("Weighing machine Type is valid:"+machineType);
		}
		else{
			System.out.println("Weighing machine Type is in-valid:"+machineType);
			return;
		}
		if(scaleOfMeasure!=null){
			System.out.println("Scale Of Measurement is valid:"+scaleOfMeasure);
		}
		else{
			System.out.println("Scale Of Measurement is in-valid:"+scaleOfMeasure);
			return;
		}
		if(machineCapacityInKg>=150){
			System.out.println("Machine Capacity In KG is valid:"+machineCapacityInKg);
		}
		else{
			System.out.println("Machine Capacity In KG is in-valid:"+machineCapacityInKg);
			return;
		}
		
		if(itemName!=null){
			System.out.println("Item name is valid:"+itemName);
		}
		else{
			System.out.println("item Name is in-valid:"+itemName);
			return;
		}
	}
}