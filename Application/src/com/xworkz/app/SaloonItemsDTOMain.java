package com.xworkz.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.app.dto.SaloonItemDTO;

public class SaloonItemsDTOMain {
	
	public static void main(String[] args) {
		SaloonItemDTO saloonItemDTO1=new SaloonItemDTO(1,"Trimmer",600,"cutting","men");
		SaloonItemDTO saloonItemDTO2=new SaloonItemDTO(2,"Comb",30,"haircomb","both");
		SaloonItemDTO saloonItemDTO3=new SaloonItemDTO(3,"Cutter",340,"cutting","both");
		SaloonItemDTO saloonItemDTO4=new SaloonItemDTO(4,"WaterBottle",30,"ToSweet","both");
		SaloonItemDTO saloonItemDTO5=new SaloonItemDTO(5,"Drayer",530,"ToDry","both");
		SaloonItemDTO saloonItemDTO6=new SaloonItemDTO(6,"Mirror",80,"see","both");
		SaloonItemDTO saloonItemDTO7=new SaloonItemDTO(7,"Blade",330,"clean","men");
		SaloonItemDTO saloonItemDTO8=new SaloonItemDTO(8,"Hairjell",330,"style","bth");
		SaloonItemDTO saloonItemDTO9=new SaloonItemDTO(9,"ShavingCreem",380,"save","male");
		SaloonItemDTO saloonItemDTO10=new SaloonItemDTO(10,"FaceCreem",310,"wash","female");
		
		Collection<SaloonItemDTO> collection1=new ArrayList();
		collection1.add(saloonItemDTO1);
		collection1.add(saloonItemDTO2);
		collection1.add(saloonItemDTO3);
		collection1.add(saloonItemDTO4);
		collection1.add(saloonItemDTO5);
		collection1.add(saloonItemDTO6);
		collection1.add(saloonItemDTO7);
		collection1.add(saloonItemDTO8);
		collection1.add(saloonItemDTO9);
		collection1.add(saloonItemDTO10);
		Iterator<SaloonItemDTO> ref=collection1.iterator();
		while(ref.hasNext()) {
			SaloonItemDTO items=ref.next();
			System.out.println("sallon items are:"+items);
			
		}
		SaloonItemDTO saloonItemDTO11=new SaloonItemDTO(8,"Hairjell",330,"style","bth");
		SaloonItemDTO saloonItemDTO12=new SaloonItemDTO(9,"ShavingCreem",380,"save","male");
		SaloonItemDTO saloonItemDTO13=new SaloonItemDTO(11,"FaceCreem",310,"wash","female");
		Collection<SaloonItemDTO> collection2=new ArrayList();
		collection2.add(saloonItemDTO11);
		collection2.add(saloonItemDTO12);
		collection2.add(saloonItemDTO13);
		
		//because data is present so it show true with out add
		boolean contain= collection1.contains(saloonItemDTO12);
		System.out.println("with outadding data is allready present:"+contain);
		//because data is notpresent so it show false with out add
		boolean contain2= collection1.contains(saloonItemDTO13);
		System.out.println("with outadding data is not present:"+contain2);
		
		collection1.addAll(collection2);
		boolean add=collection1.containsAll(collection2);
		System.out.println("after add :"+add);
		
		Iterator<SaloonItemDTO> ref1=collection1.iterator();
		while(ref1.hasNext()) {
			SaloonItemDTO items1=ref1.next();
			System.out.println(items1);
		}
		boolean remove= collection1.remove(saloonItemDTO1);
		System.out.println("to remove:"+remove);
		for (SaloonItemDTO find:collection1) {
			System.out.println("after remove is:"+find);
		}
		
		boolean remove1= collection1.removeAll(collection2);
		System.out.println("to removeALL is:"+remove1);
		for(SaloonItemDTO find2:collection1) {
			System.out.println("after removeAll is:"+find2);
		}
		
		
		
		
		
		
		Iterator<SaloonItemDTO> ref2=collection1.iterator();
		while(ref2.hasNext()) {
			SaloonItemDTO items2=ref2.next();
			if(items2.getName().endsWith("e")) {
			System.out.println("name ends with e:"+items2.getName());
		}
		}
		
		for(SaloonItemDTO ref3:collection1) {
			if(ref3.getName().startsWith("C")) {
				System.out.println("name start with c:"+ref3.getName());
			}
		}
		
	}

}
