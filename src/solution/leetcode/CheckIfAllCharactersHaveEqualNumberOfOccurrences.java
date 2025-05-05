package solution.leetcode;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public static void main(String[] args) {
        CheckIfAllCharactersHaveEqualNumberOfOccurrences cec = new CheckIfAllCharactersHaveEqualNumberOfOccurrences();
        System.out.println(cec.areOccurrencesEqual("abacbc")); // true
        System.out.println(cec.areOccurrencesEqual("aaabb")); // false
        System.out.println(cec.areOccurrencesEqual("aabbcc")); // true
        System.out.println(cec.areOccurrencesEqual("abcabc")); // true
        System.out.println(cec.areOccurrencesEqual("aabbccdd")); // true
    }
    public boolean areOccurrencesEqual(String s) {
        int count = numberOfOccurences(s,s.charAt(0));
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != '0' && numberOfOccurences(s,s.charAt(i)) != count){
                return false;
            }
            s = s.replace(s.charAt(i), '0');
        }
        return true;
    }
    public int numberOfOccurences(String s, char c){
        int output = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == c) output++;
        }
        return output;
    }
}
