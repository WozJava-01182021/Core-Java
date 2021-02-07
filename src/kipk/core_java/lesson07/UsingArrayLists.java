/*
 * ArrayList class is part of the collection API. They are:
 * 1. Dynamic and can grow and shrink as needed
 * 2. implement the List interface
 * 3. uses a zero based index to maintain order
 * 4. not sized when they are first created
 * 5, can have duplicate values
 * 
 * Some ArrayList methods:
 * 		add(element) - Adds an element to the END of the ArrayList
 *		add(index, element) - Add an element at the index location shifting other elements
 *		clear() - removes all the elements of an ArrayList
 *		contains(element) - returns whether or not an ArrayList contains that element
 *		get(index) - Returns the element at the specified index in the list. Does not remove it.
 *		indexOf(Object) - returns the index location of the object or -1 if not found
 *		iterator() - returns an iterator
 *		remove(index) - removes the element at that index shifts later elements down
 *		remove(object) - removes the first occurrence of the object if it exists
 *		set(index, object) - replaces the existing element t the specified index
 *		size() - returns the number of elements in the ArrayList
 */

package kipk.core_java.lesson07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import kipk.core_java.common.animal.RandomAnimalBuilder;
import kipk.core_java.common.animal.domestic.Dog;

public class UsingArrayLists {
	List<String> cityList = new ArrayList<>();
	List<Dog> dogList;

	public void inClassWork() {
		System.out.println(this.getClass() + ".inClassWork()");
		creatingArrayList();
		compareArraysToArrayList();
		usingAnIterator();
		
		convertingListToArray();
	}
	
	private void creatingArrayList() {
		// Java 5 & Java 6
		List<String> list = new ArrayList<String>();
		
		//Java 7
		List<String> list3 = new ArrayList<>();
		
		//Constructor to create a list using another list
		List<String> list4 = new ArrayList<>(list3);
		
	}
	
	private void compareArraysToArrayList () {
		
		String[] cityArray = new String[4];//must size otherwise compile error
		
		
		cityArray[0] = "Oslo";
		cityArray[1] = "St.Louis";
		cityArray[2] = "Tempe";
		cityArray[3] = "Chicago";
		
		cityList.add("Oslo");
		cityList.add("St.Louis");
		cityList.add("Tempe");
		cityList.add("Chicago");
		
		System.out.println("Size of Array is: " + cityArray.length);
		System.out.println("Size of ArrayList is: " + cityList.size());
		
		//say we want add an element between oslo and St.Louis
		String[] a1 = new String[5];
		a1[0] = cityArray[0];
		a1[1] = "London";
		a1[2] = cityArray[1];
		a1[3] = cityArray[2];
		
		cityList.add(1, "London");
		
		System.out.println("Array: " + cityArray.length);
		System.out.println("ArrayList: " + cityList);
		
		for(String city : cityArray) {
			System.out.println(city + " ");
		}
		System.out.println();
		System.out.println(cityList);
		
	}
	
	private void convertingListToArray() {
		dogList = (List<Dog>)new RandomAnimalBuilder(Dog.class).build(5);
		
		Dog[] dogArray = new Dog[dogList.size()];
		dogArray = dogList.toArray(dogArray);
		
		System.out.println("dogArray: " + Arrays.toString(dogArray));
	}
	
	private void usingAnIterator() {
		
		//Before Java 5 we had to use an iterator
		Iterator it = dogList.iterator();
		
		while (it.hasNext()) {
			Dog d = (Dog)it.next();
			System.out.println(d);
		}
	}
	private void convertingArrayToList() {
		String[] sa = {"hobbit", "wizard", "elf", "dwarf"};
		List<String> listFromArray = Arrays.asList(sa);
		System.out.println(listFromArray);
	}

}
