package _4_spock_basics;

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
