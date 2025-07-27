package dsajava;

import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {

        int slow = n;
        int fast = sumOfSquares(n);

        while(fast != -1 && slow != fast) {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        }

        return fast == 1;
    }

    private int sumOfSquares(int n) {
        int sum = 0;
        while(n != 0) {
            sum += (int) Math.pow(n%10, 2);
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        HappyNumber h = new HappyNumber();
        System.out.println(h.isHappy(19));
    }
}
