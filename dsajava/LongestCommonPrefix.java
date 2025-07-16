package dsajava;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];

        for(int i=0;i<first.length();i++) {
            if(first.charAt(i)==last.charAt(i)) {
                sb.append(first.charAt(i));
            } else  {
                break;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefix lc = new LongestCommonPrefix();
        System.out.println(lc.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
