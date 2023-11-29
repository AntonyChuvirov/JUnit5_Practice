package instance;

import org.junit.jupiter.api.TestInstance;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    public BaseTest() {
        System.out.println("Start Instance");
    }
}
