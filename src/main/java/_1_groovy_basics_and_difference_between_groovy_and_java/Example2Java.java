package _1_groovy_basics_and_difference_between_groovy_and_java;

public class Example2Java {
    private String someString;
    private int someInt;

    public Example2Java() {
        System.out.println("Using empty constructor");
    }

    public Example2Java(String someString, int someInt) {
        System.out.println("Using parametrized constructor");
        this.someString = someString;
        this.someInt = someInt;
    }

    public String getSomeString() {
        System.out.println("Using someString getter");
        return someString;
    }

    public int getSomeInt() {
        System.out.println("Using someInt getter");
        return someInt;
    }

    public void setSomeString(String someString) {
        System.out.println("Using someString setter");
        this.someString = someString;
    }

    public void setSomeInt(int someInt) {
        System.out.println("Using someInt setter");
        this.someInt = someInt;
    }
}
