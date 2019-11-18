package lambda;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Test;

public class TestAppendFirstLetters {

	
	@Test
	public void testToAppendFirstChractersInList() {
	  
        List<String> list = new ArrayList<String>(); 
        list.add("Mouni"); 
       list.add("Jay"); 
       list.add("swap");
       
       list.add("Sandeep");
       final StringBuilder chars = new StringBuilder();

      Consumer<List<String>> dispList= lists-> list.forEach(l -> chars.append(l.charAt(0)));
      dispList.accept(list);
      
       System.out.println(chars);
       assertEquals(4,chars.length());
       assertThat(chars.toString(), is("MJsS"));
       
    
       //System.out.println( dispList.accept(list));
//	         
//	  
}
}