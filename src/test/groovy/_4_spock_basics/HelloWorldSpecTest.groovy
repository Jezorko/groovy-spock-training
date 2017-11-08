package _4_spock_basics

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
