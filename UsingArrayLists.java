/*
 * ArrayList class is part of the collection API. They are:
 * 1. dynamic and can grow and shrink as needed
 * 2. implement the List interface
 * 3. uses a zero based index to maintain order
 * 4. not sized when first created
 * 5. can have duplicate values
 *
 * Some ArrayList methods:
 *     add(element) - Adds an element to the END of the ArrayList
 *     add(index, element) - Add an element at the index location shifting other elements
 *     clear() - removes all the elements of an ArrayList
 *     contains(element) - returns whether or not an ArrayList contains that element
 *     get(index) - Returns the element at the specified index in the list. Does not remove it.
 *     indexOf(Object) - returns the index location of the object or -1 if not found
 *     iterator() - returns an iterator
 *     remove(index) - removes the element at that index shifts later elements down
 *     remove(object) - removes the first occurrence of the object if it exists
 *     set(index, object) - replaces the existing element t the specified index
 *     size() - returns the number of elements in the ArrayList
 */
package robertd.core_java.Lesson07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import robertd.core_java.common.animal.RandomAnimalBuilder;
import robertd.core_java.common.animal.domestic.Dog;

public class UsingArrayLists {

	List<String> cityList = new ArrayList<>();
	List<Dog> dogList;

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		System.out.println();

		creatingArrayLists();
		compareArraysToArrayList();
		convertingListToArray();
		usingAnIterator();
		convertingArrayToList();

		System.out.println("===================================================================\n\n");

	}

	private void creatingArrayLists() {
		// Java 5 & Java 6
		List<String> list2 = new ArrayList<String>();

		// Java 7
		List<String> list3 = new ArrayList<>();

		// Constructor to create a list using another list
		List<String> list4 = new ArrayList<>(list3);

	}

	private void compareArraysToArrayList() {
		String[] cityArray = new String[3];

		cityArray[0] = "Oslo";
		cityArray[1] = "Paris";
		cityArray[2] = "Rome";

		cityList.add("Oslo");
		cityList.add("Paris");
		cityList.add("Rome");

		System.out.println("Size of array is: " + cityArray.length);
		System.out.println();
		System.out.println("Size of ArrayList is: " + cityList.size());
		System.out.println();

		// Say we want add an element between Oslo and Paris
		String[] a1 = new String[4];
		a1[0] = cityArray[0];
		a1[1] = "London";
		a1[2] = cityArray[1];
		a1[3] = cityArray[2];
		cityArray = a1;

		cityList.add(1, "London");

		System.out.println("Array: " + cityArray.length);
		System.out.println();
		System.out.println("ArrayList: " + cityList.size());
		System.out.println();

		for (String city : cityArray) {
			System.out.print(city + " ");
			System.out.println();
		}
		System.out.println();
		System.out.println(cityList);
		System.out.println();
	}
	
	private void convertingListToArray() {
		dogList = (List<Dog>)new RandomAnimalBuilder(Dog.class).build(5);
		
		Dog[] dogArray = new Dog[dogList.size()];
		dogArray = dogList.toArray(dogArray);
		
		System.out.println("dogArray: " + Arrays.toString(dogArray));
		System.out.println();
			
	}

	private void usingAnIterator() {
			
		// Before Java 5 we had to us an iterator
		Iterator<Dog> it = dogList.iterator();
		
		while (it.hasNext()) {
			Dog d = it.next();
			System.out.println(d);
			System.out.println();
		}
	}
	
	private void convertingArrayToList() {
		String[] sa = {"hobbit", "wizard", "elf", "dwarf"};
		List<String> listFromArray = Arrays.asList(sa);
		System.out.println(listFromArray);
		System.out.println();
	}

}
