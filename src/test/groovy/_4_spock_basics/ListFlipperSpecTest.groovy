package _4_spock_basics

import spock.lang.Specification
import spock.lang.Unroll

class ListFlipperSpecTest extends Specification {

    def flipper = new ListFlipper()

    def "should throw NullPointerException given a null list"() {
        given:
        def input = null as List<?>

        when:
        flipper.flip(input)

        then:
        thrown NullPointerException
    }

    @Unroll
    "should flip #input to be #expectedOutput"() {
        // TODO implement
    }

}
