package python.XX_Java_Kunal;
import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alisson Becker", 1);
        map.put("Trent Alexander-Arnold", 66);
        map.put("Virgil van Dijk", 4);
        map.put("Joe Gomez", 12);
        map.put("Andrew Robertson", 26);
        map.put("Jordan Henderson", 14);
        map.put("Georginio Wijnaldum", 5);
        map.put("Thiago Alcantara", 6);

        // System.out.println(map);
        // for(Map.Entry m : map.entrySet())
        // {
        //     System.out.println(m.getKey() + " " + m.getValue());
        // }
        System.out.println(map.get("Alisson Becker"));
    }
}
