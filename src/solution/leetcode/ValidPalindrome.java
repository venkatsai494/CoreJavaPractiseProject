package solution.leetcode;

public class ValidPalindrome {

    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s) {
        String temp = s.replaceAll("[^a-zA-Z0-9]+","").toLowerCase();
        return checkForPalindrone(temp);
    }

    public boolean checkForPalindrone(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return (sb.toString().equals(str));
    }
}
