import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static boolean isValidEmail(String email) {
        // Define a regex pattern for a valid email address
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(email);

        // Use the Matcher to check if the email matches the pattern
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Test the isValidEmail function with some sample email addresses
        String[] emails = {
            "john.doe@example.com",
            "jane@example",
            "invalid-email",
            "another.email@domain.co",
            "fdfd.sf.e@dfd@df.com"
        };

        for (String email : emails) {
            if (isValidEmail(email)) {
                System.out.println(email + " is a valid email address.");
            } else {
                System.out.println(email + " is not a valid email address.");
            }
        }
    }
}
