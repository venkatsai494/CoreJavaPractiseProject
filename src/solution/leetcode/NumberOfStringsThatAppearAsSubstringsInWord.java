package solution.leetcode;

public class NumberOfStringsThatAppearAsSubstringsInWord {
    public static void main(String[] args) {
        NumberOfStringsThatAppearAsSubstringsInWord ns = new NumberOfStringsThatAppearAsSubstringsInWord();
        String[] patterns = {"a", "abc", "bc", "d"};
        String word = "abc";
        System.out.println(ns.numOfStrings(patterns, word));
    }
    public int numOfStrings(String[] patterns, String word) {
        int output = 0;
        for(String pattern: patterns){
            if(word.contains(pattern))  output++;
        }
        return output;
    }
}
