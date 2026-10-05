public class Sequences {

    // Read REQ 02
    public int sumOfFirst(int n) {
        int total = 1;
        if (total <= 0) {
            return 0;
        }
        for (int count = 0; count <= n; count++) {
            total += count;
        }
        return total - 1;
    }

    // Read REQ 03
    public String countUp(int start, int limit) {
        String result = "";
        if (start > limit) {
            return "";
        }
        for (int count = start; count <= limit; count++) {
            if (count != limit) {
                result += count + " ";
            }
            else {
                result += count;
            }
        }
        return result;
    }

    // Read REQ 04
    public String countByThrees(int start, int limit) {
        String result = "";
        if (start > limit) {
            return "";
        }
        for (int count = start; count <= limit; count += 3) {
            if (count != limit) {
                result += count + " ";
            }
            else {
                result += count;
            }
        }
        return result;
    }

    // Read REQ 05
    public int productOfFirst(int n) {
        int result = 1;
        if (n <= 0) {
            return 1;
        }
        for (int count = 1; count <= n; count++) {
            result *= count;
        }
        return result;
    }

    // Read REQ 06
    public int countMultiples(int n, int factor) {
        int count = 0;
        if (n <= 0) {
            return 0;
        }
        if (factor == 0) {
            return 0;
        }
        for (int num = 0; num <= n; num++) {
            count = n / factor;
        }
        return count;
    }

    // Read REQ 07
    public String repeat(String s, int times) {
        String result = "";
        if (times <= 0) {
            return "";
        }
        for (int count = 0; count < times; count++) {
            result += s;
        }
        return result;
    }

    // Read REQ 08
    public int power(int base, int exponent) {
        int result = base;
        if (exponent <= 0) {
            return 1;
        }
        for (int count = 1; count < exponent; count++) {
            result *= base;
        }
        return result;
    }
}