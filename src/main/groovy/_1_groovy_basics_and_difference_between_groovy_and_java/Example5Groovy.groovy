package _1_groovy_basics_and_difference_between_groovy_and_java

import java.util.function.Function

class Example5Groovy {
    static void main(String[] args) {
        applyAndPrint(Example5Groovy.&functionEquivalent)
    }

    private static String functionEquivalent(Integer someInt) {
        return "Some int is " + someInt
    }

    private static void applyAndPrint(Function<Integer, String> stringFunction) {
        System.out.println(stringFunction.apply(10))
    }
}
