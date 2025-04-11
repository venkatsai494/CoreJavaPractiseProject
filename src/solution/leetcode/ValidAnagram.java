package solution.leetcode;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram("anagram", "nagaram"));
        System.out.println(va.isAnagram("cat", "car"));
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())   return false;
        char [] sArr = s.toCharArray();
        char [] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        String s1 = new String(sArr);
        String t1 = new String(tArr);
        if(!(s1.equals(t1))) return false;

        return true;
    }
}
