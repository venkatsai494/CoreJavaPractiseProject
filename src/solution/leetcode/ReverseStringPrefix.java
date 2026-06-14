package solution.leetcode;

public class ReverseStringPrefix {
    public static void main(String[] args) {
        ReverseStringPrefix rsp = new ReverseStringPrefix();
        System.out.println(rsp.reversePrefix("abcd",2));
        System.out.println(rsp.reversePrefix("xyz",3));
        System.out.println(rsp.reversePrefix("hey",1));
    }

    public String reversePrefix(String s, int k) {
        String s1 = s.substring(0,k);
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        return sb.toString()+s.substring(k);
    }
}
