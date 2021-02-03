package robertd.core_java.lesson06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TryWithResources {

	private Path parentDir = Paths.get("src", "robertd", "core_java", "common", "animal");

	public void inClassWork() {
		System.out.println(this.getClass().getSimpleName() + ".inClassWork()");
		System.out.println();

		java6Way();
		java7Way();

		System.out.println("===================================================================\n\n");

	}

	private void java6Way() {
		System.out.println("1. Print out Gazelle.java using the Java 6 and earlier way");
		System.out.println();
		Path targetFile = Paths.get(parentDir.toString(), "mammals", "Gazelle.java");
		String data = null;
		BufferedReader br = null;
		try {
			br = Files.newBufferedReader(targetFile);
			while ((data = br.readLine()) != null) {
				System.out.println(data);
				System.out.println();
			}
		} catch (IOException ioe) {
			System.out.println(ioe);
			System.out.println();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		System.out.println("--------------------------------------------------------------------\n\n");
	}

	private void java7Way() {
		System.out.println("2. Print out another class using Try-With-Resources");
		System.out.println();
		Path targetFile = Paths.get(parentDir.toString(), "mammals", "BlueWhale.java");
		String data = null;
		try (BufferedReader br = Files.newBufferedReader(targetFile)) {
			while ((data = br.readLine()) != null) {
				System.out.println(data);
				System.out.println();
			}
		} catch (IOException ioe) {
			System.out.println(ioe);
			System.out.println();
		}
	}
		
}
