package solution.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        ReverseOnlyLetters rol = new ReverseOnlyLetters();
        System.out.println(rol.reverseOnlyLetters("ab-cd"));
        System.out.println(rol.reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(rol.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
    public String reverseOnlyLetters(String s) {
        List<Character> list = new ArrayList<>();
        for(Character c: s.toCharArray()){
            if(Character.isLetter(c)) list.add(c);
        }
        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for(int i = 0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                sb.append(list.get(k));
                k++;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
