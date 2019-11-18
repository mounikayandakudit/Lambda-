package lambda;

import java.io.File;
import java.io.FilenameFilter;

public class TestToPrintAllTheFilesInDirectory {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\myandaku\\downloads");
		File[] listOfMatchingFiles = file.listFiles((dir, name) -> name.endsWith(".txt"));
		

		for (File files : listOfMatchingFiles) {
			// print their path
			System.out.println(files.getAbsolutePath());
		}

	}
}
