package orderTests.orderClasses;

import org.junit.jupiter.api.*;

public class OrderClasses5Test {
    private static final StringBuilder output = new StringBuilder();

    @Test
    public void firstTest() {
        output.append("5 ");
    }

    @Test
    public void secondTest() {
        output.append("5_1 ");
    }

    @AfterAll
    public static void printOutput() {
        System.out.println(output);
    }
}
