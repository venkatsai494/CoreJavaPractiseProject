package solution.leetcode.quest.maths;

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(121));
        System.out.println(palindromeNumber.isPalindrome(-121));
        System.out.println(palindromeNumber.isPalindrome(10));
    }
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String s = String.valueOf(x);
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
}
