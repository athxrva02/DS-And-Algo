package dsajava;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        while(start<end){
            char chs=s.charAt(start);
            char che=s.charAt(end);
            if(!Character.isLetterOrDigit(chs)){
                start++;
            }
            else if(!Character.isLetterOrDigit(che)){
                end--;
            }else if(Character.toLowerCase(chs)!=Character.toLowerCase(che)){
                return false;
            }else{
                start++;
                end--;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome("abcba"));
    }
}
