package solution.leetcode;

public class StrictlyPalindromicNumber {
    public static void main(String[] args) {
        StrictlyPalindromicNumber spn = new StrictlyPalindromicNumber();
        System.out.println(spn.isStrictlyPalindromic(4)); // false
        System.out.println(spn.isStrictlyPalindromic(5)); // false
        System.out.println(spn.isStrictlyPalindromic(6)); // false
        System.out.println(spn.isStrictlyPalindromic(7)); // false
        System.out.println(spn.isStrictlyPalindromic(8)); // false
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2; i<n-1; i++){
            if(!isPalindrome(Integer.toString(n,i))){
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome(String s){
        StringBuilder temp = new StringBuilder(s);
        return  s.equals(temp.reverse().toString());
    }
}
