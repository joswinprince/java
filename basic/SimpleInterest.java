public class SimpleInterest {
    public static void main(String[] args) {
        float principle = 10000, rate = 3.5f, time = 6;
        float simpleInterest = (principle * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
