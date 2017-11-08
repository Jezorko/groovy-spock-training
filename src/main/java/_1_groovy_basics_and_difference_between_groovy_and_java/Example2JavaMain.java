package _1_groovy_basics_and_difference_between_groovy_and_java;

public class Example2JavaMain {
    public static void main(String[] args) {
        Example2Java example = new Example2Java("someValue", 5);
        System.out.println(example.getSomeString() + example.getSomeInt());
    }
}
