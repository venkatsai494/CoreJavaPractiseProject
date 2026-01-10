package solution.leetcode;

public class CountPairsOfSimilarStrings {
    public static void main(String[] args) {
        CountPairsOfSimilarStrings cpss = new CountPairsOfSimilarStrings();
        System.out.println(cpss.similarPairs(new String[]{"aba","aabb","abcd","bac","aabc"})); // Output: 2
        System.out.println(cpss.similarPairs(new String[]{"aabb","ab","ba"})); // Output: 3
        System.out.println(cpss.similarPairs(new String[]{"nba","cba","dba"})); // Output: 0
    }
    public int similarPairs(String[] words) {
        int count = 0;
        String[] temp = new String[words.length];
        for(int i = 0; i<words.length; i++){
            temp[i] = characterInAString(words[i]);
        }
        for(int i = 0; i<temp.length; i++){
            for(int j = i+1; j<temp.length; j++){
                if(temp[i].equals(temp[j])) count++;
            }
        }
        return count;
    }
    public String characterInAString(String a){
        int[] alphabet = new int[26];
        for(char c: a.toCharArray()){
            alphabet[c-97]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<alphabet.length; i++){
            if(alphabet[i]>0){
                sb.append((char)(i+97));
            }
        }
        return sb.toString();
    }
}
