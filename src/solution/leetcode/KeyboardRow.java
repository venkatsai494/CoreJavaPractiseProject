package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {
    public static void main(String[] args) {
        KeyboardRow kr = new KeyboardRow();
        System.out.println(Arrays.toString(kr.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
        System.out.println(Arrays.toString(kr.findWords(new String[]{"adsdf","sfd"})));
        System.out.println(Arrays.toString(kr.findWords(new String[]{"omk"})));
        System.out.println(Arrays.toString(kr.findWords(new String[]{"Venkat", "Sai", "Ratan", "Kumar", "Parpelli"})));
        System.out.println(Arrays.toString(kr.findWords(new String[]{"you", "were", "there"})));
        System.out.println(Arrays.toString(kr.findWords(new String[]{"were", "you", "kajal", "working", "in", "cbn"})));
    }
    public String[] findWords(String[] words) {
        String [] keyboard3RowsArr = new String[]{"qwertyuiop","asdfghjkl", "zxcvbnm"};
        List<String> resultList = new ArrayList<>();
        for(String word: words){
            String s = word.toLowerCase();
            if(keyboard3RowsArr[0].contains(String.valueOf(s.charAt(0))) && isPossible(s, keyboard3RowsArr[0])){
                resultList.add(word);
            }
            if(keyboard3RowsArr[1].contains(String.valueOf(s.charAt(0))) && isPossible(s, keyboard3RowsArr[1])){
                resultList.add(word);
            }
            if(keyboard3RowsArr[2].contains(String.valueOf(s.charAt(0))) && isPossible(s, keyboard3RowsArr[2])){
                resultList.add(word);
            }
        }

        String [] result = new String[resultList.size()];
        for(int i = 0; i<result.length; i++){
            result[i] = resultList.get(i);
        }
        return result;
    }
    public boolean isPossible(String word, String keyboard){
        for(int i = 0; i<word.length(); i++){
            if(!keyboard.contains(String.valueOf(word.charAt(i)).toLowerCase())){
                return false;
            }
        }
        return true;
    }
}
