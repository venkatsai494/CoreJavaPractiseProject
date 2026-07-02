package solution.leetcode;

import java.util.HashSet;
import java.util.Set;

public class MaximumSubstringsWithDistinctStart {
    public static void main(String[] args) {
        MaximumSubstringsWithDistinctStart maximumSubstringsWithDistinctStart = new MaximumSubstringsWithDistinctStart();
        System.out.println(maximumSubstringsWithDistinctStart.maxDistinct("abacaba"));
        System.out.println(maximumSubstringsWithDistinctStart.maxDistinct("ssssss"));
    }
    public int maxDistinct(String s) {
        Set<Character> characterSet = new HashSet<>();
        for(char c: s.toCharArray()){
            characterSet.add(c);
        }
        return characterSet.size();
    }
}
