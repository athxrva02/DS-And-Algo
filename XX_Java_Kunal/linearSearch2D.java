package XX_Java_Kunal;
import java.util.*;

public class linearSearch2D {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target = 7;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; i++)
            {
                if(arr[i][j] == target)
                {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
