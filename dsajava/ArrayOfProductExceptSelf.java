package dsajava;

import java.util.Arrays;

public class ArrayOfProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] prefixArray = new int[nums.length];
        int[] suffixArray = new int[nums.length];
        prefixArray[0] = 1;
        suffixArray[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            prefixArray[i] = nums[i - 1] * prefixArray[i - 1] ;
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            suffixArray[i] = nums[i + 1] * suffixArray[i + 1] ;
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefixArray[i] * suffixArray[i];
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayOfProductExceptSelf ap = new ArrayOfProductExceptSelf();
        int[] result = ap.productExceptSelf(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(result));
    }
}
