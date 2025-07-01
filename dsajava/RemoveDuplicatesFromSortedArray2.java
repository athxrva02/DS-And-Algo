package dsajava;

public class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<=2){
            return n;
        }

        int k = 2;
        for(int i=2; i<n; i++){
            if(nums[i] != nums[k-2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray2 obj = new RemoveDuplicatesFromSortedArray2();
        int[] nums = {1,1,1,2,2,3};
        System.out.println(obj.removeDuplicates(nums));
    }
}
