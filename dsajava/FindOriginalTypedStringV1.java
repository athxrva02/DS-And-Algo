package dsajava;

public class FindOriginalTypedStringV1 {
    public int possibleStringCount(String word) {
        int count = word.length();
        for(int i = 1; i < word.length(); i++) {
            if(word.charAt(i) != word.charAt(i - 1)) {
                count--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        FindOriginalTypedStringV1 obj = new FindOriginalTypedStringV1();
        System.out.println(obj.possibleStringCount("abc"));
        System.out.println(obj.possibleStringCount("abcd"));
        System.out.println(obj.possibleStringCount("abbcccc"));
    }
}
