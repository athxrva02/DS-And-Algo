package dsajava;

public class FindKthCharacterInStringGame1 {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while (sb.length() < k) {
            int size = sb.length();
            for (int i = 0; i < size; i++) {
                sb.append((char) ('a' + ((sb.charAt(i) - 'a') + 1) % 26));
            }
        }
        return sb.charAt(k - 1);
    }

    public static void main(String[] args) {
        FindKthCharacterInStringGame1 obj = new FindKthCharacterInStringGame1();
        System.out.println(obj.kthCharacter(3));
    }
}
