public class ConditionalChallenge {
    public static void main(String[] args) {
        System.out.println("--- Part 1: Temperature Converter ---");

        double temperature = 75.0;
        boolean isCold = true;
        if(isCold) {
            temperature -= 15;
        }
        else {
            temperature += 10;
        }
        System.out.println("Temperature: " + temperature);

        System.out.println("--- Part 2: Grade Calculator ---");

        int score = 85;
        System.out.println("Score: " + score);
        if (score >= 70) {
            System.out.println("Passed.");
        }
        else{
            System.out.println("Failed.");
        }

        System.out.println("--- Part 3: Season Determiner ---");

        int temp = 65;
        System.out.println("Temperature: " + temp);
        if (temp > 80) {
            System.out.println("Season: Summer");
        }
        else if (temp <= 80 && temp >= 60) {
            System.out.println("Season: Spring");
        }
        else if (temp >= 40 && temp <= 59) {
            System.out.println("Season: Fall");
        }
        else {
            System.out.println("Season: Winter");
        }

        System.out.println("--- Part 4: Number Classifier ---");

        int number = 42;
        System.out.println("Number: " + number);
        if (number > 0) {
            System.out.println(number + " is Positive");
        }
        else if (number < 0) {
            System.out.println(number + " is Negative");
        }
        else {
            System.out.println(number + " is Zero");
        }
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        }
        else {
            System.out.println(number + " is odd");
        }
        if (number % 5 == 0) {
            System.out.println(number + " is a multiple of 5");
        }
        else {
            System.out.println(number + " is not a multiple of 5");
        }
        if (number % 3 == 0) {
            System.out.println(number + " is a multiple of 3");
        }
        else {
            System.out.println(number + " is not a multiple of 3");
        }
    }
}
