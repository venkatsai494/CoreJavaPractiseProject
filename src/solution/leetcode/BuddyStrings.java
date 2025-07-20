package solution.leetcode;

import java.util.Arrays;

public class BuddyStrings {
    public static void main(String[] args) {
        BuddyStrings buddyStrings = new BuddyStrings();
        System.out.println(buddyStrings.buddyStrings("ab", "ba")); // true
        System.out.println(buddyStrings.buddyStrings("ab", "ab")); // false
        System.out.println(buddyStrings.buddyStrings("aa", "aa")); // true
        System.out.println(buddyStrings.buddyStrings("aaaaaaabc", "aaaaaaacb")); // true
        System.out.println(buddyStrings.buddyStrings("ba", "aa")); // false
        System.out.println(buddyStrings.buddyStrings("abab", "abab")); // true
        System.out.println(buddyStrings.buddyStrings("abcd", "badc")); // false
        System.out.println(buddyStrings.buddyStrings("abcaa", "abcbb")); // false
    }
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        int [] sint = new int[26];
        int [] goalint = new int[26];
        for(int i = 0; i<goal.length(); i++){
            goalint[goal.charAt(i) - 97]++;
        }
        for(int i = 0; i<s.length(); i++){
            sint[s.charAt(i) - 97]++;
        }
        for(int i = 0; i<sint.length; i++){
            if(goalint[i] != sint[i]) return false;
        }
        int smaxcount = Arrays.stream(sint).max().getAsInt();
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)) count++;
        }
        return ((smaxcount>1 && count == 0) || count == 2);
    }
}
