package com.xworkz.collectionSorting.app;

import java.awt.List;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.collectionSorting.dto.ProductDTO;

public class ProductDTORunner {

	public static void main(String[] args) {
		
		
	ProductDTO pdto1=new ProductDTO(1,"Phone",2000.0,"MI",LocalDate.of(2022, 07, 12),LocalDate.of(2025, 11, 11),2100.0,"Good",5.0,5,"500","400","300","200","100","50","Packed",5.6,"yes","RedMI",LocalDate.of(2023, 03, 19),"ya12u","NoDamage","Japan",128568768l,36123.0,"yes","2year","Mi",LocalDate.of(2022, 05, 10),LocalDate.of(2022, 05, 11));
	ProductDTO pdto2=new ProductDTO(7,"Phone",2000.0,"MI",LocalDate.of(2021, 04, 10),LocalDate.of(2026, 10, 12),2000.0,"Bad",4.0,5,"400","200","300","200","200","40","NotPacked",2.6,"no","RedMI",LocalDate.of(2023, 03, 19),"5a12u","NoDamage","Japan",66288768l,336123.0,"no","5year","Moto",LocalDate.of(2023, 06, 14),LocalDate.of(2023, 06, 15));
	ProductDTO pdto3=new ProductDTO(2,"TV",2500.0,"TATA",LocalDate.of(2019, 06, 15),LocalDate.of(2027, 05, 15),2005.0,"Good",4.0,5,"200","400","300","100","100","70","Packed",5.6,"yes","Sony",LocalDate.of(2023, 04, 10),"ca12u","Damage","India",871288768l,936123.0,"yes","0year","Yu",LocalDate.of(2023, 03, 10),LocalDate.of(2023, 03, 2));
	ProductDTO pdto4=new ProductDTO(6,"Bick",80000.0,"TOYATA",LocalDate.of(2022, 07, 15),LocalDate.of(2022, 11, 10),2600.0,"Good",2.0,5,"600","500","600","500","500","20","Packed",1.6,"no","Honda",LocalDate.of(2023, 04, 12),"ha12u","NoDamage","UK",231288768l,136123.0,"no","1year","Ki",LocalDate.of(2026, 05, 22),LocalDate.of(2026, 05, 23));
	ProductDTO pdto5=new ProductDTO(3,"Car",80000.0,"TATA",LocalDate.of(2023, 07, 10),LocalDate.of(2025, 10, 10),2600.0,"Bad",2.0,5,"900","300","100","800","800","50","NotPacked",6.6,"yes","Audi",LocalDate.of(2023, 05, 02),"ya62u","NoDamage","China",561288768l,236123.0,"no","8year","Ai",LocalDate.of(2023, 03, 23),LocalDate.of(2023, 03, 24));
	ProductDTO pdto6=new ProductDTO(8,"Bag",2500.0,"WILDCRAFT",LocalDate.of(2024, 04, 11),LocalDate.of(2026, 11, 10),2005.0,"Good",2.0,5,"400","100","600","200","100","10","Packed",3.6,"yes","Puma",LocalDate.of(2023, 05, 10),"y212u","NoDamage","India",153288768l,036123.0,"yes","2year","Hi",LocalDate.of(2025, 05, 12),LocalDate.of(2025, 05, 12));
	ProductDTO pdto7=new ProductDTO(4,"TV",2000.0,"MI",LocalDate.of(2018, 06, 10),LocalDate.of(2025, 01, 10),2010.0,"Bad",5.0,5,"600","600","200","100","500","80","NotPacked",5.6,"no","Sony",LocalDate.of(2023, 02, 20),"va12u","Damage","China",891288768l,0136123.0,"yes","6year","Nu",LocalDate.of(2023, 03, 10),LocalDate.of(2023, 03, 11));
	ProductDTO pdto8=new ProductDTO(9,"Bick",90000.0,"TOYATA",LocalDate.of(2019, 07, 10),LocalDate.of(2023, 01, 11),2100.0,"Bad",4.0,5,"400","100","500","500","300","50","NotPacked",2.6,"yes","Honda",LocalDate.of(2023, 02, 18),"ua12u","NoDamage","India",341288768l,3436123.0,"no","8year","Mm",LocalDate.of(2025, 05, 20),LocalDate.of(2025, 05, 21));
	ProductDTO pdto9=new ProductDTO(5,"Car",79000.0,"TATA",LocalDate.of(2022, 04, 01),LocalDate.of(2027, 05, 10),2005.0,"Bad",3.0,5,"800","400","300","200","600","30","Packed",8.6,"no","Audi",LocalDate.of(2023, 07, 14),"ia12u","NoDamage","USA",221288768l,236123.0,"yes","3year","Io",LocalDate.of(2021, 05, 10),LocalDate.of(2021, 05, 10));
	ProductDTO pdto10=new ProductDTO(10,"Bag",2500.0,"APPLE",LocalDate.of(2023, 06, 11),LocalDate.of(2026, 11, 11),2200.0,"Good",2.0,5,"500","400","400","300","100","30","NotPacked",5.6,"no","Puma",LocalDate.of(2023, 07, 10),"ba12u","Damage","India",781288768l,326123.0,"no","2year","Pi",LocalDate.of(2020, 03, 12),LocalDate.of(2020, 03, 13));
	
	Collection<ProductDTO> collection=new LinkedList<ProductDTO>();
	collection.add(pdto1);
	collection.add(pdto2);
	collection.add(pdto3);
	collection.add(pdto4);
	collection.add(pdto5);
	collection.add(pdto6);
	collection.add(pdto7);
	collection.add(pdto8);
	collection.add(pdto9);
	collection.add(pdto10);
	
	collection.stream().sorted().forEach(y->System.out.println(y));
	System.out.println("sorted by name in asce...");
	Comparator<ProductDTO> nameCompire=(n1,n2)->{
		return n1.getName().compareTo(n2.getName());
	};
	collection.stream().sorted(nameCompire).forEach(y->System.out.println(y));
	System.out.println("stored by names in desc...");
	collection.stream().sorted(nameCompire.reversed()).forEach(y->System.out.println(y));
	
	Comparator<ProductDTO> priceComparator=(p1,p2)->{
		return p1.getPrice().compareTo(p2.getPrice());
	};
	System.out.println("stored by price in asce...");
	collection.stream().sorted(priceComparator).forEach(y->System.out.println(y));
	System.out.println("stored by price in desc...");
	collection.stream().sorted(priceComparator.reversed()).forEach(y->System.out.println(y));
	
	Comparator<ProductDTO> companyComparator=(c1,c2)->{
		return c1.getCompany().compareTo(c2.getCompany());
	};
	System.out.println("stored by company in asce...");
	collection.stream().sorted(companyComparator).forEach(y->System.out.println(y));
	System.out.println("stored by company in desc...");
	collection.stream().sorted(companyComparator.reversed()).forEach(y->System.out.println(y));
	
	Comparator<ProductDTO> manfdComparator=(md1,md2)->{
		return md1.getManfDate().compareTo(md2.getManfDate());
	};
	System.out.println("stored by manifacture date in asce...");
	collection.stream().sorted(manfdComparator).forEach(y->System.out.println(y));
	System.out.println("stored by mainfacture date  in desc...");
	collection.stream().sorted(manfdComparator.reversed()).forEach(y->System.out.println(y));
	

	Comparator<ProductDTO> exprComparator=(ex1,ex2)->{
		return ex1.getExpireDate().compareTo(ex2.getExpireDate());
	};
	System.out.println("stored by expire date  in asce...");
	collection.stream().sorted(exprComparator).forEach(y->System.out.println(y));
	System.out.println("stored by expire date  in desc...");
	collection.stream().sorted(exprComparator.reversed()).forEach(y->System.out.println(y));
	
	Comparator<ProductDTO> discountComparator=(d1,d2)->{
		return d1.getDiscount().compareTo(d2.getDiscount());
	};
	System.out.println("stored by discount  in asce...");
	collection.stream().sorted(discountComparator).forEach(y->System.out.println(y));
	System.out.println("stored by discount  in desc...");
	collection.stream().sorted(discountComparator.reversed()).forEach(y->System.out.println(y));
	
	Comparator<ProductDTO> discriptionComparator=(dc1,dc2)->{
		return dc1.getDescrpition().compareTo(dc2.getDescrpition());
	};
	System.out.println("stored by discription  in asce...");
	collection.stream().sorted(discriptionComparator).forEach(y->System.out.println(y));
	System.out.println("stored by discription  in desc...");
	collection.stream().sorted(discriptionComparator.reversed()).forEach(y->System.out.println(y));
	
	Comparator<ProductDTO> quantityComparator=(q1,q2)->{
		return q1.getQuantity().compareTo(q2.getQuantity());
	};
	System.out.println("stored by quanty  in asce...");
	collection.stream().sorted(quantityComparator).forEach(y->System.out.println(y));
	System.out.println("stored by quanty  in desc...");
	collection.stream().sorted(quantityComparator.reversed()).forEach(y->System.out.println(y));

	Comparator<ProductDTO> peoplerateComparator=(pr1,pr2)->{
		return pr1.getPeopleRated().compareTo(pr2.getPeopleRated());
	};
	System.out.println("stored by people rated in asce...");
	collection.stream().sorted(peoplerateComparator).forEach(y->System.out.println(y));
	System.out.println("stored by people rated  in desc...");
	collection.stream().sorted(peoplerateComparator.reversed()).forEach(y->System.out.println(y));
	
	Comparator<ProductDTO> peoplerate5Comparator=(pi1,pi2)->{
		return pi1.getPeopleRated5().compareTo(pi2.getPeopleRated5());
	};
	System.out.println("stored by people rated 5 in asce...");
	collection.stream().sorted(peoplerate5Comparator).forEach(y->System.out.println(y));
	System.out.println("stored by people rated 5  in desc...");
	collection.stream().sorted(peoplerate5Comparator.reversed()).forEach(y->System.out.println(y));
	
	Comparator<ProductDTO> peoplerate4Comparator=(pu1,pu2)->{
		return pu1.getPeopleRated4().compareTo(pu2.getPeopleRated4());
	};
	System.out.println("stored by people rated 4 in asce...");
	collection.stream().sorted(peoplerate4Comparator).forEach(y->System.out.println(y));
	System.out.println("stored by people rated 4  in desc...");
	collection.stream().sorted(peoplerate4Comparator.reversed()).forEach(y->System.out.println(y));
	

	Comparator<ProductDTO> peoplerate3Comparator=(pl1,pl2)->{
		return pl1.getPeopleRated3().compareTo(pl2.getPeopleRated3());
	};
	System.out.println("stored by people rated 3 in asce...");
	collection.stream().sorted(peoplerate3Comparator).forEach(y->System.out.println(y));
	System.out.println("stored by people rated 3  in desc...");
	collection.stream().sorted(peoplerate3Comparator.reversed()).forEach(y->System.out.println(y));
	

	Comparator<ProductDTO> peoplerate2Comparator=(pk1,pk2)->{
		return pk1.getPeopleRated2().compareTo(pk2.getPeopleRated2());
	};
	System.out.println("stored by people rated 2 in asce...");
	collection.stream().sorted(peoplerate2Comparator).forEach(y->System.out.println(y));
	System.out.println("stored by people rated 2  in desc...");
	collection.stream().sorted(peoplerate2Comparator.reversed()).forEach(y->System.out.println(y));
	


	Comparator<ProductDTO> peoplerate1Comparator=(pj1,pj2)->{
		return pj1.getPeopleRated1().compareTo(pj2.getPeopleRated1());
	};
	System.out.println("stored by people rated 1 in asce...");
	collection.stream().sorted(peoplerate1Comparator).forEach(y->System.out.println(y));
	System.out.println("stored by people rated 1  in desc...");
	collection.stream().sorted(peoplerate1Comparator.reversed()).forEach(y->System.out.println(y));
	
	Comparator<ProductDTO> packerComparator=(pa1,pa2)->{
		return pa1.getPacker().compareTo(pa2.getPacker());
	};
	System.out.println("stored by packer in asce...");
	collection.stream().sorted(packerComparator).forEach(y->System.out.println(y));
	System.out.println("stored by packer  in desc...");
	collection.stream().sorted(packerComparator.reversed()).forEach(y->System.out.println(y));
	

	Comparator<ProductDTO> itemweightComparator=(iw1,iw2)->{
		return iw1.getItemWeight().compareTo(iw2.getItemWeight());
	};
	System.out.println("stored by item Weight in asce...");
	collection.stream().sorted(itemweightComparator).forEach(y->System.out.println(y));
	System.out.println("stored by item Weight  in desc...");
	collection.stream().sorted(itemweightComparator.reversed()).forEach(y->System.out.println(y));
	
	Comparator<ProductDTO> includedComparator=(in1,in2)->{
		return in1.getIncluded().compareTo(in2.getIncluded());
	};
	System.out.println("stored by included in asce...");
	collection.stream().sorted(includedComparator).forEach(y->System.out.println(y));
	System.out.println("stored by included  in desc...");
	collection.stream().sorted(includedComparator.reversed()).forEach(y->System.out.println(y));
	
	Comparator<ProductDTO> genericnameComparator=(gn1,gn2)->{
		return gn1.getGenericName().compareTo(gn2.getGenericName());
	};
	System.out.println("stored by generic name in asce...");
	collection.stream().sorted(genericnameComparator).forEach(y->System.out.println(y));
	System.out.println("stored by generic name  in desc...");
	collection.stream().sorted(genericnameComparator.reversed()).forEach(y->System.out.println(y));
	
	Comparator<ProductDTO> avaliabledateComparator=(av1,av2)->{
		return av1.getAvaliabledate().compareTo(av2.getAvaliabledate());
	};
	System.out.println("stored by avaliable date  in asce...");
	collection.stream().sorted(avaliabledateComparator).forEach(y->System.out.println(y));
	System.out.println("stored by avliable date   in desc...");
	collection.stream().sorted(avaliabledateComparator.reversed()).forEach(y->System.out.println(y));
	
	Comparator<ProductDTO> asinComparator=(as1,as2)->{
		return as1.getAsin().compareTo(as2.getAsin());
	};
	System.out.println("stored by asin in asce...");
	collection.stream().sorted(asinComparator).forEach(y->System.out.println(y));
	System.out.println("stored by asin  in desc...");
	collection.stream().sorted(asinComparator.reversed()).forEach(y->System.out.println(y));
	
	Comparator<ProductDTO> damageComparator=(da1,da2)->{
		return da1.getDamage().compareTo(da2.getDamage());
	};
	System.out.println("stored by damage in asce...");
	collection.stream().sorted(damageComparator).forEach(y->System.out.println(y));
	System.out.println("stored by damage  in desc...");
	collection.stream().sorted(damageComparator.reversed()).forEach(y->System.out.println(y));
	
	Comparator<ProductDTO> countryoragComparator=(co1,co2)->{
		return co1.getCountryofOrigin().compareTo(co2.getCountryofOrigin());
	};
	System.out.println("stored by Country of origine in asce...");
	collection.stream().sorted(countryoragComparator).forEach(y->System.out.println(y));
	System.out.println("stored by country of origine  in desc...");
	collection.stream().sorted(countryoragComparator.reversed()).forEach(y->System.out.println(y));
	
	Comparator<ProductDTO> mobilenoComparator=(mn1,mn2)->{
		return mn1.getMobileno().compareTo(mn2.getMobileno());
	};
	System.out.println("stored by mobile number in asce...");
	collection.stream().sorted(mobilenoComparator).forEach(y->System.out.println(y));
	System.out.println("stored by mobile number  in desc...");
	collection.stream().sorted(mobilenoComparator.reversed()).forEach(y->System.out.println(y));
	
	Comparator<ProductDTO> serialnoComparator=(sn1,sn2)->{
		return sn1.getSerialno().compareTo(sn2.getSerialno());
	};
	System.out.println(" storing serial number in asc..");
	collection.stream().sorted(serialnoComparator).forEach(y->System.out.println(y));
	System.out.println(" storing serial number in dsc..");
	collection.stream().sorted(serialnoComparator.reversed()).forEach(y->System.out.println(y));
	
	
	Comparator<ProductDTO> returnableComparator=(ra1,ra2)->{
		return ra1.getRetunable().compareTo(ra2.getRetunable());
	};
	System.out.println("storing returnable in asce..");
	collection.stream().sorted(returnableComparator).forEach(y->System.out.println(y));
	System.out.println("storing returnable in dsce..");
	collection.stream().sorted(returnableComparator.reversed()).forEach(y->System.out.println(y));
	
	Comparator<ProductDTO> warrentyComparator=(wa1,wa2)->{
		return wa1.getWarrenty().compareTo(wa2.getWarrenty());
	};
	System.out.println("sorting warrenty in asce..");
	collection.stream().sorted(warrentyComparator).forEach(y->System.out.println(y));
	System.out.println("sorting warrenty in asce..");
	collection.stream().sorted(warrentyComparator.reversed()).forEach(y->System.out.println(y));
	
	Comparator<ProductDTO> primaryComparator=(pri1,pri2)->{
		return pri1.getPrimeDelivaery().compareTo(pri2.getPrimeDelivaery());
	};
	System.out.println("sorting primery develery in asce..");
	collection.stream().sorted(primaryComparator).forEach(y->System.out.println(y));
	System.out.println("sorting primery develery in asce..");
	collection.stream().sorted(primaryComparator.reversed()).forEach(y->System.out.println(y));
	
	
	Comparator<ProductDTO> develaryEComparator=(de1,de2)->{
		return de1.getDeliveryExpectedate().compareTo(de2.getDeliveryExpectedate());
	};
	System.out.println("storing develaryEComparator in asc..");
	collection.stream().sorted(develaryEComparator).forEach(r->System.out.println(r));
	System.out.println("storing develaryEComparator in dsc..");
	collection.stream().sorted(develaryEComparator.reversed()).forEach(r->System.out.println(r));
	
	Comparator<ProductDTO> returnComparator=(ret1,ret2)->{
		return ret1.getReturnBy().compareTo(ret2.getReturnBy());
	};
	System.out.println("storing rerurn by in asc..");
	collection.stream().sorted(returnComparator).forEach(r->System.out.println(r));
	System.out.println("storing return by in dsc..");
	collection.stream().sorted(returnComparator.reversed()).forEach(r->System.out.println(r));
	
    System.out.println("1 storing the 3 propertys in asc order. nam,price,discount..");
    collection.stream().sorted(nameCompire.thenComparing(priceComparator.thenComparing(discountComparator))).forEach(y->System.out.println(y));
    System.out.println("2 storing the 3 propertys in asc order. nam,price,company..");
    collection.stream().sorted(nameCompire.thenComparing(priceComparator.thenComparing(companyComparator))).forEach(y->System.out.println(y));
    System.out.println("3 storing the 3 propertys in asc order. nam,price,quantity..");
    collection.stream().sorted(nameCompire.thenComparing(priceComparator.thenComparing(quantityComparator))).forEach(y->System.out.println(y));
    System.out.println("4 storing the 3 propertys in asc order. nam,price,peoplerate5..");
    collection.stream().sorted(nameCompire.thenComparing(priceComparator.thenComparing(peoplerate5Comparator))).forEach(y->System.out.println(y));
    System.out.println("5 storing the 3 propertys in asc order. nam,company name,peoplerated5..");
    collection.stream().sorted(nameCompire.thenComparing(companyComparator.thenComparing(peoplerate5Comparator))).forEach(y->System.out.println(y));
    System.out.println("6 storing the 3 propertys in asc order. nam,company name,people rated 4..");
    collection.stream().sorted(nameCompire.thenComparing(companyComparator.thenComparing(peoplerate4Comparator))).forEach(y->System.out.println(y));
    System.out.println("7 storing the 3 propertys in asc order. nam,companyname,peoplerated3..");
    collection.stream().sorted(nameCompire.thenComparing(companyComparator.thenComparing(peoplerate3Comparator))).forEach(y->System.out.println(y));
    System.out.println("8 storing the 3 propertys in asc order. nam,companyname,itemweight..");
    collection.stream().sorted(nameCompire.thenComparing(companyComparator.thenComparing(itemweightComparator))).forEach(y->System.out.println(y));
    System.out.println("9 storing the 3 propertys in asc order. nam,price,develaryDate..");
    collection.stream().sorted(nameCompire.thenComparing(companyComparator.thenComparing(develaryEComparator))).forEach(y->System.out.println(y));
    System.out.println("10 storing the 3 propertys in asc order. nam,price,returndate..");
    collection.stream().sorted(nameCompire.thenComparing(companyComparator.thenComparing(returnComparator))).forEach(y->System.out.println(y));
    
    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
    System.out.println("1 storing the 3 propertys in dsce.. order. nam,price,discount..");
    collection.stream().sorted(nameCompire.thenComparing(priceComparator.thenComparing(discountComparator)).reversed()).forEach(y->System.out.println(y));
    System.out.println("2 storing the 2 propertys in dsce.. order. nam,price...");
    collection.stream().sorted(nameCompire.thenComparing(priceComparator).reversed()).forEach(y->System.out.println(y));
    System.out.println("3 storing the 2 propertys in dsce.. order. nam,quantity..");
    collection.stream().sorted(nameCompire.thenComparing(quantityComparator).reversed()).forEach(y->System.out.println(y));
    System.out.println("4 storing the 2 propertys in dsce order. nam,peoplerate5..");
    collection.stream().sorted(nameCompire.thenComparing(peoplerate5Comparator).reversed()).forEach(y->System.out.println(y));
    System.out.println("5 storing the 2 propertys in dsce order..company name,peoplerated5..");
    collection.stream().sorted(companyComparator.thenComparing(peoplerate5Comparator).reversed()).forEach(y->System.out.println(y));
    System.out.println("6 storing the 2 propertys in dsce order. nam,people rated 4..");
    collection.stream().sorted(nameCompire.thenComparing(peoplerate4Comparator).reversed()).forEach(y->System.out.println(y));
    System.out.println("7 storing the 2 propertys in dsce order. nam,peoplerated3..");
    collection.stream().sorted(nameCompire.thenComparing(peoplerate3Comparator).reversed()).forEach(y->System.out.println(y));
    System.out.println("8 storing the 2 propertys in dsce order. companyname,itemweight..");
    collection.stream().sorted(companyComparator.thenComparing(itemweightComparator).reversed()).forEach(y->System.out.println(y));
    System.out.println("9 storing the 2 propertys in dsce order. nam,develaryDate..");
    collection.stream().sorted(nameCompire.thenComparing(develaryEComparator).reversed()).forEach(y->System.out.println(y));
    System.out.println("10 storing the 2 propertys in dsce order. nam,returndate..");
    collection.stream().sorted(nameCompire.thenComparing(returnComparator).reversed()).forEach(y->System.out.println(y));
   
    System.out.println("Only ids...");
     Collection<Integer> ids=collection.stream().map(map->map.getId()).collect(Collectors.toList());
     ids.forEach(y->System.out.println(y));
     System.out.println("Only names...");
     Collection<String> names=collection.stream().map(map->map.getName()).collect(Collectors.toList());
     names.forEach(y->System.out.println(y));
     System.out.println("Only Price...");
     Collection<Double> prices=collection.stream().map(map->map.getPrice()).collect(Collectors.toList());
     prices.forEach(y->System.out.println(y));
     System.out.println("Only company...");
     Collection<String> companys=collection.stream().map(map->map.getCompany()).collect(Collectors.toList());
     companys.forEach(y->System.out.println(y));
     System.out.println("Only Manifacture date...");
     Collection<LocalDate> mnfdates=collection.stream().map(map->map.getManfDate()).collect(Collectors.toList());
     mnfdates.forEach(y->System.out.println(y));
     System.out.println("Only Expire date...");
     Collection<LocalDate> expdates=collection.stream().map(map->map.getExpireDate()).collect(Collectors.toList());
     expdates.forEach(y->System.out.println(y));
     System.out.println("Only Discount...");
     Collection<Double> discounts=collection.stream().map(map->map.getDiscount()).collect(Collectors.toList());
     discounts.forEach(y->System.out.println(y));
     System.out.println("Only Discripction...");
     Collection<String> discres=collection.stream().map(map->map.getDescrpition()).collect(Collectors.toList());
     discres.forEach(y->System.out.println(y));
     System.out.println("Only quantity...");
     Collection<Double> qunatity=collection.stream().map(map->map.getQuantity()).collect(Collectors.toList());
     qunatity.forEach(y->System.out.println(y));
     System.out.println("Only people rated 5...");
     Collection<String> pesr5=collection.stream().map(map->map.getPeopleRated5()).collect(Collectors.toList());
     pesr5.forEach(y->System.out.println(y));
     System.out.println("Only people rated 4...");
     Collection<String> pesr4=collection.stream().map(map->map.getPeopleRated4()).collect(Collectors.toList());
     pesr4.forEach(y->System.out.println(y));
     System.out.println("Only people rated 3...");
     Collection<String> pesr3=collection.stream().map(map->map.getPeopleRated3()).collect(Collectors.toList());
     pesr3.forEach(y->System.out.println(y));
     System.out.println("Only people rated 2...");
     Collection<String> pesr2=collection.stream().map(map->map.getPeopleRated2()).collect(Collectors.toList());
     pesr2.forEach(y->System.out.println(y));
     System.out.println("Only people rated 1...");
     Collection<String> pesr1=collection.stream().map(map->map.getPeopleRated1()).collect(Collectors.toList());
     pesr1.forEach(y->System.out.println(y));
     System.out.println("Only packers...");
     Collection<String> packers=collection.stream().map(map->map.getPacker()).collect(Collectors.toList());
     packers.forEach(y->System.out.println(y));
     System.out.println("Only item weight...");
     Collection<Double> weights=collection.stream().map(map->map.getItemWeight()).collect(Collectors.toList());
     weights.forEach(y->System.out.println(y));
     System.out.println("Only generic name...");
     Collection<String> gname=collection.stream().map(map->map.getGenericName()).collect(Collectors.toList());
     gname.forEach(y->System.out.println(y));
     System.out.println("Only avaliable date ...");
     Collection<LocalDate> avalibdate=collection.stream().map(map->map.getAvaliabledate()).collect(Collectors.toList());
     avalibdate.forEach(y->System.out.println(y));
     System.out.println("Only asin....");
     Collection<String> asin=collection.stream().map(map->map.getAsin()).collect(Collectors.toList());
     asin.forEach(y->System.out.println(y));
     System.out.println("Only Damages...");
     Collection<String> damage=collection.stream().map(map->map.getDamage()).collect(Collectors.toList());
     damage.forEach(y->System.out.println(y));
     System.out.println("Only Contary of origin....");
     Collection<String> cotoforig=collection.stream().map(map->map.getCountryofOrigin()).collect(Collectors.toList());
     cotoforig.forEach(y->System.out.println(y));
     System.out.println("Only Mobile numbers...");
     Collection<Long> mobil=collection.stream().map(map->map.getMobileno()).collect(Collectors.toList());
     mobil.forEach(y->System.out.println(y));
     System.out.println("Only serial numbers...");
     Collection<Double> serial=collection.stream().map(map->map.getSerialno()).collect(Collectors.toList());
     serial.forEach(y->System.out.println(y));
     System.out.println("Only warrenty...");
     Collection<String> warrenty=collection.stream().map(map->map.getWarrenty()).collect(Collectors.toList());
     warrenty.forEach(y->System.out.println(y));
     System.out.println("Only Primary Develery...");
     Collection<String> primary=collection.stream().map(map->map.getPrimeDelivaery()).collect(Collectors.toList());
     primary.forEach(y->System.out.println(y));
     System.out.println("Only develery date...");
     Collection<LocalDate> ddate=collection.stream().map(map->map.getDeliveryExpectedate()).collect(Collectors.toList());
     ddate.forEach(y->System.out.println(y));
     System.out.println("Only return date ...");
     Collection<LocalDate> returnby=collection.stream().map(map->map.getReturnBy()).collect(Collectors.toList());
     returnby.forEach(y->System.out.println(y));
     System.out.println("%%%%%%% simple method");
     collection.stream().map(map->map.getManfDate()).forEach(y->System.out.println(y));
	}
}
