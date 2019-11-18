package lambda;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class TestToGetAllSubDirectories {

	@Test
	public void test() throws IOException {
		File dir = new File("C:\\Training demos");
		
		File[] subDirectory = dir.listFiles((file) -> file.isDirectory());
		
//		for (File file : subDirectory) {
		System.out.println(file.getName());
//		}
//		
		//System.out.println(dir.getCanonicalFile());
	}

}