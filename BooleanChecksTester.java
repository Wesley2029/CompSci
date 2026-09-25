public class BooleanChecksTester {
    public static void main(String[] args) {
        BooleanChecks checks = new BooleanChecks();

        // Uncomment each group as you finish that method in BooleanChecks.java.

        System.out.println("isPromiseKept(true, true): "
                + checks.isPromiseKept(true, true));
        System.out.println("isPromiseKept(true, false): "
                + checks.isPromiseKept(true, false));
        System.out.println("isPromiseKept(false, true): "
                + checks.isPromiseKept(false, true));
        System.out.println("isPromiseKept(false, false): "
                + checks.isPromiseKept(false, false));

        System.out.println("hasOneSide(true, true): " + checks.hasOneSide(true, true));
        System.out.println("hasOneSide(true, false): " + checks.hasOneSide(true, false));
        System.out.println("hasOneSide(false, true): " + checks.hasOneSide(false, true));
        System.out.println("hasOneSide(false, false): " + checks.hasOneSide(false, false));

        System.out.println("isApproved(true, true, false): "
                + checks.isApproved(true, true, false));
        System.out.println("isApproved(false, true, true): "
                + checks.isApproved(false, true, true));
        System.out.println("isApproved(true, false, false): "
                + checks.isApproved(true, false, false));

        System.out.println("isLeapYear(2024): " + checks.isLeapYear(2024));
        System.out.println("isLeapYear(2023): " + checks.isLeapYear(2023));
        System.out.println("isLeapYear(1900): " + checks.isLeapYear(1900));
        System.out.println("isLeapYear(2000): " + checks.isLeapYear(2000));

        System.out.println("outsideRange(0, 1, 10): " + checks.outsideRange(0, 1, 10));
        System.out.println("outsideRange(1, 1, 10): " + checks.outsideRange(1, 1, 10));
        System.out.println("outsideRange(10, 1, 10): " + checks.outsideRange(10, 1, 10));
        System.out.println("outsideRange(11, 1, 10): " + checks.outsideRange(11, 1, 10));

        System.out.println("divides(3, 12): " + checks.divides(3, 12));
        System.out.println("divides(5, 12): " + checks.divides(5, 12));
        System.out.println("divides(0, 12): " + checks.divides(0, 12));

        System.out.println("averageAtLeast(90, 3, 30): " + checks.averageAtLeast(90, 3, 30));
        System.out.println("averageAtLeast(89, 3, 30): " + checks.averageAtLeast(89, 3, 30));
        System.out.println("averageAtLeast(0, 0, 1): " + checks.averageAtLeast(0, 0, 1));

        System.out.println("hasPrefix(\"sunset\", \"sun\"): "
                + checks.hasPrefix("sunset", "sun"));
        System.out.println("hasPrefix(\"sunset\", \"set\"): "
                + checks.hasPrefix("sunset", "set"));
        System.out.println("hasPrefix(\"su\", \"sun\"): " + checks.hasPrefix("su", "sun"));
    }
}
