public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Accessing elements of the array using index
        System.out.println("Element at index 0: " + numbers[0]); // Prints 1
        System.out.println("Element at index 2: " + numbers[2]); // Prints 3
        
        // Modifying elements of the array
        numbers[3] = 10;
        System.out.println("Modified element at index 3: " + numbers[3]); // Prints 10
        
        // Length of the array
        System.out.println("Length of the array: " + numbers.length); // Prints 5
        
        // Iterating through the array using a for loop
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // Prints a new line
        
        // Declaring and initializing an array of strings
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        
        // Iterating through the array using a for-each loop
        System.out.print("Names: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println(); // Prints a new line
    }
}
