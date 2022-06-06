package systems.enji.junit.suite;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
//also runs tests from sub-packages:
@SelectPackages("systems.enji.junit.suite")
public class SuiteWithPackages {
}