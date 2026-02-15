package solution.leetcode;

import java.util.Arrays;

public class MinimumDeletionsForAtMostKDistinctCharacters {
    public static void main(String[] args) {
        	MinimumDeletionsForAtMostKDistinctCharacters solution = new MinimumDeletionsForAtMostKDistinctCharacters();
            System.out.println(solution.minDeletion("abc", 2));
            System.out.println(solution.minDeletion("aabbb", 2));
            System.out.println(solution.minDeletion("yyyzz", 1));
    }
    public int minDeletion(String s, int k) {
        int result = 0;
        int [] alphabetcount = new int[26];
        for(int i = 0; i<s.length(); i++){
            alphabetcount[s.charAt(i) - 'a']++;
        }
        Arrays.sort(alphabetcount);
        for(int i = 0; i<alphabetcount.length; i++){
            result = result + alphabetcount[i];
            if(i+k==alphabetcount.length-1){
                break;
            }
        }
        return result;
    }
}
