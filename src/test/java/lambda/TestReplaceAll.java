package lambda;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.UnaryOperator;

import org.junit.Test;

public class TestReplaceAll {

	@Test
	public void toTestReplaceAll() {

		ArrayList<String> list = new ArrayList<>();
		list.add("mouni");
		list.add("kaarthi");
		list.add("jay");
		list.add("maneesha");

		//list.replaceAll(new MyOperator());
		UnaryOperator<String> u = (s) -> s.toUpperCase();
		list.replaceAll(u);
		Iterator<String> it = list.iterator();
		assertEquals("MOUNI", it.next());
		assertEquals("KAARTHI", it.next());
		assertEquals("JAY", it.next());
		assertEquals("MANEESHA", it.next());
		

	}

}
