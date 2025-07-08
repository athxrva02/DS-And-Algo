package dsajava;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        for(int i = nums.length - 2; i>=0; i--) {
            if(i + nums[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0;
    }

    public static void main(String[] args) {
        JumpGame obj = new JumpGame();
        System.out.println(obj.canJump(new int[]{2, 3, 1, 1, 4}));
    }
}
