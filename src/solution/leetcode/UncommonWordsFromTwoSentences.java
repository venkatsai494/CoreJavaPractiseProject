package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UncommonWordsFromTwoSentences {
    public static void main(String[] args) {
        UncommonWordsFromTwoSentences solution = new UncommonWordsFromTwoSentences();
        System.out.println(Arrays.toString(solution.uncommonFromSentences("this apple is sweet", "this apple is sour")));
        System.out.println(Arrays.toString(solution.uncommonFromSentences("apple apple", "banana")));
    }
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> resultList = new ArrayList<>();
        String s = s1 + " " + s2;
        String [] arr = s.split(" ");
        for(String i : arr){
            int count = 0;
            for(String j: arr){
                if(i.equals(j)) count++;
            }
            if(count==1) resultList.add(i);
        }
        String[] result = new String[resultList.size()];
        for(int i = 0; i<resultList.size(); i++){
            result[i] = resultList.get(i);
        }
        return result;
    }
}
