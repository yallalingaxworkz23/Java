package stream.com.xworkz.app;

import java.util.ArrayList;
import java.util.Collection;

public class Festival {
	
	public static void main(String[] args) {
		
		Collection<String> festivalcollection=new ArrayList();
		festivalcollection.add("Diwali");
		festivalcollection.add("Holi");
		festivalcollection.add("Eid-Ul-Fitr");
		festivalcollection.add("Navaratri");
		festivalcollection.add("Durga Puja");
		festivalcollection.add("Dussehra");
		festivalcollection.add("Ganesh Chaturthi");
		festivalcollection.add("Onam");
		festivalcollection.add("Janmashtami");
		festivalcollection.add("Christmas");
		festivalcollection.add("Pongal");
		festivalcollection.add("Baisakhi");
		festivalcollection.add("Ram Navami");
		festivalcollection.add("Maha Sivaratri");
		festivalcollection.add("Raksha Bandhan");
		festivalcollection.add("Makar Sankranti");
		System.out.println(festivalcollection.size());
		festivalcollection.stream().filter(y->y.contains("D") && y.contains("s")).forEach(ref->System.out.println(ref));
		System.out.println("+++++++++++++++++++");
		festivalcollection.stream().filter(y->y.length()>6).forEach(ref->System.out.println("name which contans more then 6 character is:"+ref));
		System.out.println("*****************8");
		festivalcollection.stream().filter(y->y.length()<6).forEach(ref->System.out.println("name which contans less then 6 character is:"+ref));
		System.out.println("%%%%%%%%%%%%%");
		
		festivalcollection.stream().filter(y->y.contains("O") || y.contains("o")).forEach(ref->System.out.println("name which contans O and o is:"+ref));
		System.out.println("#######################");
		festivalcollection.stream().filter(y->!y.contains("g")).forEach(ref->System.out.println("name which not contans g is:"+ref));
		System.out.println("&&&&&&&&&&&");
		festivalcollection.stream().filter(y->y.endsWith("S") || y.endsWith("s")).forEach(ref->System.out.println("name which ends with S or s is:"+ref));
		System.out.println("%%%%%%%");
		festivalcollection.stream().filter(y->y.contains("Ram")).forEach(ref->System.out.println("name which contans Ram is:"+ref));
		System.out.println("------------");
		festivalcollection.stream().filter(y->y.contains("Z") || y.contains("R")).forEach(ref->System.out.println("name which contans less then 6 character is:"+ref));
	}

}
