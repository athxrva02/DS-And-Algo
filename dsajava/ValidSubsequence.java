package dsajava;

public class ValidSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        for(i = 0, j = 0; i < s.length() && j < t.length();) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }
            else {
                j++;
            }
        }

        if(i == s.length()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ValidSubsequence vs = new ValidSubsequence();
        System.out.println(vs.isSubsequence("abc", "ahbgdc"));
    }
}
