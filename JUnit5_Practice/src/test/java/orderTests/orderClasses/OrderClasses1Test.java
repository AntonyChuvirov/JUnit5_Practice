package orderTests.orderClasses;

import org.junit.jupiter.api.*;

/*
    If you want to check order classes please uncomment next line
    in junit-platform-properties file in test/resorces package

    junit.jupiter.testclass.order.default=org.junit.jupiter.api.ClassOrderer$OrderAnnotation
 */
public class OrderClasses1Test {
    private static final StringBuilder output = new StringBuilder();

    @Test
    public void firstTest() {
        output.append("1 ");
    }

    @Test
    public void secondTest() {
        output.append("1_1 ");
    }

    @AfterAll
    public static void printOutput() {
        System.out.println(output);
    }
}
