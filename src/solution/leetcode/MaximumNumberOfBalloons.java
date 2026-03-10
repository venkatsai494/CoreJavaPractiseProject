package solution.leetcode;

import java.util.Arrays;

public class MaximumNumberOfBalloons {
    public static void main(String[] args) {
        MaximumNumberOfBalloons maximumNumberOfBalloons = new MaximumNumberOfBalloons();
        System.out.println(maximumNumberOfBalloons.maxNumberOfBalloons("nlaebolko"));
        System.out.println(maximumNumberOfBalloons.maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println(maximumNumberOfBalloons.maxNumberOfBalloons("leetcode"));
    }
    public int maxNumberOfBalloons(String text) {
        int[] alphabet = new int[26];
        for(int i = 0; i<text.length(); i++){
            alphabet[text.charAt(i)-'a']++;
        }
        int[] occurence = new int[5];
        occurence[0] = alphabet[1];
        occurence[1] = alphabet[0];
        occurence[2] = alphabet[11]/2;
        occurence[3] = alphabet[14]/2;
        occurence[4] = alphabet[13];
        Arrays.sort(occurence);
        return occurence[0];
    }
}
