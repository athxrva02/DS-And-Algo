package XX_Java_Kunal;
// import java.lang.reflect.Array;
import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start < end)
        {
            swap(arr, start, end);
            start += 1;
            end -=1 ;
        }
    }

    static void swap(int [] arr, int idx1, int idx2)
    {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

}
