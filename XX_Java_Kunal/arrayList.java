package XX_Java_Kunal;
import java.util.*;

public class arrayList{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(10);
        list.add(100);
        list.add(1000);
        list.set(1, 10000);
        list.remove(2);
        System.out.println(list);

        for(int i =0; i<list.size(); i++)
        {
            System.out.println(list.get(i)); //Pass index here, normal array syntax doesn't work here.
        }
    }
}