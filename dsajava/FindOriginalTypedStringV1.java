package dsajava;

public class FindOriginalTypedStringV1 {
    public int possibleStringCount(String word) {
        int count = 0;
        for(int i = 1; i < word.length(); i++) {

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
