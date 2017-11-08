package _5_difference_between_spock_and_junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

@RunWith(Parameterized.class)
public class StringCharacterCounterTest {

    private Supplier stringSupplier;
    private StringCharacterCounter stringCharacterCounter;

    private String input;
    private int expectedOutput;

    public StringCharacterCounterTest(String input, int expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters(name = "input string \"{0}\", expected length = {1}")
    public static List<Object[]> stringsWithTheirSizes() {
        return Arrays.asList(new Object[][]{
                {"", 0},
                {"abc", 3},
                {"def", 3},
                {"abcdef", 6}
        });
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        stringSupplier = Mockito.mock(Supplier.class);
        stringCharacterCounter = new StringCharacterCounter(stringSupplier);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExceptionIfNullValueIsGiven() {
        // given:
        Mockito.when(stringSupplier.get())
               .thenReturn(null);

        // when:
        stringCharacterCounter.countCharactersOfNextString();
    }

    @Test
    public void shouldCalculateCharacters() {
        // given:
        Mockito.when(stringSupplier.get())
               .thenReturn(input);

        // when:
        int actualOutput = stringCharacterCounter.countCharactersOfNextString();

        // then:
        Assert.assertEquals(expectedOutput, actualOutput);
    }

}


