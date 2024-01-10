package thursday.minester.boot;

import thursday.minester.Constituency;
import thursday.minester.IndiraCanteen;
import thursday.minester.Minester;

public class minesterRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("running in main method");
		 
		Minester minester=new Minester();
		String name=minester.name;
		System.out.println("name is:"+name);
		
		int exp=minester.exp;
		System.out.println("exp is:"+exp);
		
	System.out.println("$$$$$$$$$$$$$$$$$$$$");
	
	 Constituency constituency=minester.constituency;
	 int constno=constituency.constno;
	 System.out.println("constno is:"+constno);
	 double population=constituency.population;
	 System.out.println("population is:"+population);
	 
	 System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
	 
	 IndiraCanteen indiraCanteen =constituency.indiraCanteen;
	 double breakFastPric=indiraCanteen.breakFastPric;
	 System.out.println("breakFastPric is:"+breakFastPric);
	 double lunchPrice=indiraCanteen. lunchPrice;
	 System.out.println(" lunchPrice is:"+lunchPrice);

	}

}
