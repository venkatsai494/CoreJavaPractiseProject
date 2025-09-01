package solution.leetcode;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram {
    public static void main(String[] args) {
        MinimumNumberOfStepsToMakeTwoStringsAnagram m = new MinimumNumberOfStepsToMakeTwoStringsAnagram();
        System.out.println(m.minSteps("bab", "aba")); //1
        System.out.println(m.minSteps("leetcode", "practice")); //5
        System.out.println(m.minSteps("anagram", "mangaar")); //0
        System.out.println(m.minSteps("xxyyzz", "xxyyzz")); //0
        System.out.println(m.minSteps("friend", "family")); //4
    }
    public int minSteps(String s, String t) {
        int count = 0;
        int [] sint = new int[26];
        int [] tint = new int[26];
        for(int i = 0; i<s.length(); i++){
            sint[s.charAt(i) - 97]++;
        }
        for(int i = 0; i<t.length(); i++){
            tint[t.charAt(i) - 97]++;
        }
        for(int i = 0; i<sint.length; i++){
            if(sint[i]>tint[i]){
                count = count + (sint[i]-tint[i]);
            }
        }
        return count;
    }
}
