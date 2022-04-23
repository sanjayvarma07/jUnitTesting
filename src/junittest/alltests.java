Package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class alltests {

	package JUnitTestingPackage;

	import org.junit.runner.RunWith;
	import org.junit.runners.Suite;
	import org.junit.runners.Suite.SuiteClasses;

	@RunWith(Suite.class)
	@SuiteClasses({ testAdditionofnum.class, testadditionofstr.class })
	public class AllTests {

	}

	}

}
