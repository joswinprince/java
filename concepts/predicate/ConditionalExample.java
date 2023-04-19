import java.util.function.Predicate;
// To check the block of code execution
public class ConditionalExample {
    public static void main(String[] args) {
        String input = "Hello, world!";

        Predicate<String> containsHello = s -> s.contains("Hello");

        if (containsHello.test(input)) {
            System.out.println("Input contains 'Hello', executing block of code...");
            // execute some block of code
        } else {
            System.out.println("Input does not contain 'Hello', skipping block of code.");
            // do not execute the block of code
        }
    }
}
