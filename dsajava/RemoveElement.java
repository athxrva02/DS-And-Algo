package dsajava;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = nums.length - 1;
        int i = 0;
        while (i <= k) {
            if (nums[i] == val) {
                nums[i] = nums[k];
                k--;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k + 1;
    }

    public static void main(String[] args) {
        RemoveElement r = new RemoveElement();
        int[] nums = new int[]{3,2,2,3};
        System.out.println(r.removeElement(nums, 3));
        int[] nums2 = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(r.removeElement(nums2, 2));
        int[] nums3 = new int[]{1};
        System.out.println(r.removeElement(nums3, 1));
    }
}
