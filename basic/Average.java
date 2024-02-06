public class Average {
    public static void main(String[] args) {
        double[] numbers = {5, 10, 15, 20, 25};
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;
        System.out.println("Average: " + average);
    }
}
