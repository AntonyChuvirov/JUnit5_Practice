package suites;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("suite")
public class Suite1Test {
    @Test
    public void suite1Test() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Test 1 from class 1 started");
    }

    @Test
    public void suite2Test() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Test 2 from class 1 started");
    }
}
