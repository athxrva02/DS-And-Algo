package dsajava;

public class Candy {
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        int count = 0;

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = ratings.length - 1; i > 0; i--) {
            if (ratings[i - 1] > ratings[i]) {
                candies[i - 1] = Math.max(candies[i] + 1, candies[i - 1]);
            }
            count += candies[i - 1];
        }

        return count + candies[ratings.length - 1];
    }

    public static void main(String[] args) {
        Candy candy = new Candy();
        System.out.println(candy.candy(new int[]{1,2,2}));
    }
}
