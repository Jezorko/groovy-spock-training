package _1_groovy_basics_and_difference_between_groovy_and_java

class Example2GroovyMain {
    static void main(String[] args) {
        def example = new Example2Java(someString: "someValue", someInt: 5)
        println example.someString + example.someInt
    }
}
