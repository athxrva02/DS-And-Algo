package dsajava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for (String s : strs) {
            int[] countArray = new int[26];
            for (char c : s.toCharArray()) {
                countArray[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int num : countArray) {
                sb.append(num).append("<>");
            }
            String key = sb.toString();

            ans.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(ans.values());
    }

    public static void main(String[] args) {
        GroupAnagrams g = new GroupAnagrams();
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(g.groupAnagrams(strs));
    }
}
