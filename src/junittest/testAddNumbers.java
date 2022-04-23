package Juinttest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {
	package JUnitTestingPackage;

	import static org.junit.Assert.*;

	import org.junit.Test;

	public class testAdditionofnum {

		@Test
		public void test() {
			JUnitFunctions JUnit = new JUnitFunctions();
			int res = JUnit.additionofnum(150, 250);
			assertEquals (400, res);
	
	}

}
