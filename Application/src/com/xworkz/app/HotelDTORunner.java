package com.xworkz.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

import com.xworkz.app.dto.HotelDTO;

public class HotelDTORunner {
	public static void main(String[] args) {
		
		HotelDTO hotelDTO1=new HotelDTO(1,"Udupi Hotal","Prajval",2,"India");
		HotelDTO hotelDTO2=new HotelDTO(2,"Hotal Krishna","Akash",3,"SriLanka");
		HotelDTO hotelDTO3=new HotelDTO(3,"DRS hotal","Rakesh",1,"USA");
		HotelDTO hotelDTO4=new HotelDTO(4,"Raichur spl","Yallu",5,"India");
		HotelDTO hotelDTO5=new HotelDTO(5,"HK Hotal","Manu",4,"UK");
		HotelDTO hotelDTO6=new HotelDTO(6,"TK hotak","Dharshan",2,"UK");
		HotelDTO hotelDTO7=new HotelDTO(7,"KRS hotal","Anvith",3,"India");
		HotelDTO hotelDTO8=new HotelDTO(8,"Hotal Mubarak","Prakesh",3,"SriLanka");
		HotelDTO hotelDTO9=new HotelDTO(9,"Speci Hotal","Manja",1,"USA");
		HotelDTO hotelDTO10=new HotelDTO(10,"Benglor Hotal","Shamanth",2,"SriLanka");
		
		Collection<HotelDTO> hotalcollection=new ArrayList();
		hotalcollection.add(hotelDTO1);
		hotalcollection.add(hotelDTO2);
		hotalcollection.add(hotelDTO3);
		hotalcollection.add(hotelDTO4);
		hotalcollection.add(hotelDTO5);
		hotalcollection.add(hotelDTO6);
		hotalcollection.add(hotelDTO7);
		hotalcollection.add(hotelDTO8);
		hotalcollection.add(hotelDTO9);
		hotalcollection.add(hotelDTO10);
		
		Collection<HotelDTO> hotalcollection2=new ArrayList();
		System.out.println(hotalcollection.size());
		
		hotalcollection.stream().filter(y->y.getLocation().equals("India")).forEach(r->System.out.println(r));
		System.out.println("&&&&&&&&&&&&&&&&&&&&");
		hotalcollection.stream().filter(y->y.getLocation().equals("SriLanka")).forEach(r->System.out.println(r));
		System.out.println("$$$$$$$$");
		//hotalcollection.stream().filter(y->y.getHname());
		System.out.println("&&&&&&&");
		
		//hotalcollection.stream().filter(y->y.getGst()).forEach(r->System.out.println(r));
		System.out.println("only ids if location is uk");
		hotalcollection.stream().filter(y->y.getLocation().equals("UK")).map(i->i.getId()).forEach(r->System.out.println(r));
		System.out.println("$$$$$$$$$$");
		System.out.println("Owners Name  if location is USA");
		hotalcollection.stream().filter(y->y.getLocation().equals("USA")).map(h->h.getHname()).forEach(y->System.out.println(y));
		System.out.println("((((((((((((");
		
		System.out.println("hotal name which are present in india");
        hotalcollection.stream().filter(y->y.getLocation().equals("India")).map(h->h.getHname()).forEach(y->System.out.println(y));
        System.out.println("Owners name which are present in india");
        hotalcollection.stream().filter(y->y.getLocation().equals("India")).map(o->o.getOwnername()).forEach(y->System.out.println(y));
        //hotalcollection.stream().filter(y->y.getId()).forEach(t->System.out.println(t));
       System.out.println("hotal name in srilanka");
       hotalcollection.stream().filter(s->s.getLocation().equals("SriLanka")).map(h->h.getHname()).forEach(y->System.out.println(y));
       System.out.println("*********");
       hotalcollection.stream().filter(y->y.getOwnername().endsWith("u")).map(y->y.getOwnername()).forEach(y->System.out.println(y));
       hotalcollection.stream().filter(i->i.getOwnername().equals("Yallu")).map(y->y.getGst()).forEach(y->System.out.println(y));
       
      // for (HotelDTO hotelDTO : hotalcollection) {
    	//   if(hotelDTO.getId()) {
    //		   System.out.println(hotelDTO.getId());
    	//   }
       System.out.println("only ids...");
       Iterator<HotelDTO> ref=hotalcollection.iterator();
       while(ref.hasNext()) {
    	   HotelDTO id=ref.next();
    	   System.out.println(id.getId());
	}
       System.out.println("only Ownears name..");
       Iterator<HotelDTO> ref1=hotalcollection.iterator();
       while(ref1.hasNext()) {
    	   HotelDTO own=ref1.next();
    	   System.out.println(own.getOwnername());
       }
       System.out.println("only gst ...");
       Iterator<HotelDTO> ref2=hotalcollection.iterator();
       while(ref2.hasNext()) {
    	   HotelDTO gst=ref2.next();
    	   System.out.println(gst.getGst());
       }
       
	}
}
