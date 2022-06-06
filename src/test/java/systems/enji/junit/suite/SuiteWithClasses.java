package systems.enji.junit.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ ATest.class, BTest.class })
public class SuiteWithClasses {
}