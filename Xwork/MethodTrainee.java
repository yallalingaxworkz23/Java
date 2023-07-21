class MethodTrainee{
	public static void main(String[] args){
		Trainee.trainee();
		Trainee.trainee("ABC");
		Trainee.trainee("PQR","CSE");
		Trainee.trainee("XYZ","ECE","Raichur");
		Trainee.listenToClass();
		Trainee.doTask();
		Trainee.doTask("oops");
		Trainee.doTask("Over Loading",6);
		Trainee.travel();
		Trainee.travel("BTM Layout");
		drinkWater();
		eatChocolate();
	}
		static void drinkWater(){
			System.out.println("Trainee Drink water in Class");
		}
		static void eatChocolate(){
			System.out.println("Trainee Eat Chocolate in Class");
		}
}