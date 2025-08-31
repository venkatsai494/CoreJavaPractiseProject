package solution.leetcode;

import java.util.Arrays;

public class DetermineIfTwoStringsAreClose {
    public static void main(String[] args) {
        DetermineIfTwoStringsAreClose d = new DetermineIfTwoStringsAreClose();
        System.out.println(d.closeStrings("abc", "bca")); //true
        System.out.println(d.closeStrings("a", "aa")); //false
        System.out.println(d.closeStrings("cabbba", "abbccc")); //true
        System.out.println(d.closeStrings("cabbba", "aabbss")); //false
        System.out.println(d.closeStrings("uau", "ssx"));//false
    }
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        int [] word1int = new int[26];
        int [] word2int = new int[26];
        for(int i = 0; i<word1.length(); i++){
            word1int[word1.charAt(i) - 97]++;
        }
        for(int i = 0; i<word2.length(); i++){
            word2int[word2.charAt(i) - 97]++;
        }
        for(int i = 0; i<word1int.length; i++){
            if((word1int[i] == 0 && word2int[i] != 0)||(word1int[i] != 0 && word2int[i] == 0)) return false;
        }
        Arrays.sort(word1int);
        Arrays.sort(word2int);
        for(int i = 0; i<word1int.length; i++){
            if(word1int[i] != word2int[i]) return false;
        }
        return true;
    }
}
