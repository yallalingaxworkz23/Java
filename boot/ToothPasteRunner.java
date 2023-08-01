package xwork.boot;

import xwork.app.Company;
import xwork.app.Ingredents;
import xwork.app.ToothPast;

public class ToothPasteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="whte";
		String brand="colgate";
		Company company=new Company ("vtech","rp","india");
		Ingredents ingredent=new Ingredents("natural",25,50);
		Ingredents ingredents1=new Ingredents("natural",26,51);
		Ingredents ingredents2=new Ingredents("natural",27,52);
		Ingredents[] ingredents= {ingredent,ingredents1,ingredents2};
		
		ToothPast toothPast=new ToothPast(name,brand,company,ingredents);
		toothPast.printInfo();
		

	}

}
