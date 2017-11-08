package _1_groovy_basics_and_difference_between_groovy_and_java

class Example1Groovy {
    static final SOME_PUBLIC_CONSTANT = "Hello"
    static final SOME_CONSTANT = " World"
    static final SOME_PRIMITIVE_CONSTANT = 33

    private loopLimiter = 2

    Example1Groovy() {
    }

    Example1Groovy(int loopLimiter) {
        this.loopLimiter = loopLimiter
    }

    static void main(String[] args) {
        def first = new Example1Groovy()
        def second = new Example1Groovy(5)

        println "Hello world? " +
                        SOME_PUBLIC_CONSTANT +
                        SOME_CONSTANT +
                        SOME_PRIMITIVE_CONSTANT as char

        first.runAsManyTimesAsLoopLimiterSays { System.out.println("Running first") }
        second.runAsManyTimesAsLoopLimiterSays { System.out.println("Running second") }
    }

    def runAsManyTimesAsLoopLimiterSays(Runnable lambda) {
        (0..loopLimiter).each {
            lambda.run()
        }
    }
}
