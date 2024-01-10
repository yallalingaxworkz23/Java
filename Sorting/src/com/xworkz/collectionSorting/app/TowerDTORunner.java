package com.xworkz.collectionSorting.app;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectionSorting.dto.TowerDTO;

public class TowerDTORunner {

	public static void main(String[] args) {
	
		TowerDTO td1=new TowerDTO(1,"BSNL", "Koppala", 1800, 5000000);
		TowerDTO td2=new TowerDTO(2,"Artel", "Lingsour", 2800, 4000000);
		TowerDTO td3=new TowerDTO(3,"VODA", "Banglour", 1400, 6000000);
		TowerDTO td4=new TowerDTO(4,"NETWork", "Manvi", 2000, 3000000);
		TowerDTO td5=new TowerDTO(5,"ifal", "Raichur", 2909, 1000000);
		
		Collection<TowerDTO> tr=new ArrayList();
		tr.add(td1);
		tr.add(td2);
		tr.add(td3);
		tr.add(td4);
		tr.add(td5);
		
		for (TowerDTO towerDTO : tr) {
			System.out.println(towerDTO);
			
		}
		System.out.println("$$$$$$$$$");
		System.out.println("hight incressing order..");
		tr.stream().sorted().forEach(y->System.out.println(y));
		System.out.println("hight decressing oreder..");
		tr.stream().sorted().forEach(y->System.out.println(y));
		

	}

}
