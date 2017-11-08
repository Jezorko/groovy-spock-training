package _1_groovy_basics_and_difference_between_groovy_and_java

import java.util.function.BiFunction
import java.util.function.Consumer
import java.util.function.Supplier

class Example4Groovy {
    static void main(String[] args) {
        acceptingRunnable { System.out.println("Running!") }
        acceptingAnySupplier { "Supplying!" }
        acceptingStringConsumer { System.out.println("Consuming " + it + '!') }
        acceptingABiFunction { a, b -> "Transforming " + a + " and " + b + "!" }
    }

    private static void acceptingRunnable(Runnable runnable) {
        runnable.run()
    }

    private static <T> void acceptingAnySupplier(Supplier<T> supplier) {
        System.out.println(supplier.get())
    }

    private static void acceptingStringConsumer(Consumer<String> consumer) {
        consumer.accept("some string")
    }

    private static void acceptingABiFunction(BiFunction<Integer, Integer, String> function) {
        System.out.println(function.apply(1, 2))
    }
}
