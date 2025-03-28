package solution.leetcode;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();

        System.out.println(lps.longestPalindrome("baab"));
    }

    public String longestPalindrome(String s) {

        return "";
    }

    public boolean isPalindrome(String s){
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        if (sb.equals(s)) return true;
        return false;
    }

}
