package listeners;

import listeners.extensions.MyExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

public class CheckExtensionTest {
    @RegisterExtension
    static MyExtension myExtension = new MyExtension();

    @Test
    public void extensionTest() {
        System.out.println("Running Test: extensionTest");
    }
}
