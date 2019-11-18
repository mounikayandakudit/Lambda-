package lambda;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class TestMapEntrySet {
	
	
	@Test
	public void testToConvertMapEntriesToString() {
		Map<String,String> map = new HashMap<String,String>();
		map.put("One","John");
		map.put("Two", "Krish");
		map.put("Three", "Jay");
		
		//String separator = " ";
	    String keyValueSeparator ="=";

	    StringBuffer buffer = new StringBuffer();

	    Iterator<Entry<String, String>> entryIterator = map.entrySet().iterator();

	    while (entryIterator.hasNext()) {

	        Entry<String, String> entry = entryIterator.next();

	        buffer.append(entry.getKey());
	        buffer.append(keyValueSeparator);
	        buffer.append(entry.getValue());

	    
    
    System.out.println(buffer);
    assertThat(buffer.toString(), is("One=JohnTwo=KrishThree=Jay"));
}

	}
}