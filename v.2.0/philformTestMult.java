import static org.junit.Assert.*;

import org.junit.Test;


public class philformTestMult {

	@Test
	public void testMulttest() {
		
			philform tester = new philform();
			assertEquals("Result", 10, tester.multtest(2, 5));
	}

}
