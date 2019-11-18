package lambda;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestRemoveWords {

	@Test
	public void testToRemoveOddLengthWords() {

		List<String> students = new ArrayList<String>();

		students.add("Ramu");
		students.add("Mohan");
		students.add("Sohan");
		students.add("Rabi");
		students.add("Shab");

		students.removeIf(str -> (str.length() % 2 != 0));

		assertEquals(3, students.size());
	}

}
