package solution.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        ReverseVowelsOfAString solution = new ReverseVowelsOfAString();
        System.out.println(solution.reverseVowels("hello")); // holle
        System.out.println(solution.reverseVowels("IceCreAm")); // AceCreIm
        System.out.println(solution.reverseVowels("leetcode")); // leotcede
    }
    public String reverseVowels(String s) {
        List<Integer> indexList = new ArrayList<>();
        List<Character> characterList = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                characterList.add(s.charAt(i));
                indexList.add(i);
            }
        }
        Collections.reverse(characterList);
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i<indexList.size(); i++){
            sb.setCharAt(indexList.get(i), characterList.get(i));
        }
        return sb.toString();
    }
}
