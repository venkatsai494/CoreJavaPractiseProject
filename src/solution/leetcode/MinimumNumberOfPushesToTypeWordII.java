package solution.leetcode;

import java.util.Arrays;

public class MinimumNumberOfPushesToTypeWordII {
    public static void main(String[] args) {
        MinimumNumberOfPushesToTypeWordII solution = new MinimumNumberOfPushesToTypeWordII();
        System.out.println(solution.minimumPushes("abc")); // Output: 3
        System.out.println(solution.minimumPushes("aaabbbccc")); // Output: 9
        System.out.println(solution.minimumPushes("abcde")); // Output: 5
        System.out.println(solution.minimumPushes("xyzxyzxyzxyz")); // Output: 12
        System.out.println(solution.minimumPushes("aabbccddeeffgghhiiiiii")); // Output: 24
    }
    public int minimumPushes(String word) {
        int result = 0;
        int multiplier = 1;
        int[] alphabet = new int[26];
        for(int i = 0;i<word.length();i++){
            alphabet[word.charAt(i)-'a']++;
        }
        Arrays.sort(alphabet);
        for(int i = 25; i>=0; i--){
            result += alphabet[i]*multiplier;
            if(alphabet[i]==0) break;
            if(i == 18 || i == 10 || i == 2){
                multiplier++;
            }
        }
        return result;
    }
}
