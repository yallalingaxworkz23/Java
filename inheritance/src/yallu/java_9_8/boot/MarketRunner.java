package yallu.java_9_8.boot;

import yallu.java_9_8.app.Market;
import yallu.java_9_8.app.NewMarket;

public class MarketRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Market market=new NewMarket();
		market.shops();
		market.shops("KR market");
		market.shops("KR market","benglur");
		market.shops(50,"KR puram","benglur");
		market.shops(50);
		market.shops("KR market",5000);
		
		System.out.println("################");
		
		Market market1=new NewMarket();
		market1.shops();
		market1.shops("Kk market");
		market1.shops("Kk market","ujire");
		market1.shops(56,"KK puram","ujire");
		market1.shops(56);
		market1.shops("Kk market",5500);
		

	}

}
