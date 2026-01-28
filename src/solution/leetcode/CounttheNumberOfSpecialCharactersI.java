package solution.leetcode;

public class CounttheNumberOfSpecialCharactersI {
    public static void main(String[] args) {
        CounttheNumberOfSpecialCharactersI solution = new CounttheNumberOfSpecialCharactersI();
        System.out.println(solution.numberOfSpecialChars("aA")); // Output: 1
        System.out.println(solution.numberOfSpecialChars("abBAcC")); // Output: 3
        System.out.println(solution.numberOfSpecialChars("abc")); // Output: 0
        System.out.println(solution.numberOfSpecialChars("abBCab")); // Output: 1
    }
    public int numberOfSpecialChars(String word) {
        int count = 0;
        int[] arr = new int[58];
        for(int i = 0; i<word.length(); i++){
            arr[word.charAt(i) - 65]++;
        }
        for(int i = 0; i<26; i++){
            if(arr[i]!=0 && arr[i+32]!=0) count++;
        }
        return count;
    }
}
