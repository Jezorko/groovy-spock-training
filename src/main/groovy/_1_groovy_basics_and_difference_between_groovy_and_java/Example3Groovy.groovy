package _1_groovy_basics_and_difference_between_groovy_and_java

class Example3Groovy {
    static void main(String[] args) {
        new Example3Java().someMethod("Testing defaults: ")
    }

    static someMethod(String someValue, Long someOtherValue = 1L, int somePrimitive = 2) {
        println someValue + someOtherValue + somePrimitive
    }
}
