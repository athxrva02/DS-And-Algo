package dsajava;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int number: nums) {
            set.add(number);
        }

        int maxLength = 0;
        for(int number: set) {
            int previousNumber = number - 1;
            int currentLength = 0;

            if(!set.contains(previousNumber)) {

                while(set.contains(previousNumber + 1)) {
                    currentLength++;
                    previousNumber = previousNumber + 1;
                }
            }

            maxLength = Math.max(currentLength, maxLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestConsecutiveSubsequence lcs = new LongestConsecutiveSubsequence();
        System.out.println(lcs.longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}
