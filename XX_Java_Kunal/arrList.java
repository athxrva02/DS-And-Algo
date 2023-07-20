package XX_Java_Kunal;
import java.util.*;

public class arrList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Atharva");
        list.add("Kunal");
        list.add(0, "Akshara");
        System.out.println(list.toString());
        List<String> list2 = new ArrayList<String>();
        list2.addAll(list);
        System.out.println(list2.toString());
        System.out.println(list2.get(1));
        list2.remove(2);
        list2.remove(String.valueOf("Atharva"));
        
        list2.set(0, "Kunal2");
        
        System.out.println(list2.contains("Kunal2"));
    }
}
