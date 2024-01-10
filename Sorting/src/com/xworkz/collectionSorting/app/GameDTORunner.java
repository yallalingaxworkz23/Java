package com.xworkz.collectionSorting.app;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.collectionSorting.dto.GameDTO;

public class GameDTORunner {
	public static void main(String[] args) {
		
		GameDTO gt1=new GameDTO(3, "Cricket", 11d, 12d, LocalDate.of(2022, 02, 28), "India", "Pakisthan", 1.30);
		GameDTO gt2=new GameDTO(4, "football", 11d, 22d, LocalDate.of(2022, 01, 20), "france", "Irland", 1.40);
		GameDTO gt3=new GameDTO(7, "NetBall", 7d, 72d, LocalDate.of(2012, 04, 19), "prochigal", "India", 2.60);
		GameDTO gt4=new GameDTO(8, "Cricket", 11d, 12d, LocalDate.of(2018, 05, 16), "India", "France", 4.30);
		GameDTO gt5=new GameDTO(1, "Football", 11d, 2d, LocalDate.of(2019, 07, 02), "pakistan", "China", 3.30);
		GameDTO gt6=new GameDTO(2, "NetBall", 6d, 52d, LocalDate.of(2020, 04, 07), "Irland", "pakisthan", 1.30);
		GameDTO gt7=new GameDTO(5, "Throwball", 9d, 102d, LocalDate.of(2021, 07, 11), "China", "Irland", 1.60);
		GameDTO gt8=new GameDTO(6, "Hockey", 10d, 52d, LocalDate.of(2021, 05, 29), "USA", "India", 4.20);
		GameDTO gt9=new GameDTO(9, "Handball", 9d, 166d, LocalDate.of(2023, 03, 28), "China", "USA", 1.60);
		GameDTO gt10=new GameDTO(10, "Batbetton", 2d, 192d, LocalDate.of(2024, 07, 03), "SA", "China", 4.20);
		
		System.out.println("id in ascding order...");
		Stream.of(gt1,gt2,gt3,gt4,gt5,gt6,gt7,gt8,gt9,gt10).sorted().forEach(t->System.out.println(t));
		
		System.out.println("sorting name by ascending order..");
		Comparator<GameDTO> namesCompire=(n1,n2)->{
			return n1.getName().compareTo(n2.getName());
		};
		Stream.of(gt1,gt2,gt3,gt4,gt5,gt6,gt7,gt8,gt9,gt10).sorted(namesCompire).forEach(y->System.out.println(y));
	
		System.out.println("names by descinding order sorted..");
		Comparator<GameDTO> names1Compire=(n1,n2)->{
			return n2.getName().compareTo(n1.getName());
		};
		Stream.of(gt1,gt2,gt3,gt4,gt5,gt6,gt7,gt8,gt9,gt10).sorted(names1Compire).forEach(y->System.out.println(y));
	
		System.out.println("sordet by points in asc..");
		Comparator<GameDTO> pointCompire=(p1,p2)->{
			return p1.getPoints().compareTo(p2.getPoints());
		};
		Stream.of(gt1,gt2,gt3,gt4,gt5,gt6,gt7,gt8,gt9,gt10).sorted(pointCompire).forEach(y->System.out.println(y));
		
		System.out.println("sorted points in dsecinding order...");
		Comparator<GameDTO> poCompire=(p1,p2)->{
			return p2.getPoints().compareTo(p1.getPoints());
		};
		Stream.of(gt1,gt2,gt3,gt4,gt5,gt6,gt7,gt8,gt9,gt10).sorted(poCompire).forEach(y->System.out.println(y));
		
		System.out.println("event date in ascinding order..");
	    Comparator<GameDTO> evdate=(d1,d2)->{
	    	return d1.getEventDate().compareTo(d2.getEventDate());
	    };
	    Stream.of(gt1,gt2,gt3,gt4,gt5,gt6,gt7,gt8,gt9,gt10).sorted(evdate).forEach(y->System.out.println(y));
	    

		System.out.println("event date in Descinding order..");
	    Comparator<GameDTO> evdates=(d1,d2)->{
	    	return d2.getEventDate().compareTo(d1.getEventDate());
	    };
	    Stream.of(gt1,gt2,gt3,gt4,gt5,gt6,gt7,gt8,gt9,gt10).sorted(evdates).forEach(y->System.out.println(y));
	    
	    System.out.println("storing name and points in ascinding order..");
	    Comparator<GameDTO> pointsCompire1=(p1,p2)->{
			return p1.getPoints().compareTo(p2.getPoints());
	    };
	    
	    Comparator<GameDTO> namesCompire1=(n1,n2)->{
	    	return n1.getName().compareTo(n2.getName());
	    };
	    Stream.of(gt1,gt2,gt3,gt4,gt5,gt6,gt7,gt8,gt9,gt10).sorted(namesCompire1.thenComparing(pointsCompire1)).forEach(y->System.out.println(y));
	    System.out.println("&&&&&&&&&");
	  System.out.println("compiring name,points and event date in asc order..");
	    Comparator<GameDTO> namesCompir2=(n1,n2)->{
	    	return n1.getName().compareTo(n2.getName());
	    };
	    Comparator<GameDTO> pointsCompir2=(p1,p2)->{
	    	return p1.getPoints().compareTo(p2.getPoints());
	    };
	    Comparator<GameDTO> dateCompir=(d1,d2)->{
	    	return d1.getEventDate().compareTo(d2.getEventDate());
	    };
	    Stream.of(gt1,gt2,gt3,gt4,gt5,gt6,gt7,gt8,gt9,gt10).sorted(namesCompir2.thenComparing(pointsCompir2.thenComparing(dateCompir))).forEach(y->System.out.println(y));
	    
	    System.out.println("&&&&&&&");
	    System.out.println("event date and duraction in descending order...");
	    
	    Comparator<GameDTO> duractuionCompire=(d1,d2)->{
	    	return d2.getDuration().compareTo(d1.getDuration());
	    };
	    Comparator<GameDTO> dateCompire1=(d1,d2)->{
	    	return d2.getEventDate().compareTo(d1.getEventDate());
	    };
	    Stream.of(gt1,gt2,gt3,gt4,gt5,gt6,gt7,gt8,gt9,gt10).sorted(duractuionCompire.thenComparing(dateCompire1)).forEach(y->System.out.println(y));;
	    
	    System.out.println("&&&&&&&&&&");
	    System.out.println("sorting duraction on dsec..");
	    Comparator<GameDTO> duractuionCompire1=(d1,d2)->{
	    	return d2.getDuration().compareTo(d1.getDuration());
	    };
	//List<Double> obj=
			Stream.of(gt1,gt2,gt3,gt4,gt5,gt6,gt7,gt8,gt9,gt10).sorted(duractuionCompire1).map(ref->ref.getDuration()).collect(Collectors.toList()).forEach(ref->System.out.println(ref));;
			
			System.out.println("#############");
			Comparator<GameDTO> namesCompire2=(n1,n2)->{
				return n1.getName().compareTo(n2.getName());
			};
	Stream.of(gt1,gt2,gt3,gt4,gt5,gt6,gt7,gt8,gt9,gt10).sorted(namesCompire2).map(ref->ref.getName()).forEach(ref->System.out.println(ref));
	
	System.out.println("#%#%#%#%#%#%#%######");
	System.out.println("collect only winnerup...");
	Comparator<GameDTO> winnerCompire=(w1,w2)->{
		return w2.getWinner().compareTo(w1.getWinner());
	};
Stream.of(gt1,gt2,gt3,gt4,gt5,gt6,gt7,gt8,gt9,gt10).sorted(winnerCompire).map(ref->ref.getWinner()).forEach(ref->System.out.println(ref));

	 System.out.println("%%%%");   
	 List<Integer> refi=new LinkedList<Integer>();
	    Stream.of(gt1,gt2,gt3,gt4,gt5,gt6,gt7,gt8,gt9,gt10).sorted().filter(y->y.getName().equals("NetBall")).forEach(r->refi.add(r.getId()));
	    refi.forEach(y->System.out.println(y));
	    System.out.println("nyyyyyyyyyyyyyyyyy");
	    Stream.of(gt1,gt2,gt3,gt4,gt5,gt6,gt7,gt8,gt9,gt10).sorted().filter(y->y.getName().equals("NetBall")).map(id->id.getPoints()).forEach(r->System.out.println(r));
	    System.out.println("collect only runnerup...");
	    Comparator<GameDTO> runnerCompire=(r1,r2)->{
			return r1.getRunnerup().compareTo(r2.getRunnerup());
		};
		Stream.of(gt1,gt2,gt3,gt4,gt5,gt6,gt7,gt8,gt9,gt10).sorted(runnerCompire).map(map->map.getRunnerup()).forEach(y->System.out.println(y));
			System.out.println("$$$$$$$$");
			System.out.println("find game by particpats...");
			Stream.of(gt1,gt2,gt3,gt4,gt5,gt6,gt7,gt8,gt9,gt10).sorted().filter(y->y.getParticipants().equals(7.0)).map(y->y.getName()).forEach(y->System.out.println(y));
			System.out.println("find name by event.date ...");
			Stream.of(gt1,gt2,gt3,gt4,gt5,gt6,gt7,gt8,gt9,gt10).sorted().filter(y->y.getEventDate().equals(LocalDate.of(2022,01 ,20))).map(y->y.getName()).forEach(y->System.out.println(y));
			
		}
	}


