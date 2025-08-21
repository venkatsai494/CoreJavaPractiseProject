package solution.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortVowelsInAString {
    public static void main(String[] args) {
        SortVowelsInAString sv = new SortVowelsInAString();
        System.out.println(sv.sortVowels("lEetcOde"));
        System.out.println(sv.sortVowels("lYmpH"));
        System.out.println(sv.sortVowels("Venkat Sai Ratan Kumar Parpelli"));
    }
    public String sortVowels(String s) {
        List<Character> characterList = new ArrayList<>();
        List<Integer> indexList = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                characterList.add(s.charAt(i));
                indexList.add(i);
            }
        }
        Collections.sort(characterList);
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i<indexList.size(); i++){
            sb.setCharAt(indexList.get(i), characterList.get(i));
        }
        return sb.toString();
    }
}
