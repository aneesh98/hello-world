import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void testGreet() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello, Jenkins!", helloWorld.greet());
    }
}
