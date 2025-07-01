package dsajava;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int k = 1;

        while(i < nums.length) {
            if(nums[i] == nums[i - 1]) {
                i+=1;
            }
            else {
                nums[k++] = nums[i++];
            }
        }

        return k;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        System.out.println(obj.removeDuplicates(nums));
    }
}
