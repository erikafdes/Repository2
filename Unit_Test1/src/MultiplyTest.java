import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplyTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	
	@Test
	
	void multitest()
	{
		Multiply objMult = new Multiply();
		
		int expected=45;
		int actual=objMult.multi(7,5,7);
		
		assertEquals(expected, actual);
	}
	
	
	@Test
	void divtest()
	{
		Multiply objDiv = new Multiply();
		
		int expected=28;
		int actual=objDiv.div(56,2);
		
		assertEquals(expected, actual);
	}
	
}
