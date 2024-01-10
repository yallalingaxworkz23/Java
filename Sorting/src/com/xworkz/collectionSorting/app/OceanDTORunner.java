package com.xworkz.collectionSorting.app;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectionSorting.dto.OceanDTO;

public class OceanDTORunner {

	public static void main(String[] args) {
		
		OceanDTO oct1=new OceanDTO(1, "Arabian", "India", 30800);
		OceanDTO oct2=new OceanDTO(2, "BayofBengal", "India", 30300);
		OceanDTO oct3=new OceanDTO(3, "Specific", "Usa", 30100);
		OceanDTO oct4=new OceanDTO(4, "Antartica", "Russia", 30900);
		OceanDTO oct5=new OceanDTO(5, "indian", "India", 30890);
		
		Collection<OceanDTO> col =new  ArrayList();
		col.add(oct5);
		col.add(oct4);
		col.add(oct3);
		col.add(oct2);
		col.add(oct1);
		
		for (OceanDTO oceanDTO : col) {
			System.out.println(oceanDTO);
		}
		System.out.println("%%%%%%5");
		System.out.println("depth in incressing .. order.... ");
		col.stream().sorted().forEach(y->System.out.println(y));
		

	}

}
