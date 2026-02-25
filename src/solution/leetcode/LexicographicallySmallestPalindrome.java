package solution.leetcode;

public class LexicographicallySmallestPalindrome {
    public static void main(String[] args) {
        LexicographicallySmallestPalindrome lexicographicallySmallestPalindrome = new LexicographicallySmallestPalindrome();
        System.out.println(lexicographicallySmallestPalindrome.makeSmallestPalindrome("egcfe"));
        System.out.println(lexicographicallySmallestPalindrome.makeSmallestPalindrome("abcd"));
        System.out.println(lexicographicallySmallestPalindrome.makeSmallestPalindrome("seven"));
    }
    public String makeSmallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        char [] charArray = s.toCharArray();
        int length = charArray.length;
        for(int i= 0; i<length/2; i++){
            if(charArray[i] != charArray[length-i-1]){
                if(charArray[i]<charArray[length-i-1]){
                    charArray[length-i-1] = charArray[i];
                }
                else{
                    charArray[i] = charArray[length-i-1];
                }
            }
        }
        for(char c: charArray){
            sb.append(c);
        }
        return sb.toString();
    }
}
