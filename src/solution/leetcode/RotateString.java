package solution.leetcode;

public class RotateString {

    public static void main(String[] args) {
        RotateString rs = new RotateString();
        System.out.println(rs.rotateString("abcde", "cdeab")); // true
        System.out.println(rs.rotateString("abcde", "abced")); // false
        System.out.println(rs.rotateString("abcde", "abcde")); // true
        System.out.println(rs.rotateString("abcde", "eabcd")); // true
        System.out.println(rs.rotateString("", "")); // true
    }
    public boolean rotateString(String s, String goal) {
        return (s.length() == goal.length()) && ((s+s).contains(goal));
    }
}
