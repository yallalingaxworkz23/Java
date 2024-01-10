package presentationClass.xwork.presentation.methods.boot;

import presentationClass.xwork.presentation.methods.app.Methods;

public class MethodsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking in the main metod");
		String name = "yallalinga";
		System.out.println(name);
		int speed=100;
		Methods.car(speed);
		int age=25;
		Methods.car(age);
		Methods.car(100, "ford");
		

	}

}
