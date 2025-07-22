package dsajava;

public class JumpGameII {
    public int jump(int[] nums) {
        int far = 0;
        int near = 0;
        int jumpCount = 0;

        while (far < nums.length - 1) {
            int farthest = 0;

            for(int i = near; i <= far; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }

            near = far + 1;
            far = farthest;
            jumpCount++;
        }

        return jumpCount;
    }

    public static void main(String[] args) {
        JumpGameII jumpGameII = new JumpGameII();
        System.out.println(jumpGameII.jump(new int[]{2,3,1,1,4}));
    }
}
