package solution.leetcode;

public class MinimumStringLengthAfterRemovingSubstrings {
    public static void main(String[] args) {
        MinimumStringLengthAfterRemovingSubstrings ms = new MinimumStringLengthAfterRemovingSubstrings();
        System.out.println(ms.minLength("ABFCACDB"));
        System.out.println(ms.minLength("ACBBD"));
        System.out.println(ms.minLength("ACDE"));
        System.out.println(ms.minLength("ABABABAB"));
        System.out.println(ms.minLength("CDCDCDCD"));
    }
    public int minLength(String s) {
        while(s.contains("AB") || s.contains("CD")){
            s = s.replace("AB", "").replace("CD", "");
        }
        return s.length();
    }
}
