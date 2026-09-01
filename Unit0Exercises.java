public class Unit0Exercises {
    public static void main(String[] args) {
        int score = 85;
        double price = 19.99;
        boolean isPassing = true;
        System.out.println("--- Variable Snapshot ---\nScore: " + score +
         "\nPrice: "+ price + "\nPassing: "+ isPassing);
        score = 90;
        price = 22.49;
        isPassing = false;
        System.out.println("--- After Updates ---\nScore: " + score +
        "\nPrice: "+ price + "\nPassing: "+ isPassing);
    }
}