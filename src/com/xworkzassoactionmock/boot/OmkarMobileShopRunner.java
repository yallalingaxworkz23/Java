package com.xworkzassoactionmock.boot;

import com.xworkzassoactionmock.app.Mobile;
import com.xworkzassoactionmock.app.OmkarMobialShop;

public class OmkarMobileShopRunner {
	
	public static void main(String[] args) {
		
          Mobile mobile=new Mobile();
          mobile.setBrand("MI");
          mobile.setModul("Mi2");
          mobile.setStorage(105);
          mobile.setBattry(5000);
          mobile.setColor("black");
          mobile.setCamara("80mp");
          
          
          Mobile mobile1=new Mobile();
          mobile1.setBrand("MI");
          mobile1.setModul("Mi3");
          mobile1.setStorage(145);
          mobile1.setBattry(4000);
          mobile1.setColor("Red");
          mobile1.setCamara("180mp");
          
          OmkarMobialShop shop=new OmkarMobialShop();
          shop.setMobile(mobile);
          System.out.println(mobile);
          System.out.println(mobile1);
          
          
          
	}

}
