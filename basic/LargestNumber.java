public class LargestNumber {
    public static void main(String[] args) {
        double num1 = -10.5, num2 = 2.5, num3 = 5.0;
        if( num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " is the largest number.");
        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + " is the largest number.");
        else
            System.out.println(num3 + " is the largest number.");
    }
}
