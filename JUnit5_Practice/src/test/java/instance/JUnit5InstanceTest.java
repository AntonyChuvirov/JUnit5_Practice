package instance;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JUnit5InstanceTest extends BaseTest {
    public JUnit5InstanceTest() {
        System.out.println("Start Instance");
    }

    @Test @Tag("inst") public void testOne(){}
    @Test @Tag("inst") public void testTwo(){}
    @Test @Tag("inst") public void testThree(){}
}
