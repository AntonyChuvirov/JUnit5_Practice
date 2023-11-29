package orderTests.orderClasses;

import org.junit.jupiter.api.*;

public class OrderClasses4Test {
    private static final StringBuilder output = new StringBuilder();

    @Test
    public void firstTest() {
        output.append("4 ");
    }

    @Test
    public void secondTest() {
        output.append("4_1 ");
    }

    @AfterAll
    public static void printOutput() {
        System.out.println(output);
    }
}
