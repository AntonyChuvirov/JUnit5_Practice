package retry;

import org.junitpioneer.jupiter.RetryingTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HowToRetryTest {
    private static int num = 0;

    @RetryingTest(5)
    public void retryingTest() {
        assertEquals(2, num++);
    }
}
