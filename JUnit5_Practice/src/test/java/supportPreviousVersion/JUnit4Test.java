package supportPreviousVersion;

import org.junit.Ignore;
import org.junit.Test;

//JUnit 4 annotation @Ignore will work only with junit-vintage dependency
public class JUnit4Test {
    @Test
    @Ignore
    public void junit4Test() {
        System.out.println("junit4 test");
    }
}
