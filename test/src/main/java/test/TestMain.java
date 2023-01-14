package test;

import java.io.File;

public class TestMain {

	public static void main(String[] args) {
		// This is another comment
		File dir = new File(System.getProperty("user.dir"));
		for(File f:dir.listFiles()) {
			System.out.println(f.getName());
		}
		

	}

}
