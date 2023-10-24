package suites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SelectClasses({
        Suite1Test.class,
        Suite2Test.class,
})
@SuiteDisplayName("Super mega suite")
public class MyTestSuite {

}
