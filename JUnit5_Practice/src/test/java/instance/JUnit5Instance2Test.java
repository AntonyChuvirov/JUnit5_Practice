package instance;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JUnit5Instance2Test extends BaseTest {
    public JUnit5Instance2Test() {
        System.out.println("Start Instance");
    }

    @Test @Tag("inst") public void testOne(){}
    @Test @Tag("inst") public void testTwo(){}
    @Test @Tag("inst") public void testThree(){}
}
