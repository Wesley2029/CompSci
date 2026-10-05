public class SequencesTester {

    public static void main(String[] args) {
        Sequences sequences = new Sequences();

        // The square brackets make an empty String easy to see.
        // Uncomment each pair of lines as you finish that method.

        System.out.println("sumOfFirst(5): [" + sequences.sumOfFirst(5) + "]");
        System.out.println("sumOfFirst(0): [" + sequences.sumOfFirst(0) + "]");

        System.out.println("countUp(-2, 2): [" + sequences.countUp(-2, 2) + "]");
        System.out.println("countUp(5, 3): [" + sequences.countUp(5, 3) + "]");

        System.out.println("countByThrees(1, 10): [" + sequences.countByThrees(1, 10) + "]");
        System.out.println("countByThrees(5, 3): [" + sequences.countByThrees(5, 3) + "]");

        System.out.println("productOfFirst(5): [" + sequences.productOfFirst(5) + "]");
        System.out.println("productOfFirst(0): [" + sequences.productOfFirst(0) + "]");

        System.out.println("countMultiples(20, 5): [" + sequences.countMultiples(20, 5) + "]");
        System.out.println("countMultiples(10, 0): [" + sequences.countMultiples(10, 0) + "]");

        System.out.println("repeat(\"ab\", 3): [" + sequences.repeat("ab", 3) + "]");
        System.out.println("repeat(\"ab\", 0): [" + sequences.repeat("ab", 0) + "]");

        System.out.println("power(2, 9): [" + sequences.power(2, 9) + "]");
        System.out.println("power(5, 0): [" + sequences.power(5, 0) + "]");
    }
}