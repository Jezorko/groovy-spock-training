package _5_difference_between_spock_and_junit

import spock.lang.Specification
import spock.lang.Unroll

import java.util.function.Supplier

class StringCharacterCounterSpecTest extends Specification {

    def stringSupplier = Mock Supplier
    def stringCharacterCounter = new StringCharacterCounter(stringSupplier)

    def "should throw NullPointerException if null value is given"() {
        given:
        stringSupplier.get() >> null

        when:
        stringCharacterCounter.countCharactersOfNextString()

        then:
        thrown NullPointerException
    }

    @Unroll
    "should calculate characters of #input as equal to #expectedOutput"() {
        when:
        def actualOutput = stringCharacterCounter.countCharactersOfNextString()

        then:
        1 * stringSupplier.get() >> input

        and:
        expectedOutput == actualOutput

        where:
        input    | expectedOutput
        ""       | 0
        "abc"    | 3
        "def"    | 3
        "abcdef" | 6
    }

}
