package xworz.com.logic.boot;

import xworz.com.logic.app.StaticVariable;
public class StaticVariableRunner {
	public static void main(String[] args) {
		System.out.println("invoking in main method..");
		StaticVariable sv=new StaticVariable();
		sv.Name();
		sv.Name1();
		
	}

}
