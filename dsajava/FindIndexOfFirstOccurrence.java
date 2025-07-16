package dsajava;

public class FindIndexOfFirstOccurrence {
    public int strStr(String haystack, String needle) {
        int start = 0;
        int end = needle.length();

        if(haystack.equals(needle)) {
            return 0;
        }

        while(end <= haystack.length()) {
            String sub = haystack.substring(start, end);
            if(sub.equals(needle)) {
                return start;
            }
            start++;
            end++;
        }
        return -1;
    }

    public static void main(String[] args) {
        FindIndexOfFirstOccurrence f = new FindIndexOfFirstOccurrence();
        String haystack = "abcdabc";
        String needle = "abc";
        System.out.println(f.strStr(haystack, needle));
    }
}
