package dsajava;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 1;
        int left = 0;
        int right = height.length - 1;

        if(height.length == 2) {
            return Math.min(height[0], height[1]);
        }

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right]) {
                left++;
            }  else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater container = new ContainerWithMostWater();
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(container.maxArea(arr));
        int[] arr2 = {1,1};
        System.out.println(container.maxArea(arr2));
    }
}
