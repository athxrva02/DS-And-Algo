package dsajava;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }  else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        SearchInsertPosition obj = new SearchInsertPosition();
        System.out.println(obj.searchInsert(new int[]{1,3,5,6}, 5));
    }
}
