package retry;

import org.junit.jupiter.api.Tag;
import org.junitpioneer.jupiter.RetryingTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

//JUnit 5 doesn't have any retry mechanism, but junit-pioneer dependency has
public class HowToRetryTest {
    private static int num = 0;

    @Tag("retry")
    @RetryingTest(5)
    public void retryingTest() {
        assertEquals(2, num++);
    }
}
