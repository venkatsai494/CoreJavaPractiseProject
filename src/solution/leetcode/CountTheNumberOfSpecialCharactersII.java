package solution.leetcode;

public class CountTheNumberOfSpecialCharactersII {
    public static void main(String[] args) {
        CountTheNumberOfSpecialCharactersII solution = new CountTheNumberOfSpecialCharactersII();
        System.out.println(solution.numberOfSpecialChars("aAbBcC")); // Output: 3
        System.out.println(solution.numberOfSpecialChars("aAabB")); // Output: 2
        System.out.println(solution.numberOfSpecialChars("abc")); // Output: 0
        System.out.println(solution.numberOfSpecialChars("AbBCab")); // Output: 0
    }
    public int numberOfSpecialChars(String word) {
        int count = 0;
        int[] arr = new int[58];
        for(int i = 0; i<word.length(); i++){
            arr[word.charAt(i) - 65]++;
        }
        for(int i = 0; i<26; i++){
            if((arr[i]!=0 && arr[i+32]!=0)&&(word.lastIndexOf((char)(i+97))<word.indexOf((char)(i+65)))) count++;
        }
        return count;
    }
}
