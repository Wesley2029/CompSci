public class LoopPuzzlesTester {

    public static void main(String[] args) {
        // The square brackets make an empty String easy to see.
        // Uncomment each group of lines as you finish that method.
        LoopPuzzles puzzles = new LoopPuzzles();

        System.out.println("stepsToOne(6): [" + puzzles.stepsToOne(6) + "]");
        System.out.println("stepsToOne(1): [" + puzzles.stepsToOne(1) + "]");
        System.out.println("stepsToOne(0): [" + puzzles.stepsToOne(0) + "]");

        System.out.println("sumDigits(4092): [" + puzzles.sumDigits(4092) + "]");
        System.out.println("sumDigits(-47): [" + puzzles.sumDigits(-47) + "]");

        System.out.println("reverseDigits(1200): [" + puzzles.reverseDigits(1200) + "]");
        System.out.println("reverseDigits(-123): [" + puzzles.reverseDigits(-123) + "]");

        System.out.println("isPowerOfThree(81): [" + puzzles.isPowerOfThree(81) + "]");
        System.out.println("isPowerOfThree(10): [" + puzzles.isPowerOfThree(10) + "]");

        System.out.println("firstRunningTotalAbove(10): ["
                + puzzles.firstRunningTotalAbove(10) + "]");
        System.out.println("firstRunningTotalAbove(-4): ["
                + puzzles.firstRunningTotalAbove(-4) + "]");

        System.out.println("readUntilSentinel(\"red,blue,stop,green\", \"stop\"): ["
                + puzzles.readUntilSentinel("red,blue,stop,green", "stop") + "]");
        System.out.println("readUntilSentinel(\"stop,a,b\", \"stop\"): ["
                + puzzles.readUntilSentinel("stop,a,b", "stop") + "]");
    }
}