public class UnitPracticeTester {
    public static void main(String[] args) {
        UnitPractice up = new UnitPractice();

        // Each line prints the call, then the result. Add two calls for
        // every other method: one normal input and one boundary input.
        System.out.println("alarmClock(1, false): " + up.alarmClock(1, false));
        System.out.println("alarmClock(0, true): " + up.alarmClock(0, true));
        System.out.println("doubleChar(\"The\"): " + up.doubleChar("The"));
        System.out.println("doubleChar(\"\"): " + up.doubleChar(""));
        System.out.println("fizzBuzzLabel: " + up.fizzBuzzLabel("fizzub"));
        System.out.println("countHi: " + up.countHi("hihi"));
        System.out.println("catEqualDogs: " + up.catsEqualDogs("caog"));
        System.out.println("countCode: " + up.countCode("codercove"));
        System.out.println("firstTwo: " + up.firstTwo("i"));
        int[] Array = {0, 2, 4, -6, 1};
        System.out.println("countEvens: " + up.countEvens(Array));
        int[] Array2 = {1, 2, 4, 2, 1};
        System.out.println("has22: " + up.has22(Array2));
        System.out.println("repeatEnd: " + up.repeatEnd("ab", 2));
    }
}