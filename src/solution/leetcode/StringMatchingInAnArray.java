package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {
    public static void main(String[] args) {
        StringMatchingInAnArray stringMatchingInAnArray = new StringMatchingInAnArray();
        System.out.println(stringMatchingInAnArray.stringMatching(new String[]{"mass","as","hero","superhero"}));
        System.out.println(stringMatchingInAnArray.stringMatching(new String[]{"leetcode","et","code"}));
        System.out.println(stringMatchingInAnArray.stringMatching(new String[]{"blue","green","bu"}));
    }
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i<words.length; i++){
            for(int j = i+1; j< words.length; j++){
                if(words[i].contains(words[j])) result.add(words[j]);
                else if(words[j].contains(words[i])) result.add(words[i]);
            }
        }
        return result.stream().distinct().toList();
    }
}
