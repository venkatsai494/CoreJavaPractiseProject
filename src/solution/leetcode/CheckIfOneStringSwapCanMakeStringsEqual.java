package solution.leetcode;

public class CheckIfOneStringSwapCanMakeStringsEqual {
    public static void main(String[] args) {
        CheckIfOneStringSwapCanMakeStringsEqual c = new CheckIfOneStringSwapCanMakeStringsEqual();
        System.out.println(c.areAlmostEqual("bank", "kanb")); //true
        System.out.println(c.areAlmostEqual("attack", "defend")); //false
        System.out.println(c.areAlmostEqual("kelb", "kelb")); //true
    }
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        if(s1.equals(s2)) return true;
        int count = 0;
        int [] s1int = new int[26];
        int [] s2int = new int[26];
        for(int i = 0; i<s1.length(); i++){
            s1int[s1.charAt(i) - 97]++;
        }
        for(int i = 0; i<s2.length(); i++){
            s2int[s2.charAt(i) - 97]++;
        }
        for(int i = 0; i<s1int.length; i++){
            if(s1int[i] != s2int[i]) return false;
        }
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)) count++;
        }
        return count == 2;
    }

}
