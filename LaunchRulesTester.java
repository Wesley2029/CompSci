public class LaunchRulesTester {
    public static void main(String[] args) {
        LaunchRules rules = new LaunchRules();

        // Uncomment each group as you finish that method in LaunchRules.java.

        // Part A
        // Each line prints your rewrite and the first draft for the same values.
        // Add a line like this one for every isScrubbed row in CHECK 01.
        int wind = 20;
        boolean clear = true;
        System.out.println("isScrubbed(" + wind + ", " + clear + "): "
                + rules.isScrubbed(wind, clear)
                + " | first draft: " + !(wind < 20 && clear));

        System.out.println("isGo(false, true): " + rules.isGo(false, true));

        System.out.println("canLaunch(19, false, true, false): "
                + rules.canLaunch(19, false, true, false));

        // Part B
        System.out.println("notBothPositive(3, 4): " + rules.notBothPositive(3, 4));

        // Print the first draft beside canFuel too, for every canFuel row in CHECK 03.
        int temp = 95;
        boolean spark = false;
        System.out.println("canFuel(" + temp + ", " + spark + "): "
                + rules.canFuel(temp, spark)
                + " | first draft: " + (temp <= 95 && !spark));

        System.out.println("isHold(19, true, false, true): "
                + rules.isHold(19, true, false, true));
    }
}