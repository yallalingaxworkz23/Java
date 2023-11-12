package com.xworkzassoactionmock.boot;

import com.xworkzassoactionmock.app.Country;
import com.xworkzassoactionmock.app.Distic;
import com.xworkzassoactionmock.app.State;

public class CountryRunner {

	public static void main(String[] args) {
		
		Distic dts=new Distic();
		dts.setTname("Manvi");
		dts.setTiluk(3);
		dts.setViallage(46);
		dts.setPopulation(60000);
		
		State st=new State();
	st.setDistic(dts);
		st.setDname("Raichur");
		st.setDpopulation(80000);
		st.setTdistic(30);
		
		Country ct=new Country();
		ct.setState(st);
		System.out.println(st);
		
		
		
		
		

	}

}

