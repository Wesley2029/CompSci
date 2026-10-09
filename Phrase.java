public class Phrase {

    private String text;

    public Phrase(String newText) {
        text = newText;
    }

    public String getText() {
        return text;
    }

    // Read REQ 03
    public String reversed() {
        String reverse = "";
        for (int count = text.length() - 1; count >= 0; count--) {
            reverse += text.charAt(count);
        }
        return reverse;
    }

    // Read REQ 04
    public int countChar(char target) {
        int tracker = 0;
        for (int count = 0; count < text.length(); count++) {
            if (target == text.charAt(count)) {
                tracker++;
            }
        }
        return tracker;
    }

    // Read REQ 05
    public boolean isAllDigits() {
        int tracker = 0;
        if (text.length() != 0) {
            for (int count = 0; count < text.length(); count++) {
                if (48 <= (int) text.charAt(count) && (int) text.charAt(count) <= 57) {
                    tracker++;
                }
            }
            if (tracker == text.length()) {
                return true;
            }
        }
        return false;
    }

    // Read REQ 06
    public int countAdjacentPairs() {
        int tracker = 0;
        for (int count = 0; count < text.length(); count++) {
            if (count + 1 < text.length()) {
                if (text.charAt(count) == text.charAt(count + 1)) {
                    tracker++;
                }
            }
        }
        return tracker;
    }

    // Read REQ 07
    public int countOccurrences(String target) {
        int times = 0;
        for (int i = 0; i < text.length(); i++) {
            if (target.equals(text.charAt(i))) {
                times++;
            }
        }
        return times;
    }

    // Read REQ 08
    public String capitalizeWords() {
        String newText = "";
        int character = 0;
        if (text.length() >= 2) {
            if ((int) text.charAt(0) != 32) {
            character = (int) text.charAt(0) - 32;
            newText += (char) character;
            }
            else {
                newText += " ";
            }
            for (int i = 1; i < text.length(); i++){
                if ((int) text.charAt(i - 1) == 32 && (int) text.charAt(i) != 32) {
                    character = (int) text.charAt(i) - 32;
                    newText += (char) character;
                }
                else {
                    newText += text.charAt(i);
                }
            }
        }
        else if (text.length() == 0) {
            return "";
        }
        else {
            if ((int) text.charAt(0) != 32) {
            character = (int) text.charAt(0) - 32;
            newText += (char) character;
            }
            else {
                newText += " ";
            }
        }
        return newText;
    }

    // Read REQ 09
    public boolean isPalindrome() {
        String palindrome = "";
        for (int count = text.length() - 1; count >= 0; count--) {
            palindrome += text.charAt(count);
        }
        palindrome = palindrome.toLowerCase();
        if (palindrome.equals(text.toLowerCase())) {
            return true;
        }
        return false;
    }

}