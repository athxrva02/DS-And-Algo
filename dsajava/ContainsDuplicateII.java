package dsajava;

import java.util.HashMap;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                    return true;
                }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateII cd = new ContainsDuplicateII();
        int[] nums = {1,2,3,1,2,3};
        int k = 4;
        System.out.println(cd.containsNearbyDuplicate(nums, k));
    }
}
