package solution.leetcode;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        MergeStringsAlternately msa = new MergeStringsAlternately();
        System.out.println(msa.mergeAlternately("abc", "pqrst"));
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<word1.length() || i<word2.length(); i++){
            if(i >= word1.length()){
                sb = sb.append(word2.charAt(i));
            }
            else if(i >= word2.length()){
                sb = sb.append(word1.charAt(i));
            }
            else{
                sb = sb.append(word1.charAt(i)).append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}
