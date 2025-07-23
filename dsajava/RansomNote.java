package dsajava;

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(Character c : magazine.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(Character c : ransomNote.toCharArray()){
            if(!map.containsKey(c)|| map.get(c) <= 0){
                return false;
            }

            map.put(c, map.getOrDefault(c,0) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        RansomNote r = new RansomNote();
        System.out.println(r.canConstruct("a", "aa"));
        System.out.println(r.canConstruct("abc", "dacba"));
        System.out.println(r.canConstruct("x", "aa"));
    }
}
