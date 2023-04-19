/*
Java Program to validate email address and phone number

*/
import java.util.function.Predicate;

public class ValidatorExample {
    public static void main(String[] args) {
        String email = "john.doe@example.com";
        String phone = "123-456-7890";

        Predicate<String> emailValidator = s -> s.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Predicate<String> phoneValidator = s -> s.matches("^\\d{3}-\\d{3}-\\d{4}$");

        if (emailValidator.test(email)) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }

        if (phoneValidator.test(phone)) {
            System.out.println("Valid phone number.");
        } else {
            System.out.println("Invalid phone number.");
        }
    }
}
