package xworz.com.logic.app;

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+i*num);
			
		}
		
	}

}
