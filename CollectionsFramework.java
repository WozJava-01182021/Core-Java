/*
 * The collections framework was added in Java 1.2
 * Interfaces:
 *		Collection
 *		List extends Collection
 *		Set extends Collection
 *		Queue extends Collection
 *		Deque extends Queue
 *		Map
 *		Comparable
 *		Comparator
 *		Iterator
 * Utility classes:
 *		Arrays
 *		Collections
 * Ordered means you can iterate through a collection in a predictable way
 */
package robertd.core_java.lesson08;

import java.util.*;

import robertd.core_java.common.animal.Animal;
import robertd.core_java.common.animal.RandomAnimalBuilder;

public class CollectionsFramework {
	
	public void inClassWork() {
		System.out.println(this.getClass() + ".inClassWork():\n");
		System.out.println();
		
		collectionsOverview();
		usingComparable();

		System.out.println("===================================================================\n\n");
	}
	
	private void collectionsOverview() {
		System.out.println("1. Collections overview: ");
		System.out.println();
		
		System.out.println("1a. Lists are ordered by index: ");
		System.out.println();
		
		System.out.println("ArrayList: fast iteration and fast random access, slow insertion and removal: ");
		System.out.println();
		List<String> aList = new ArrayList<>();
		aList.add("France");
		aList.add("Thailand");
		aList.add(0, "Nigeria");
		System.out.println(aList);
		System.out.println();
		Collections.sort(aList);
		System.out.println(aList);
		System.out.println();
		// Vector is synchronized (for multithreading) but slower than ArrayList
		
		System.out.println("LinkedList: good for adding elements at the ends."); 
		System.out.println();
		System.out.println("Slower random access, faster insertion and removal at the ends.");
		System.out.println();
		List<String> bList = new LinkedList<>();
		bList.add("France");
		bList.add("Thailand");
		bList.add(0, "Nigeria");
		System.out.println(bList);
		System.out.println();
		Collections.sort(bList);
		System.out.println(bList);
		System.out.println();
		
		System.out.println("\n2. Sets are collections of unique things, unordered");
		System.out.println();
		System.out.println("HashSet fast access, provides no ordering");
		System.out.println();
		Set<String> aSet = new HashSet<>();
		aSet.add("Jamaica");
		aSet.add("Canada");
		aSet.add("Japan");
		System.out.println(aSet);
		System.out.println();
		
		System.out.println("\nLinkedHashSet not as fast, iterates on insertion order");
		System.out.println();
		Set<String> bSet = new LinkedHashSet<>();
		bSet.add("Canada");
		bSet.add("Jamaica");
		bSet.add("Japan");
		System.out.println(bSet);
		System.out.println();
		
		System.out.println("\nTreeSet No duplicates, ordered on insertion using Comparable");
		System.out.println();
		Set<String> cSet = new TreeSet<>();
		cSet.add("Canada");
		cSet.add("Jamaica");
		cSet.add("Japan");
		System.out.println(cSet);
		System.out.println();
		
		System.out.println("\n3. Maps are collections of key-value pairs, keys are unique");
		System.out.println();
		System.out.println("HashMaps are fast for updates, allows one null key, many null values");
		Map<Integer, String> aMap = new HashMap<>();
		aMap.put(3, "Brazil");
		aMap.put(1, "Singapore");
		aMap.put(7,  "Singapore");
		System.out.println(aMap);
		System.out.println();
		
		System.out.println("\nLinkedHashMaps faster iteration by key insertion or last accessed");
		System.out.println();
		Map<Integer, String> bMap = new LinkedHashMap<>();
		bMap.put(3, "Brazil");
		bMap.put(1, "Singapore");
		bMap.put(7,  "Singapore");
		System.out.println(bMap);
		System.out.println();
		
		System.out.println("\nTreeMaps keys are sorted on insertion ");
		System.out.println();
		Map<Integer, String> cMap = new TreeMap<>();
		cMap.put(3, "Brazil");
		cMap.put(1, "Singapore");
		cMap.put(7,  "Singapore");
		System.out.println(cMap);
		System.out.println();
		
		System.out.println("PriorityQueue: a to-do list ordered by user defined priorty");
		System.out.println();
		Queue<String> aQue = new PriorityQueue<>();
		aQue.offer("India");
		aQue.add("Saudi Arabia");
		aQue.offer("Poland");
		aQue.add("Chile");
		System.out.println(aQue);
		System.out.println();	
		
	}
	
	private void usingComparable() {
		System.out.println("2. Using Comparable to sort ");
		System.out.println();
		List<Animal> animals = (List<Animal>)new RandomAnimalBuilder().build(5);
		for (Animal a  : animals) {
			System.out.println(a);
			System.out.println();
		}
		
		Collections.sort(animals);
		for (Animal a  : animals) {
			System.out.println(a);
			System.out.println();
		}
	}

}
