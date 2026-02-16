package solution.leetcode;

public class FindTheOriginalTypedStringI {
    public static void main(String[] args) {
        FindTheOriginalTypedStringI solution = new FindTheOriginalTypedStringI();
        System.out.println(solution.possibleStringCount("abbcccc"));
        System.out.println(solution.possibleStringCount("abcd"));
        System.out.println(solution.possibleStringCount("aaaa"));
    }
    public int possibleStringCount(String word) {
        int count = 1;
        if(word.length()<2) return count;
        for(int i = 1; i<word.length(); i++){
            if(word.charAt(i)==word.charAt(i-1)) count++;
        }
        return count;
    }
}
