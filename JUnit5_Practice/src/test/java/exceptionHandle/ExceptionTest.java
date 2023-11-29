package exceptionHandle;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionTest {
    @Tag("exception")
    @Test
    public void some1Test() {
        Exception exception = assertThrows(
                ArithmeticException.class,
                () -> divide(1, 0));

        assertEquals("/ by zero", exception.getMessage());
        assertTrue(exception.getMessage().contains("zero"));
    }

    int divide(int input, int divide) {
        return input / divide;
    }
}
