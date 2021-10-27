package com.ravikethireddy;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JavaVersion8Practice {

	public static void main(String[] args) {
		
		// FOREACH BEGIN
		//Normal way to loop a Map.
		Map<String, Integer> itemsM = new HashMap<>();
		itemsM.put("A", 10);
		itemsM.put("B", 20);
		itemsM.put("C", 30);
		itemsM.put("D", 40);
		itemsM.put("E", 50);
		itemsM.put("F", 60);

		for (Map.Entry<String, Integer> entry : itemsM.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
		
		//In Java 8, you can loop a Map with forEach + lambda expression.
		Map<String, Integer> items8M = new HashMap<>();
		items8M.put("A", 10);
		items8M.put("B", 20);
		items8M.put("C", 30);
		items8M.put("D", 40);
		items8M.put("E", 50);
		items8M.put("F", 60);
		
		items8M.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		
		items8M.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});

		
		//Normal for-loop to loop a List.

		List<String> itemsL = new ArrayList<>();
		itemsL.add("A");
		itemsL.add("B");
		itemsL.add("C");
		itemsL.add("D");
		itemsL.add("E");

		for(String item : itemsL){
			System.out.println(item);
		}
	
	    //In Java 8, you can loop a List with forEach + lambda expression or method reference.

		List<String> items8L = new ArrayList<>();
		items8L.add("A");
		items8L.add("B");
		items8L.add("C");
		items8L.add("D");
		items8L.add("E");
		items8L.add("B");

		//lambda
		//Output : A,B,C,D,E
		items8L.forEach(item->System.out.println(item));
			
		//Output : C
		items8L.forEach(item->{
			if("C".equals(item)){
				System.out.println(item);
			}
		});
			
		//method reference
		//Output : A,B,C,D,E
		items8L.forEach(System.out::println);
		
		//Stream and filter
		//Output : B
		items8L.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::println);
		
		// FOREACH END	
		
		//
		
		FunctionalInterfaceClass functionalClass = new FunctionalInterfaceClass();
		functionalClass.log("Welcome!!! Functional Interface Default&Static methods testing");
		
	}

}
