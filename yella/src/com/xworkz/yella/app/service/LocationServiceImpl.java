package com.xworkz.yella.app.service;

import com.xworkz.yella.app.repository.LocationRepositry;

public class LocationServiceImpl implements LocationService{
	
     private LocationRepositry locationRepositry;
     
      public LocationServiceImpl(LocationRepositry locationRepositry) {
		
    	 this.locationRepositry=locationRepositry;
	}
	
	
	@Override
	public void validateAndSave(String place) {
		System.out.println("running validateAndSave in Service..");
		if (place!=null && !place.isEmpty() && place.length()>3 && place.length()<20 )
		{
			System.out.println("place name is valid..");
			this.locationRepositry.save(place);
		}
		else {
			System.out.println("the place is invalide ,not save..");
		}
		
	}
	
	

}
