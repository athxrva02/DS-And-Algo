package dsajava;

import java.util.Arrays;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        //The input array is sorted. Try to use binary search here
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left+1, right+1};
            }
            else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        TwoSumII ts = new TwoSumII();
        int[] result = ts.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result));
    }
}
