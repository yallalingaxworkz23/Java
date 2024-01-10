package com.xworkz.collectionSorting.app;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectionSorting.dto.RobotDTO;

public class RoboDTORunner {
	public static void main(String[] args) {
		RobotDTO collection1=new RobotDTO(1, "Jack", "USA", 50000);
		RobotDTO collection2=new RobotDTO(2, "jhon", "UK", 25000);
		RobotDTO collection3=new RobotDTO(3, "kumar", "India", 40000);
		RobotDTO collection4=new RobotDTO(4, "yallu", "India", 10000);
		
		Collection<RobotDTO> collectionRobo=new ArrayList();
		collectionRobo.add(collection1);
		collectionRobo.add(collection2);
		collectionRobo.add(collection3);
		collectionRobo.add(collection4);
		for (RobotDTO robotDTO : collectionRobo) {
			System.out.println(robotDTO);
		}
		System.out.println("&&&&&&&&&&&&&&&&");
		collectionRobo.stream().sorted().forEach(p->System.out.println(p));
	}

}
