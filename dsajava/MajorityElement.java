package dsajava;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int reqFreq = (nums.length / 2) + 1;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) >= reqFreq)
                return num;
        }
        return 0;
    }

    public static void main(String[] args) {
        MajorityElement m = new MajorityElement();
        int[] nums = new int[] {1,2,3,1,1,3};
        System.out.println(m.majorityElement(nums));
    }
}
