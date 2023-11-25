package xworz.com.logic.app;

import java.util.Scanner;

public class Tables {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner num=new Scanner(System.in);
		int number=num.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(number+"*"+i+"="+number*i);
		}
		
		
	}

}
