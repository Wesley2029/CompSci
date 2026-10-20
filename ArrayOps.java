public class ArrayOps {

    // Read REQ 02
    public String toText(int[] nums) {
        String numList = "[";
        for (int i = 0; i < nums.length; i++) {
            numList += nums[i];
            if (i != nums.length - 1) {
                numList += ", ";
            }
        }
        return numList + "]";
    }

    // Read REQ 03
    public int[] numbersFrom(int start, int end) {
        int[] newArray = new int[end - start];
        int count = 0;
        if (end <= start) {
            return new int[0];
        }
        for (int i = start; i < end; i++) {
            newArray[count] = i;
            count++;
        }
        return newArray;
    }

    // Read REQ 04
    public double averageLength(String[] words) {
        if (words.length == 0){
            return 0;
        }
        int total = 0;
        for (int i = 0; i < words.length; i++) {
            total += words[i].length();
        }
        return (double) total / words.length;
    }

    // Read REQ 05
    public boolean hasWord(String[] words, String target) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                return true;
            }
        }
        return false;
    }

    // Read REQ 06
    public int indexOfLongest(String[] words) {
        int longest = 0;
        if (words.length == 0) {
            return -1;
        }
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > words[i - 1].length()) {
                longest = i;
            }
        }
        return longest;
    }

    // Read REQ 07
    public boolean isIncreasing(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return true;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Read REQ 08
    public int[] reversed(int[] nums) {
        int[] reverse = new int[nums.length];
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            reverse[count] += nums[i];
            count++;
        }
        return reverse;
    }

    // Read REQ 09
    public int[] removeAndShift(int[] nums, int index) {
        nums[index] = 0;
        if (index != 0) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums.length) {
                    nums[i] = nums[i + 1];
                }
                else {
                    nums[i] = 0;
                }
            }
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != nums.length) {
                    nums[i] = nums[i + 1];
                }
                else {
                    nums[i] = 0;
                }
            }
        }
        return nums;
    }

    // Read REQ 10
    public int[] valuesInRange(int[] nums, int low, int high) {
        int[] newArray = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= low && nums[i] <= high) {
                newArray[count] = nums[i];
                count++;
            }
        }
        int[] finalArray = new int[count];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = newArray[i];
        }
        return finalArray;
    }
}