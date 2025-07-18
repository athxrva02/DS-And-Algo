package dsajava;

//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//Output: 6
//Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
//Example 2:
//
//Input: height = [4,2,0,3,2,5]
//Output: 9

public class TrappingRainWater {
    public int trap(int[] height) {
        int[] leftMax =  new int[height.length];
        int[] rightMax =  new int[height.length];
        leftMax[0] = height[0];
        rightMax[height.length - 1] = height[height.length-1];
        int ans = 0;

        for(int i = 1; i < height.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        for(int i = height.length - 2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        for(int i = 0; i < height.length; i++){
            int waterLevel = Math.min(leftMax[i],  rightMax[i]);
            ans += waterLevel - height[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        System.out.println(trappingRainWater.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
