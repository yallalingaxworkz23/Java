package com.xworkz.collectionSorting.app;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectionSorting.dto.TheaterDTO;

public class TheaterDTORunner {

	public static void main(String[] args) {
		
		TheaterDTO td1=new TheaterDTO(1,"Pushapa", 200, "raichur");
		TheaterDTO td2=new TheaterDTO(2,"Anjili", 100, "manvi");
		TheaterDTO td3=new TheaterDTO(3,"Prame", 180, "sirvar");
		TheaterDTO td4=new TheaterDTO(4,"Varesh", 400, "udupi");
		TheaterDTO td5=new TheaterDTO(5,"DK", 290, "manglour");
		
		Collection<TheaterDTO> col=new ArrayList();
		col.add(td5);
		col.add(td4);
		col.add(td3);
		col.add(td2);
		col.add(td1);
		
		for (TheaterDTO theaterDTO : col) {
			System.out.println(theaterDTO);
		}
		System.out.println("$$$$$$$$");
		System.out.println("sets in incressing order..");
		col.stream().sorted().forEach(y->System.out.println(y));
		

	}

}
