package yallu.java_9_8.boot;

import yallu.java_9_8.app.Mall;
import yallu.java_9_8.app.NewMall;

public class MallRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Mall mall=new NewMall();
        mall.data();
        mall.data("lulu");
        mall.data("lulu","benglur");
        mall.data(3);
        mall.data(3,"max");
        mall.data("form",5);
        
        System.out.println("@@@@@@@@@@@@@@@@@");
        
        Mall mall1=new NewMall();
        mall1.data();
        mall1.data("form");
        mall1.data("form","benglur");
        mall1.data(5);
        mall1.data(5,"max");
        mall1.data("lulu",3);
        
	}

}
