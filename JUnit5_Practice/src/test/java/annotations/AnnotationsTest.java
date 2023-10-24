package annotations;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class AnnotationsTest {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All method started\n");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before Each method started");
    }

    @DisplayName("Some displayed name which can be a very long description")
    @Test
    public void some1Test() {
        System.out.println("Test 1 started");
    }

    @Test
    public void some2Test() {
        System.out.println("Test 2 started");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After Each method started\n");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All method started");
    }
}
