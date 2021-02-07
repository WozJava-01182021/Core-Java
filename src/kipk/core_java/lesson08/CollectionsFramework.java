/*
 * 
 */

package kipk.core_java.lesson08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import kipk.core_java.common.animal.Animal;
import kipk.core_java.common.animal.RandomAnimalBuilder;

public class CollectionsFramework {
	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		
		collectionsOverview();
		usingComparable();
	}

	private void collectionsOverview() {
		System.out.println("1. Collections Overview");
		
		System.out.println("1a. Lists are ordered by index");
		//ArrayList: fast iteration and fast random access, slow insertion and removal
		List<String> aList = new ArrayList<>();
		aList.add("France");
		aList.add("Thailand");
		aList.add(0, "Nigeria");
		System.out.println(aList);
		Collections.sort(aList);
		System.out.println(aList);
		System.out.println();
		//Vector is synchronized (for multi-threading) but slower than ArrayList
		
		System.out.println("LinkedList good for adding elements at the ends."); 
		System.out.println("Slower random access, faster insertion and removal at the ends"); 
		
		List<String> bList = new LinkedList<>();
		bList.add("France");
		bList.add("Thailand");
		bList.add(0, "Nigeria");
		System.out.println(bList);
		Collections.sort(bList);
		System.out.println(bList);
		System.out.println();
		System.out.println("============================================");
		
		System.out.println("\n2. Sets are collections of unique things, unordered");
		System.out.println("HashSet fast access, provides no ordering");
		Set<String> aSet = new HashSet<>();
		aSet.add("Jamaica");
		aSet.add("Canada");
		aSet.add("Japan");
		System.out.println(aSet);
		
		System.out.println("LinkedHashSet not as fast access, iterates on insertion order");
		Set<String> bSet = new LinkedHashSet<>();
		bSet.add("Jamaica");
		bSet.add("Canada");
		bSet.add("Japan");
		System.out.println(bSet);
		
		System.out.println("\nTreeSet No duplicates, ordered on insertion using Comparable");
		Set<String> cSet = new TreeSet<>();
		cSet.add("Jamaica");
		cSet.add("Canada");
		cSet.add("Japan");
		System.out.println(cSet);
		System.out.println();
		System.out.println("============================================");
		
		System.out.println("\n3. Maps are collections of key- value pairs, keys are unique");
		System.out.println("HashMaps are fast for updates");
		Map<Integer, String> aMap = new HashMap<>();
		
		aMap.put(2, "Brazil");
		aMap.put(7, "Singapore");
		aMap.put(1, "Singapore");
		System.out.println(aMap);
		System.out.println();
		
		System.out.println("LinkedHashMaps faster iteration by key insertion or last accessed");
		Map<Integer, String> bMap = new LinkedHashMap<>();
		bMap.put(2, "Brazil");
		bMap.put(7, "Singapore");
		bMap.put(1, "Singapore");
		System.out.println(bMap);
		
		System.out.println("TreeMaps faster iteration by key insertion or last accessed");
		Map<Integer, String> cMap = new TreeMap<>();
		cMap.put(2, "Brazil");
		cMap.put(7, "Singapore");
		cMap.put(1, "Singapore");
		System.out.println(cMap);
		System.out.println();
		System.out.println("============================================");
		
		System.out.println("PriorityQueue: a to-do list ordered by user defined priority");
		Queue<String> aQue = new PriorityQueue<>();
		aQue.add("India");
		aQue.add("Saudi Arabia");
		aQue.offer("Poland");
		aQue.add("Chile");
		System.out.println(aQue);
		System.out.println();
		System.out.println("============================================");
	}
	
	private void usingComparable() {
		System.out.println("2. Using Comparable to sort");
		List<Animal> animals = (List<Animal>) new RandomAnimalBuilder().build(5);
		for (Animal a : animals) {
			System.out.println(a);
			
		}
		System.out.println();
		
		Collections.sort(animals);
		for (Animal a : animals) {
			System.out.println(a);
		
		}
		System.out.println();


	}
}
