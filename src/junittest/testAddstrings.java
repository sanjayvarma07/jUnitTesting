package junittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddstrings {
	package JUnitTestingPackage;

	import static org.junit.Assert.*;

	import org.junit.Test;

	public class testadditionofstr {

		@Test
		public void test() {
			JUnitFunctions JUnitStr = new JUnitFunctions();
			String res = JUnitStr.additionofStr("HumanPose", "Project");
			assertEquals("HumanPoseProject",res);
		}

	}

	}

}
