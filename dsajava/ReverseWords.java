package dsajava;

public class ReverseWords {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder res = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
            if (i != 0) {
                res.append(" ");
            }
        }

        return res.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        System.out.println(rw.reverseWords("Let's take LeetCode contest"));
        System.out.println(rw.reverseWords("a good   example"));
    }
}
