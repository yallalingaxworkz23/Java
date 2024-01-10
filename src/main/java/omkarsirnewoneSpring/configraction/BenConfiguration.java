package omkarsirnewoneSpring.configraction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("omkarsirnewoneSpring")
@Configuration
public class BenConfiguration {
	
	public BenConfiguration() {
	System.out.println("confiraction is created..");
		// TODO Auto-generated constructor stub
	}
@Bean
public String[] name() {
	System.out.println("five names..");
	String[] datas= {"yallu","kumar","roopa","hanumatha","cv"};
	for (String string : datas) {
		System.out.println(string);
	}
	return datas;
	
}
 @Bean
 public Long[] phonenumber() {
	 System.out.println("five nubmers...");
	 Long[] numbers= {9449483728l,8431224817l,8217713630l,1234567890l,1234567890l};
	 for (Long long1 : numbers) {
		 System.out.println(long1);
		
	}
	return null;
 }
 
 @Bean
 public String[] email() {
	 System.out.println("five 5emails..");
	 String[] emails= {"yall3630@gmail.com","kumar@gmail.com","roopa@gmail.com","hanumanth@gmail.com","cv@gmail.com"};
	 for (String string : emails) {
		System.out.println(string);
	}
	return emails;
 }
 @Bean
 public Collection<String> element(){
	 System.out.println("5 elements..");
	 Collection<String> elements= new LinkedHashSet<String>();
	 elements.add("leo");
	 elements.add("yallalinga");
	 elements.add("roopa");
	 elements.add("kumar");
	 
	 elements.forEach(y->System.out.println("using collection.."+y));
	return elements;
 }
 @Bean
 public ArrayList<Integer> age(){
	 
	 ArrayList<Integer> ages= new ArrayList<Integer>();
	 ages.add(187);
	 ages.add(188);
	 ages.add(189);
	 ages.add(180);
	 ages.add(181);
	 
	 ages.forEach(y->System.out.println(y));
	return ages;
 }
 
 @Bean
 public TreeSet<String> color(){
	 
	 TreeSet<String> colors =new  TreeSet<String>();
	 colors.add("red");
	 colors.add("black");
	 colors.add("brown");
	 colors.add("white");
	 colors.add("green");
	 colors.forEach(y->System.out.println("colours using tree set.."+y));
	return colors;
 }

 @Bean
 public HashMap<String,Integer> nameWithAges(){
	 
	 HashMap<String, Integer> nameWithAges = new  HashMap<String, Integer>();
	 nameWithAges.put("yallu",187);
	 nameWithAges.put("cv",817);
	 nameWithAges.put("kumar",17);
	 nameWithAges.put("roopa",87);
	 
	 nameWithAges.keySet().forEach(y->System.out.println("using map -->keys"+y));
	 nameWithAges.values().forEach(y->System.out.println("using mapd but values"+y));
	return nameWithAges;	 
	 
 }
}
