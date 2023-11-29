package orderTests.orderClasses;

import org.junit.jupiter.api.*;

public class OrderClasses3Test {
    private static final StringBuilder output = new StringBuilder();

    @Test
    public void firstTest() {
        output.append("3 ");
    }

    @Test
    public void secondTest() {
        output.append("3_1 ");
    }

    @AfterAll
    public static void printOutput() {
        System.out.println(output);
    }
}
