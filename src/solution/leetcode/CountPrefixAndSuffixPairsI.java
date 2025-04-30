package solution.leetcode;

public class CountPrefixAndSuffixPairsI {
    public static void main(String[] args) {
        CountPrefixAndSuffixPairsI cpsi = new CountPrefixAndSuffixPairsI();
        System.out.println(cpsi.countPrefixSuffixPairs(new String[]{"a","aba","ababa","aa"})); // 4
        System.out.println(cpsi.countPrefixSuffixPairs(new String[]{"pa","papa","ma","mama"})); // 2
        System.out.println(cpsi.countPrefixSuffixPairs(new String[]{"abab","ab"})); // 0
        System.out.println(cpsi.countPrefixSuffixPairs(new String[]{"abc", "def", "ghi"})); // 0
    }
    public int countPrefixSuffixPairs(String[] words) {
        int output = 0;
        for(int i = 0; i< words.length-1; i++){
            for(int j = i+1; j<words.length; j++){
                if(words[j].startsWith(words[i]) && words[j].endsWith(words[i])) output++;
            }
        }
        return output;
    }
}
