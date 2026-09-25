public class BooleanChecks {

    // Returns false only when it rains and practice is not canceled.
    // to-do: implement isPromiseKept
    public boolean isPromiseKept(boolean isRaining, boolean isCanceled) {
        if (isRaining && isCanceled) {
            return true;
        }
        else if (isRaining && !isCanceled) {
            return false;
        }
        else if (!isRaining && isCanceled) {
            return true;
        }
        else {
            return true;
        }
    }

    // Returns true when the order has fries or salad, but not both.
    // to-do: implement hasOneSide
    public boolean hasOneSide(boolean hasFries, boolean hasSalad) {
        if (hasFries && hasSalad) {
            return false;
        }
        else if (hasFries && !hasSalad) {
            return true;
        }
        else if (!hasFries && hasSalad) {
            return true;
        }
        else {
            return false;
        }
    }

    // Returns true when at least two of the three officers vote yes.
    // to-do: implement isApproved
    public boolean isApproved(boolean firstVote, boolean secondVote,
            boolean thirdVote) {
        if (firstVote && secondVote && thirdVote) {
            return true;
        }
        else if (firstVote && secondVote && !thirdVote) {
            return true;
        }
        else if (firstVote && !secondVote && thirdVote) {
            return true;
        }
        else if (firstVote && !secondVote && !thirdVote) {
            return false;
        }
        else if (!firstVote && secondVote && thirdVote) {
            return true;
        }
        else if (!firstVote && secondVote && !thirdVote) {
            return false;
        }
        else if (!firstVote && !secondVote && thirdVote) {
            return false;
        }
        else {
            return false;
        }
    }

    // Returns true for a leap year in the Gregorian calendar.
    // to-do: implement isLeapYear
    public boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        else {
            return false;
        }
    }

    // Returns true when value is below low or above high. Both endpoints count as inside.
    // to-do: implement outsideRange
    public boolean outsideRange(int value, int low, int high) {
        if (value < low || value > high) {
            return true;
        }
        else {
            return false;
        }
    }

    // Returns true when d divides n evenly. A divisor of 0 divides nothing.
    // to-do: implement divides
    public boolean divides(int d, int n) {
        if (d == 0) {
            return false;
        }
        else if (n % d == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    // Returns true when total / count is at least target. A count of 0 has no average.
    // to-do: implement averageAtLeast
    public boolean averageAtLeast(int total, int count, int target) {
        if (count == 0) {
            return false;
        }
        else if (total / count == target) {
            return true;
        }
        else {
            return false;
        }
    }

    // Returns true when word begins with prefix.
    // to-do: implement hasPrefix
    public boolean hasPrefix(String word, String prefix) {
        if (prefix.length() > word.length()) {
            return false;
        }
        else if (word.substring(0, prefix.length()).equals(prefix)) {
            return true;
        }
        else {
            return false;
        }
    }
}