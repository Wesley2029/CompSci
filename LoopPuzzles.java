public class LoopPuzzles {

    // Read REQ 02
    public int stepsToOne(int start) {
        int count = 0;
        if (start <= 0) {
            return -1;
        }
        while (start != 1) {
            if (start % 2 == 0) {
                start = start / 2;
            }
            else {
                start = 3 * start + 1;
            }
            count++;
        }
        return count;
    }

    // Read REQ 03
    public int sumDigits(int n) {
        int sum = 0;
        if (n == 0) {
            return 0;
        }
        else if (n < 0) {
            n *= -1;
        }
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Read REQ 04
    public int reverseDigits(int n) {
        int sign = 1;
        int reversed = 0;
        if (n < 0) {
            sign = -1;
            n *= -1;
        }
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        sign *= reversed;
        return sign;
    }

    // Read REQ 05
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        else if (n % 3 == 0) {
            return true;
        }
        else if (n == 1) {
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
        String unread = csv;
        String result = "";
        while (unread.length() != 0) {
            int commaIndex = unread.indexOf(",");
            String token = "";
            if (commaIndex == -1) {
                token = unread;
                unread = "";
            } 
            else {
                token = unread.substring(0, commaIndex);
                unread = unread.substring(commaIndex + 1);
            }
            if (token.equals(sentinel)) {
                break;
            }
            if (result.length() != 0) {
                result += " ";
            }
            result += token;
        }
        return result;
    }
}