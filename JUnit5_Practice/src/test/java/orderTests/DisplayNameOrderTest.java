package orderTests;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class DisplayNameOrderTest {
    private static final StringBuilder output = new StringBuilder();

    @Test
    @DisplayName("a_name")
    public void firstTest() {
        output.append("a");
    }

    @Test
    @DisplayName("b_name")
    public void secondTest() {
        output.append("b");
    }

    @Test
    @DisplayName("c_name")
    public void thirdTest() {
        output.append("c");
    }

    @AfterAll
    public static void assertOutput() {
        assertEquals("abc", output.toString());
    }
}
