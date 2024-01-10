package stream.com.xworkz.app;

import java.util.ArrayList;
import java.util.Collection;


public class RoleStream {
	public static void main(String[] args) {
		
		Collection<String> rolecoCollection=new ArrayList();
		rolecoCollection.add("Software Engineeer");
		rolecoCollection.add("Java Dovelopwe");
		rolecoCollection.add("Human Resource");
		rolecoCollection.add("Recruitter");
		rolecoCollection.add("System Software");
		rolecoCollection.add("Data Engineer");
		rolecoCollection.add("Data Anilist");
		rolecoCollection.add("System Suport");
		rolecoCollection.add("performance Tester");
		rolecoCollection.add("web developer");
		rolecoCollection.add("Autometic Tester");
		
		for(String role:rolecoCollection) {
			if(role.endsWith("Tester")) {
				System.out.println(role);
		}
		}
		System.out.println("$$$$$$$");
		//stream  it allow to perform inbetween
		
		rolecoCollection.stream().filter(y->y.contains("s")).forEach(ref->System.out.println("name which contan s:"+ref));
		System.out.println("$$$$$$$");
		rolecoCollection.stream().filter(role->!role.contains("s")).forEach(ref->System.out.println(ref));
		System.out.println("$$$$$$$");
		rolecoCollection.stream().filter(role->role.endsWith("r")).forEach(ref->System.out.println(ref));
		
		
		
		
	}

}
