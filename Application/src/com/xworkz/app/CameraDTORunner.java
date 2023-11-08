package com.xworkz.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.app.dto.CameraDTO;

public class CameraDTORunner {
	public static void main(String[] args) {
		
		CameraDTO cameraDTO1=new CameraDTO(1,"Canon","Cv1",25000,LocalDate.of(2022,8,1));
		CameraDTO cameraDTO2=new CameraDTO(2,"Neon","N1",35000,LocalDate.of(2002,5,7));
		CameraDTO cameraDTO3=new CameraDTO(3,"Canon","S1",55000,LocalDate.of(2032,3,6));
		CameraDTO cameraDTO4=new CameraDTO(4,"Camel","Ca1",65000,LocalDate.of(2012,7,4));
		CameraDTO cameraDTO5=new CameraDTO(5,"MI","Mv1",29000,LocalDate.of(2022,3,2));
		
		Collection<CameraDTO> cameracollection=new ArrayList();
		cameracollection.add(cameraDTO1);
		cameracollection.add(cameraDTO2);
		cameracollection.add(cameraDTO3);
		cameracollection.add(cameraDTO4);
		cameracollection.add(cameraDTO5);
		
		System.out.println("size:"+cameracollection.size());
		
		Collection<String> modules=new ArrayList();
			
		
		cameracollection.stream().filter(c->c.getBrand().equals("Canon")).forEach(ref->System.out.println(ref));
		System.out.println("&&&&&&&&&&&&&");
		cameracollection.stream().filter(cost->cost.getCost()>40000 ).forEach(c->modules.add(c.getModel()));
		modules.forEach(s->System.out.println(s));
		System.out.println("&&&&&&&");
		
		
		cameracollection.stream().filter(c->c.getBrand().equals("Canon")).map(cam->cam.getCost()).forEach(s->System.out.println("price is:"+s));
		System.out.println("$$$$$$$$");
		
		//to add different collection
		Collection<CameraDTO> collection1=new ArrayList();
	 collection1= cameracollection.stream().filter(ref->ref.getId()>2).collect(Collectors.toList());
		
		
		
		
		
	}

}
