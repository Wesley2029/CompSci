public class UnitPractice {

    // Read REQ 02
    public String alarmClock(int day, boolean vacation) {
        if (vacation && day == 0 || day == 6) {
            return "off";
        }
        else if (vacation || day == 0 || day == 6) {
            return "10:00";
        }
        return "7:00";
    }

    // Read REQ 03
    public boolean makesSix(int a, int b) {
        if (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6) {
            return true;
        }
        return false;
    }

    // Read REQ 04
    public int ticketPrize(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        }
        else if (a == b && b == c) {
            return 5;
        }
        else if (a != b && a != c) {
            return 1;
        }
        return 0;
    }

    // Read REQ 05
    public String fizzBuzzLabel(String str) {
        if (str.substring(0, 1).equals("f") &&
         str.substring(str.length() - 1, str.length()).equals("b")) {
            return "FizzBuzz";
        }
        else if (str.substring(0, 1).equals("f")) {
            return "Fizz";
        }
        else if (str.substring(str.length()).equals("b")) {
            return "Buzz";
        }
        return str;
    }

    // Read REQ 06
    public String doubleChar(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += str.substring(i, i + 1);
            newStr += str.substring(i, i + 1);
        }
        return newStr;
    }

    // Read REQ 07
    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals("h") 
                && str.substring(i + 1, i + 2).equals("i")) {
                count++; 
            }
        }
        return count;
    }

    // Read REQ 08
    public boolean catsEqualDogs(String str) {
        int dogCount = 0;
        int catCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 1).equals("c") 
            && str.substring(i + 1, i + 2).equals("a") 
            && str.substring(i + 2, i + 3).equals("t")) {
                catCount++; 
            }
            else if (str.substring(i, i + 1).equals("d") && 
            str.substring(i + 1, i + 2).equals("o") 
            && str.substring(i + 2, i + 3).equals("g")) {
                dogCount++; 
            }
        }
        if (catCount == dogCount) {
            return true;
        }
        return false;
    }

    // Read REQ 09
    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 1).equals("c") && 
            str.substring(i + 1, i + 2).equals("o") 
            && str.substring(i + 3, i + 4).equals("e")) {
                count++; 
            }
        }
        return count;
    }

    // Read REQ 10
    public String repeatEnd(String str, int n) {
        String newStr = "";
        String letter = str.substring(str.length() - n);
        for (int i = 0; i < n; i++) {
            newStr += letter;
        }
        return newStr;
    }

    // Read REQ 11
    public String firstTwo(String str) {
        String newStr = "";
        if (str.length() > 1) {
            for (int i = 0; i < 2; i++) {
                newStr += str.substring(i, i + 1);
            }
        }
        else if (str.length() > 0) {
            for (int i = 0; i < 1; i++) {
                newStr += str.substring(i, i + 1);
            }
        }
        while (newStr.length() < 2) {
            newStr += "*";
        }
        return newStr;
    }

    // Read REQ 12
    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Read REQ 13
    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }
}