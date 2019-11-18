package lambda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestArithmeticExpression {

	@Test
	public void testAritmeticOperations() {
	ArtimeticOperation a1=(a,b)->(a+b);
	assertEquals(20,a1.calculation(10, 10));
	ArtimeticOperation a2 =(a,b)->(a-b);
	assertEquals(30,a2.calculation(50, 20));
	ArtimeticOperation a3 =(a,b)->(a*b);
	assertEquals(100, a3.calculation(25, 4));
	ArtimeticOperation a4 =(a,b)->(a/b);
	assertEquals(4,a4.calculation(100, 25));
}
}