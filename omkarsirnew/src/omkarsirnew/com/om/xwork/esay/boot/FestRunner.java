package omkarsirnew.com.om.xwork.esay.boot;

import javax.management.InvalidApplicationException;

import omkarsirnew.com.om.xwork.esay.event.Fest;
import omkarsirnew.com.om.xwork.esay.exception.OmSirException;

public class FestRunner {

	public static void main(String[] args) {
		System.out.println("running in main method..");
		
		
		Fest fest=new Fest();
		fest.train();
		try {
			fest.bus();
			Class.forName("com.just.not.work");
		} catch (InvalidApplicationException e)
		{
			System.out.println("running in catch... for  InvalidApplicationException"+e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("running in catch... for  ClassNotFoundException"+e.getMessage());
			e.printStackTrace();
		} catch (OmSirException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
