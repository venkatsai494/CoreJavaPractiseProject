package solution.leetcode;

public class SplitAStringInBalancedStrings {
    public static void main(String[] args) {
        SplitAStringInBalancedStrings splitAStringInBalancedStrings = new SplitAStringInBalancedStrings();
        System.out.println(splitAStringInBalancedStrings.balancedStringSplit("RLRRLLRLRL"));
        System.out.println(splitAStringInBalancedStrings.balancedStringSplit("RLRRRLLRLL"));
        System.out.println(splitAStringInBalancedStrings.balancedStringSplit("LLLLRRRR"));
        System.out.println(splitAStringInBalancedStrings.balancedStringSplit("RLLLLRRRLR"));
    }
    public int balancedStringSplit(String s) {
        int count = 0;
        int rc = 0;
        int lc = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='R') rc++;
            else lc++;
            if(rc==lc) count++;
        }
        return count;
    }
}
