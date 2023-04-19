import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample {
    public static void main(String[] args) {
        // create a list of names
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Alice");
        names.add("Tom");

        // define a predicate that tests whether a string starts with "J"
        Predicate<String> startsWithJ = s -> s.startsWith("J");

        // use the filterNames method to filter out all the names that do not start with "J"
        List<String> filteredNames = filterNames(names, startsWithJ);

        // print out the filtered list of names
        System.out.println(filteredNames);
    }

    // method that filters a list of strings based on a predicate
    public static List<String> filterNames(List<String> names, Predicate<String> predicate) {
        // create a new list to hold the filtered names
        List<String> filteredNames = new ArrayList<>();
        // loop through each name in the input list
        for (String name : names) {
            // if the name passes the predicate test, add it to the filtered list
            if (predicate.test(name)) {
                filteredNames.add(name);
            }
        }
        // return the filtered list of names
        return filteredNames;
    }
}
