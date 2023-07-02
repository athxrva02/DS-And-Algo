package XX_Java_Kunal;

import java.util.HashSet;
import java.util.Iterator;

public interface hashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Kunal");
        set.add("Kunal2");
        set.add("Atharva");
        set.add("Atharva2");
        set.add("Atharva3");

        Iterator<String> i = set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        set.remove("Kunal");
        System.out.println(set);
        System.out.println(set.contains("Kunal2"));
        System.out.println(set.size());
    }
}
