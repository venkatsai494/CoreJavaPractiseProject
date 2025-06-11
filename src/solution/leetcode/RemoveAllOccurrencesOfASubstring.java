package solution.leetcode;

public class RemoveAllOccurrencesOfASubstring {
    public static void main(String[] args) {
        RemoveAllOccurrencesOfASubstring solution = new RemoveAllOccurrencesOfASubstring();
        System.out.println(solution.removeOccurrences("daabcbaabcbc", "abc")); // "dab"
        System.out.println(solution.removeOccurrences("axxxxyyyyb", "xy")); // "ab"
        System.out.println(solution.removeOccurrences("hello", "ll")); // "heo"
        System.out.println(solution.removeOccurrences("aabababa", "aba")); // "ba"
    }
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            s = s.replaceFirst(part, "");
        }
        return s;
    }
}
