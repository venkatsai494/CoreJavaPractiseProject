package solution.leetcode;

public class WeightedWordMapping {
    public static void main(String[] args) {
        WeightedWordMapping solution = new WeightedWordMapping();
        System.out.println(solution.mapWordWeights(new String[]{"abcd","def","xyz"}, new int[]{5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2}));
        System.out.println(solution.mapWordWeights(new String[]{"a","b","c"}, new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}));
        System.out.println(solution.mapWordWeights(new String[]{"abcd"}, new int[]{7,5,3,4,3,5,4,9,4,2,2,7,10,2,5,10,6,1,2,2,4,1,3,4,4,5}));
        System.out.println(solution.mapWordWeights(new String[]{"abc","bcd"}, new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26}));
    }
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String s: words){
            int sum = 0;
            for(char c: s.toCharArray()){
                sum = sum + weights[c-'a'];
            }
            sum = sum % 26;
            sb.append((char)(122-sum));
        }
        return sb.toString();
    }
}
