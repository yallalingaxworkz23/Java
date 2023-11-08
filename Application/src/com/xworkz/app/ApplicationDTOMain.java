package com.xworkz.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.app.dto.ApplicationDTO;

public class ApplicationDTOMain {
	
	public static void main(String[] args) {
		//object creat aytu
		
		ApplicationDTO applicationDTO1=new ApplicationDTO("probook","v1","hp",LocalDate.of(2022,8,1),5.1);
		ApplicationDTO applicationDTO2=new ApplicationDTO("macbook","h1","apple",LocalDate.of(2022,8,4),4.9);
		ApplicationDTO applicationDTO3=new ApplicationDTO("dcbook","d1","dell",LocalDate.of(2023,8,1),3.9);
		ApplicationDTO applicationDTO4=new ApplicationDTO("Scbook","s3","sony",LocalDate.of(2023,4,1),4.9);
		ApplicationDTO applicationDTO5=new ApplicationDTO("exbook","x3","spacex",LocalDate.of(2022,4,5),5.9);
		
		Collection<ApplicationDTO> application=new ArrayList();//generic ale more the one data type use madedhu soo write classname like applicationdto
		application.add(applicationDTO1);
		application.add(applicationDTO2);
		application.add(applicationDTO3);
		application.add(applicationDTO4);
		application.add(applicationDTO5);
		
		Iterator<ApplicationDTO> ref=application.iterator();
		while(ref.hasNext()) {
			ApplicationDTO applicationDTO=ref.next();
			System.out.println(applicationDTO.getName());
		}
		
	}

}
