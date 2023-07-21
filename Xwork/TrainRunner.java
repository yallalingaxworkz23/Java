class TrainRunner{
	public static void main(String[] args){
		System.out.println("running main in TrainRunner");
		
		String train1=Train.getTrainName(11013);
		System.out.println("Train 1 is:"+train1);
		
		String train2=Train.getTrainName(11014);
		System.out.println("Train 2 is:"+train2);
		
		String train3=Train.getTrainName(12134);
		System.out.println("Train 3 is:"+train3);
		
		String train4=Train.getTrainName(22691);
		System.out.println("Train 4 is:"+train4);
		
		
		
	}
}