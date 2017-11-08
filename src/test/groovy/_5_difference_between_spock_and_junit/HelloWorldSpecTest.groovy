package _5_difference_between_spock_and_junit

import spock.lang.Specification

class HelloWorldSpecTest extends Specification {

    def expectedString = "Hello World!"

    def 'should be equal to "Hello World!"'() {
        given:
        def helloWorldText = "Hello World!"

        expect:
        expectedString == helloWorldText
    }

}
