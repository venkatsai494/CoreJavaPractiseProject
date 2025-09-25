package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {
    public static void main(String[] args) {
        FindCommonCharacters obj = new FindCommonCharacters();
        System.out.println(obj.commonChars(new String [] {"bella","label","roller"}));
        System.out.println(obj.commonChars(new String [] {"cool","lock","cook"}));
    }
    public List<String> commonChars(String[] words) {
        List<List<Integer>> listOfList = new ArrayList<>();
        for(String word: words){
            List<Integer> list = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0));
            for(char c: word.toCharArray()){
                list.set((c-97),list.get(c-97)+1);
            }
            listOfList.add(list);
        }
        int [] minOccurence = new int[26];
        for(int i = 0; i<minOccurence.length; i++){
            int min = listOfList.get(0).get(i);
            for(List<Integer> list : listOfList){
                min = Math.min(min, list.get(i));
            }
            minOccurence[i] = min;
        }
        List<String> result = new ArrayList<>();
        for(int i = 0; i<minOccurence.length; i++){
            while(minOccurence[i]>0){
                result.add(String.valueOf((char)(i+'a')));
                minOccurence[i]--;
            }
        }
        return result;
    }
}
