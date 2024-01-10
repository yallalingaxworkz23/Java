package com.xworkz.yella.app.repository;

public class BusRepoImpl  implements BusRepo{
	
	private String[] names=new String[TOTAL_ITEMS];
    public int start=0;
	@Override
	public void save(String name) {
		System.out.println("running save in location Repositry...");
		if(start<TOTAL_ITEMS){
			this.names[start]=name;
			this.start++;
		}
		else {
			System.out.println("unable r stotage is full .. ");
		}
		
	}

}
