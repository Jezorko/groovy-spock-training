package _1_groovy_basics_and_difference_between_groovy_and_java;

public class Example1Java {
    public static final String SOME_PUBLIC_CONSTANT = "Hello";
    private static final String SOME_CONSTANT = " World";
    private static final int SOME_PRIMITIVE_CONSTANT = 33;

    private int loopLimiter = 2;

    public Example1Java() {
    }

    public Example1Java(int loopLimiter) {
        this.loopLimiter = loopLimiter;
    }

    public static void main(String[] args) {
        Example1Java first = new Example1Java();
        Example1Java second = new Example1Java(5);

        System.out.println("Hello world? " +
                           SOME_PUBLIC_CONSTANT +
                           SOME_CONSTANT +
                           (char) SOME_PRIMITIVE_CONSTANT);

        first.runAsManyTimesAsLoopLimiterSays(() -> System.out.println("Running first"));
        second.runAsManyTimesAsLoopLimiterSays(() -> System.out.println("Running second"));
    }

    private void runAsManyTimesAsLoopLimiterSays(Runnable lambda) {
        for (int i = 0; i < loopLimiter; ++i) {
            lambda.run();
        }
    }
}
