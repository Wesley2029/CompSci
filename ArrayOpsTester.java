public class ArrayOpsTester {

    public static void main(String[] args) {
        // Write toText first: every later block uses it to print an array.
        // Printing an array directly shows its type and a code, not its values.
        // Uncomment one block at a time as you finish each method.
        ArrayOps ops = new ArrayOps();

        System.out.println("=== toText ===");
        System.out.println("{4, 1, 7} -> " + ops.toText(new int[] {4, 1, 7}));
        System.out.println("{} -> " + ops.toText(new int[0]));

        System.out.println();
        System.out.println("=== numbersFrom ===");
        System.out.println("(5, 10) -> " + ops.toText(ops.numbersFrom(5, 10)));
        System.out.println("(5, 5) -> " + ops.toText(ops.numbersFrom(5, 5)));

        System.out.println();
        System.out.println("=== averageLength ===");
        String[] words = {"hi", "there", "hello"};
        System.out.println("{hi, there, hello} -> " + ops.averageLength(words));

        System.out.println();
        System.out.println("=== hasWord ===");
        String[] colors = {"red", "blue"};
        System.out.println("blue -> " + ops.hasWord(colors, "blue"));
        System.out.println("green -> " + ops.hasWord(colors, "green"));

        System.out.println();
        System.out.println("=== indexOfLongest ===");
        String[] fruit = {"fig", "banana", "kiwi"};
        System.out.println("{fig, banana, kiwi} -> " + ops.indexOfLongest(fruit));
        System.out.println("{} -> " + ops.indexOfLongest(new String[0]));

        System.out.println();
        System.out.println("=== isIncreasing ===");
        System.out.println("{1, 4, 9, 10} -> " + ops.isIncreasing(new int[] {1, 4, 9, 10}));
        System.out.println("{5, 1, 2, 3} -> " + ops.isIncreasing(new int[] {5, 1, 2, 3}));

        System.out.println();
        System.out.println("=== reversed ===");
        int[] original = {1, 2, 3};
        System.out.println("reversed -> " + ops.toText(ops.reversed(original)));
        System.out.println("original after -> " + ops.toText(original));

        System.out.println();
        System.out.println("=== removeAndShift ===");
        int[] shift = {1, 2, 3, 4};
        ops.removeAndShift(shift, 1);
        System.out.println("remove index 1 -> " + ops.toText(shift));

        System.out.println();
        System.out.println("=== valuesInRange ===");
        int[] scores = {3, 12, 7, 20, 5};
        System.out.println("5 to 12 -> " + ops.toText(ops.valuesInRange(scores, 5, 12)));
        System.out.println("original after -> " + ops.toText(scores));
    }
}