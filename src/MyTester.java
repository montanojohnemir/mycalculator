import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	@Test
	public void testNfactorial() {
		MyCalculator mc = new MyCalculator();
		
		
		int actual = mc.nfactorial(0);
		assertEquals("0!",1,actual,0.0);
	}


	@Test
	public void testBinarySearch() {
		MyCalculator mc = new MyCalculator();
		int[] a = {11,22,33,44,55};
		int actual = mc.binarySearch(a,55);
		assertEquals("Search 33",4,actual,0.0);
	}

}
