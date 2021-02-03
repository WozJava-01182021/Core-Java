/*
 * 
 */
package robertd.core_java.lesson06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import robertd.core_java.common.animal.RandomAnimalBuilder;
import robertd.core_java.common.animal.Sex;
import robertd.core_java.common.animal.mammals.Lion;

public class MultipleHandlers {

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		System.out.println();

		throwingExceptions();
//		exceptionMatching();
		integrateFileListsIntoRAB();

		Lion leo = new Lion(6, 350, Sex.MALE);
		leo.hunt();
		leo.sleep();

		System.out.println("===================================================================\n\n");
	}

	public void printAverage(int total, int number) {
		// Add try catch here
		try {
			int average = computeAverage(total, number);
			System.out.println();
			System.out.println("Average = " + total + " / " + number + " = " + average);
		} catch (IllegalArgumentException e) {
			System.err.println("Exception handled in printAverage:" + e);
			;
		} catch (ArithmeticException ae) {
			System.out.println(ae);
			System.out.println();
			System.out.println();
			System.out.println("Exit printAverage().");
			System.out.println();
		}
	}

	// Notice that the exception is propagated from the computeAverage
	// method to the printAverage method where it is handled by a catch block
	public int computeAverage(int sum, int number) {
		if (number == 0) {
			// programmatically throwing an exception
			throw new IllegalArgumentException(" computeAverage number parameter can't be 0");
		}
		System.out.println("Computing average.");
		// Exception may be triggered here
		return sum / number;
	}

	private void throwingExceptions() {
		System.out.println("1. Programmatic throwing of an exception: ");
		System.out.println();

		System.out.println("1. Normal execution");
		System.out.println();
		printAverage(100, 20);
		System.out.println("----------------------");
		System.out.println();
		System.out.println("2. Faulty execution.");
		System.out.println();
		printAverage(100, 0);
		System.out.println();

	}

	private void exceptionMatching() {
		System.out.println("2. Exception matching with multiple catch blocks");
		System.out.println();

		RandomAccessFile raf = null;

		try {
			raf = new RandomAccessFile("myfile.txt", "r");
			byte[] buffer = new byte[100];
			raf.readFully(buffer, 0, 100);
			computeAverage(100, 0);
			System.out.println();
		} catch (NullPointerException npe) {
			System.out.println(npe);
			System.out.println();
		} catch (ArithmeticException ae) {
			System.out.println(ae);
			System.out.println();
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe);
			;
			System.out.println();
		} catch (IOException ioe) {
			System.out.println(ioe);
			;
			System.out.println();
		} finally {
			try {
				raf.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println();
			}

		}
		System.out.println();
	}

	private void integrateFileListsIntoRAB() {
		System.out.println("3. Testing file names in RandomAnimalBuilder");
		System.out.println();
		RandomAnimalBuilder builder = new RandomAnimalBuilder();
		try {
			builder.testGetClassList("birds");
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		}
	}
}