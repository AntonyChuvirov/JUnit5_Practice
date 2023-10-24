package orderTests;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodNameOrderTest {
    private static final StringBuilder output = new StringBuilder();

    @Test
    public void a_firstTest() {
        output.append("a");
    }

    @Test
    public void b_secondTest() {
        output.append("b");
    }

    @Test
    public void c_thirdTest() {
        output.append("c");
    }

    @AfterAll
    public static void assertOutput() {
        assertEquals("abc", output.toString());
    }
}
