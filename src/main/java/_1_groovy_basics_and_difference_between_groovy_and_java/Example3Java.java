package _1_groovy_basics_and_difference_between_groovy_and_java;

public class Example3Java {
    public static void main(String[] args) {
        someMethod("Testing defaults: ");
    }

    static void someMethod(String someValue) {
        someMethod(someValue, 1L);
    }

    private static void someMethod(String someValue, Long someOtherValue) {
        someMethod(someValue, someOtherValue, 2);
    }

    private static void someMethod(String someValue, Long someOtherValue, int somePrimitive) {
        System.out.println(someValue + someOtherValue + somePrimitive);
    }
}
