package solution.leetcode;

public class FindMostFrequentVowelAndConsonant {
    public static void main(String[] args) {
        FindMostFrequentVowelAndConsonant f = new FindMostFrequentVowelAndConsonant();
        System.out.println(f.maxFreqSum("successes"));//6
        System.out.println(f.maxFreqSum("aeiaeia"));//3
        System.out.println(f.maxFreqSum("leetcode"));
        System.out.println(f.maxFreqSum("rhythm"));
    }
    public int maxFreqSum(String s) {
        int [] consonents = new int[26];
        int [] vowels = new int[26];
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                vowels[(s.charAt(i) - 97)]++;
            }
            else{
                consonents[(s.charAt(i) - 97)]++;
            }
        }
        return maxOfArray(vowels) + maxOfArray(consonents);
    }

    public int maxOfArray(int [] a){
        int max = 0;
        for(int i: a){
            max = Math.max(i, max);
        }
        return max;
    }
}
