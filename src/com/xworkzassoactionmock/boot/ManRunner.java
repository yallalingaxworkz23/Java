package com.xworkzassoactionmock.boot;

import com.xworkzassoactionmock.app.Cloths;
import com.xworkzassoactionmock.app.Man;

public class ManRunner {

	public static void main(String[] args) {
		System.out.println(" on main..");
		
		Cloths clo =new Cloths();
		clo.setPantbrand("YRKH");
		clo.setPantcolor("blue");
		clo.setShartbrand("RKHY");
		clo.setShartcolor("red");
		
		Man man=new Man();
		man.setCloths(clo);
		System.out.println(man);
		
		Cloths clo1 =new Cloths();
		clo1.setPantbrand("YRKH");
		clo1.setPantcolor("blue");
		clo1.setShartbrand("RKHY");
		clo1.setShartcolor("black");
		
		Man man1=new Man();
		man1.setCloths(clo1);
		System.out.println(man1);
		

	}

}

