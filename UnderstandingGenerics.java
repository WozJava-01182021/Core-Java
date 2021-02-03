/*
 * The purpose of using generics is to enforce type safety
 */
package robertd.core_java.lesson08;

import java.util.ArrayList;
import java.util.List;

import robertd.core_java.common.animal.domestic.Dog;

public class UnderstandingGenerics {
	
	public void inClassWork() {
		System.out.println(this.getClass() + ".inClassWork():\n");
		System.out.println();

		genericTyping();

		System.out.println("===================================================================\n\n");
	}
	
	private void genericTyping() {
		List<String> strList = new ArrayList<>();
		
		strList.add("A string literal");
		strList.add(new Integer(42).toString());
		strList.add(new Dog("Bubbles").toString());
		strList.add(this.getClass().toString());
				
		for(String s : strList) {
			System.out.println(s);
		}
		
		// Can't create a collection using primitives
//		List<int> intList = new ArrayList<>();
		List<Integer> intList = new ArrayList<>();
		
		intList.add(46);
		intList.add(365);
		// Can't add a list of Strings to a list of Integers
//      intList.addAll(strList);
		
		System.out.println(intList.get(0).getClass());
		// 

	}
}
