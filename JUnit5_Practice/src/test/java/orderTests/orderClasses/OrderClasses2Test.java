package orderTests.orderClasses;

import org.junit.jupiter.api.*;

public class OrderClasses2Test {
    private static final StringBuilder output = new StringBuilder();

    @Test
    public void firstTest() {
        output.append("2 ");
    }

    @Test
    public void secondTest() {
        output.append("2_1 ");
    }

    @AfterAll
    public static void printOutput() {
        System.out.println(output);
    }
}
