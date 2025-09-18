package solution.leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        UniqueMorseCodeWords umcw = new UniqueMorseCodeWords();
        System.out.println(umcw.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));//2
        System.out.println(umcw.uniqueMorseRepresentations(new String[]{"a"}));//1
    }
    public int uniqueMorseRepresentations(String[] words) {
        String [] arr = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> codes = new HashSet<>();
        for(String word: words){
            StringBuilder sb = new StringBuilder();
            for(char c: word.toCharArray()){
                sb.append(arr[c-97]);
            }
            codes.add(sb.toString());
        }
        return codes.size();
    }
}
