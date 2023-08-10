package yallu.java_9_8.app;

public class NewMarket  extends Market{
	  
	       @Override
	        public void shops()
			{
				System.out.println("involing the data in market ");
			}
			public void shops(String name)
			{
				System.out.println("invoking the data in market with shops name");
			}
			public void shops( String name,String city)
			{
				System.out.println("invoking the data in market with shops name and place");
			}
			public void shops(int sho,String area,String city)
			{
				System.out.println("invoking the data in market with  no of shops and area and city");
			}
			public void shops(int shops)
			{
				System.out.println("invoking the data in market with shops total number of shops");
			}
			public void shops(String name,int people)
			{
				System.out.println("invoking the data in market with shops name and people");
			}




}
