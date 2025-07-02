package dsajava;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        System.arraycopy(rotated, 0, nums, 0, n);

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        RotateArray r = new RotateArray();
        int[] nums = new int[] {1,2,3,1,1,3};
        r.rotate(nums, 2);
    }
}
