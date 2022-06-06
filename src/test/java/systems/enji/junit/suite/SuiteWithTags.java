package systems.enji.junit.suite;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("systems.enji.junit.suite")
// the following annotation without @SelectPackages would not run any tests:
@IncludeTags({"custom-tag-1", "custom-tag-2"})
public class SuiteWithTags {
}