package com.xworkz.collectionSorting.app;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.stream.Stream;

import com.xworkz.collectionSorting.dto.IceCreemDTO;

public class IceCreemRunner {

	public static void main(String[] args) {
		
		IceCreemDTO ice1=new IceCreemDTO("varun", "venalea", 200D, "cone", LocalDate.of(2022, 06, 10));
		IceCreemDTO ice2=new IceCreemDTO("amul", "Butter-scoch", 300D, "cone", LocalDate.of(2022, 05, 13));
		IceCreemDTO ice3=new IceCreemDTO("Arun", "strobary", 300D, "cup", LocalDate.of(2022, 06, 15));
		IceCreemDTO ice4=new IceCreemDTO("om", "mango", 250D, "familypack", LocalDate.of(2021, 04, 10));
		IceCreemDTO ice5=new IceCreemDTO("OmSai", "dark", 100D, "stick", LocalDate.of(2022, 03, 11));
		
		//ice1:30,ice2:30,ice3,ice4,ice5
		Stream.of(ice1,ice2,ice3,ice4,ice5).sorted().forEach(r->System.out.println(r));
		
		
		
		Comparator<IceCreemDTO> priceCompire=(i1,i2)->{
			return i1.getPrice().compareTo(i2.getPrice());
		};
		Comparator<IceCreemDTO> dateCompire=(i1,i2)->{
			return i1.getMandate().compareTo(i2.getMandate());
		};
		//,ice2,ice1,ice3,ice4,ice5
		System.out.println("sortng price and date ..^^^^^^^^^^^^^^");
		Stream.of(ice1,ice2,ice3,ice4,ice5).sorted(priceCompire.thenComparing(dateCompire)).forEach(r->System.out.println(r));
		
		
		System.out.println("if same price compare to name..");
		Comparator<IceCreemDTO> namesComparator=(i1,i2)->{
			return i1.getName().compareTo(i2.getName());
		};
		Comparator<IceCreemDTO> prsComparator=(i1,i2)->{
			return i1.getPrice().compareTo(i2.getPrice());
		};
		Stream.of(ice1,ice2,ice3,ice4,ice5).sorted(prsComparator.thenComparing(namesComparator)).forEach(r->System.out.println(r)); 
			
		
		System.out.println(" sorting names %%%%%%%%%%%%%");
		Comparator<IceCreemDTO> nameComparator=(j1,j2)->{
			return j1.getName().compareTo(j2.getName());
		};
		Stream.of(ice1,ice2,ice3,ice4,ice5).sorted(nameComparator).forEach(y->System.out.println(y));
	
		System.out.println("sorting types ############");
		
		Comparator<IceCreemDTO> typesComparator=(t1,t2)->{
			return t1.getType().compareTo(t2.getType());
		};
		Stream.of(ice1,ice2,ice3,ice4,ice5).sorted(typesComparator).forEach(y->System.out.println(y));
		
	}

}
