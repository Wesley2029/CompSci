public class LoopPuzzles {

    // Read REQ 02
    public int stepsToOne(int start) {
        int count = 0;
        if (start <= 0) {
            return -1;
        }
        else if (start != 1) {
            while ((double) start / 2 != 0 && start % 2 == 0) {
                start /= 2;
                count ++;
            }
            while ((double) start / 2 != 0) {
                start = start * 3 + 1;
                count ++;
            }
        }
        else {
            return 1;
        }
        return start;
    }

    // Read REQ 03
    public int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int n2 = n / 10;
        while (n > 9) {
            n2 += n % 10;
        }
        return n2;
    }

    // Read REQ 04
    public int reverseDigits(int n) { //wrong
        int sign = -1;
        String chars = n + "";
        int length = chars.length();
        String digits = "";
        if (n > 0) {
            sign = 1;
        }
        while (length > 0) {
            if (chars.substring(length - 1).equals("0")) {
                digits += chars.substring(length - 1);
            }
            length--;
        }
        return n * sign;
    }

    // Read REQ 05
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        else if (n % 3 == 0) {
            return true;
        }
        return false;
    }

    // Read REQ 06
    public int firstRunningTotalAbove(int limit) {
        int total = 0;
        while (total <= limit) {
            total += total;
            total++;
        }
        return total;
    }

    // Read REQ 07
    public String readUntilSentinel(String csv, String sentinel) {
        return "TODO";
    }
}