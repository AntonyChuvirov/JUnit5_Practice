package listeners.extensions;

import org.junit.jupiter.api.extension.*;

import java.lang.reflect.Method;
import java.util.logging.Logger;

public class MyExtension implements BeforeAllCallback, BeforeEachCallback,
        AfterEachCallback, AfterAllCallback,
        BeforeTestExecutionCallback, AfterTestExecutionCallback {
    private static final Logger logger = Logger.getLogger(MyExtension.class.getName());
    private static final String START_TIME = "start time";

    @Override
    public void beforeAll(ExtensionContext context) {
        System.out.println("Important logic before all");
    }

    @Override
    public void beforeEach(ExtensionContext context) {
        System.out.println("Important logic before each\n");
    }

    @Override
    public void beforeTestExecution(ExtensionContext context) {
        getStore(context).put(START_TIME, System.currentTimeMillis());
    }

    @Override
    public void afterTestExecution(ExtensionContext context) {
        Method testMethod = context.getRequiredTestMethod();
        long startTime = getStore(context).remove(START_TIME, long.class);
        long duration = System.currentTimeMillis() - startTime;

        logger.info(() ->
                String.format("Method [%s] took %s ms.\n", testMethod.getName(), duration));
    }

    private ExtensionContext.Store getStore(ExtensionContext context) {
        return context.getStore(ExtensionContext.Namespace.create(getClass(), context.getRequiredTestMethod()));
    }

    @Override
    public void afterEach(ExtensionContext context) {
        System.out.println("Important logic after each");
    }

    @Override
    public void afterAll(ExtensionContext context) {
        System.out.println("Important logic after all");
    }
}
