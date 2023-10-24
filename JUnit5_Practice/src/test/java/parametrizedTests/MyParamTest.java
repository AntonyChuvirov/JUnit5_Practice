package parametrizedTests;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

public class MyParamTest {
    //all primitives and strings
    @ParameterizedTest
    @ValueSource(ints = {-1, 1, 13, Integer.MAX_VALUE})
    void testValueSource(int number) {
        System.out.println(number);
    }

    //
    @ParameterizedTest
    @CsvSource({"John Doe, 30",
            "Jane Doe, 25"})
    void testCsvSource(String name, int age) {
        System.out.println(name + ", " + age);
    }

    //
    @ParameterizedTest
    @MethodSource("provideValues")
    void testMethodSource(String value) {
        System.out.println(value);
    }

    private static Stream<String> provideValues() {
        return Stream.of("Hello, world!", "This is a test.");
    }

    //
    @ParameterizedTest
    @EnumSource(value = MyEnum.class, names = {"A", "B"})
    void testEnumSource(MyEnum value) {
        System.out.println(value);
    }

    enum MyEnum {
        A, B, C
    }

    //
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void testCsvFileSource(String name, int age) {
        System.out.println(name + ", " + age);
    }

    //
    @ParameterizedTest
    @NullAndEmptySource
    void testNullAndEmptySource(String value) {
        System.out.println(value);
    }

    //
    @ArgumentsSources({
            @ArgumentsSource(ArgumentsProviderImpl1.class),
            @ArgumentsSource(ArgumentsProviderImpl2.class)
    })
    @ParameterizedTest
    void testArgumentsSources(Object value) {
        System.out.println(value);
    }

    private static class ArgumentsProviderImpl1 implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(
                    Arguments.of("Hello, world!"),
                    Arguments.of("This is a test.")
            );
        }
    }

    private static class ArgumentsProviderImpl2 implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(
                    Arguments.of("Hello, world!"),
                    Arguments.of(1)
            );
        }
    }
}
