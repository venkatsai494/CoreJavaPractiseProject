package solution.leetcode;

public class ConsecutiveCharacters {
    public static void main(String[] args) {
        ConsecutiveCharacters consecutiveCharacters = new ConsecutiveCharacters();
        System.out.println(consecutiveCharacters.maxPower("leetcode"));
        System.out.println(consecutiveCharacters.maxPower("abbcccddddeeeeedcba"));
    }
    public int maxPower(String s) {
        int max = 0;
        int count = 1;
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
                max = Math.max(max, count);
            }
            else{
                count = 1;
            }
        }
        return Math.max(max,1);
    }
}
