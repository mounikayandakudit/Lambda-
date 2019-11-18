package lambda;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class TestToSortFiles {

	
	public static void sortDirectoryContent(File file) {
        File[] files = file.listFiles();
        Arrays.sort(files, Comparator.comparing(File::isDirectory));
        Arrays.toString(files);
    }

    public static void main(String[] args) {
//        allDirectories(new File("."));
        System.out.println("========================");
//        allFiles(new File("."));
        System.out.println("========================");
        sortDirectoryContent(new File("."));
}
}
