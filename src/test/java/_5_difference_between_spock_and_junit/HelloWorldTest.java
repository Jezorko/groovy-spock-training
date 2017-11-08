package _5_difference_between_spock_and_junit;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    private String expectedString = "Hello World!";

    @Test
    public void shouldBeEqualToHelloWorld() {
        // given:
        String helloWorldText = "Hello World!";

        // expect:
        Assert.assertEquals(expectedString, helloWorldText);
    }

}
