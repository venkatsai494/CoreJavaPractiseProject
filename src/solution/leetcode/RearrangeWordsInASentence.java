package solution.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RearrangeWordsInASentence {
    public static void main(String[] args) {
        RearrangeWordsInASentence rearrangeWordsInASentence = new RearrangeWordsInASentence();
        System.out.println(rearrangeWordsInASentence.arrangeWords("Leetcode is cool"));
        System.out.println(rearrangeWordsInASentence.arrangeWords("Keep calm and code on"));
        System.out.println(rearrangeWordsInASentence.arrangeWords("To be or not to be"));
    }
    public String arrangeWords(String text) {
        String str = text.toLowerCase();
        List<String> list = new ArrayList<>();
        Collections.addAll(list, str.split(" "));
        list.sort(Comparator.comparingInt(String::length));
        StringBuilder sb = new StringBuilder();
        sb.append(list.getFirst().substring(0, 1).toUpperCase()).append(list.getFirst().substring(1));
        for(int i = 1; i<list.size(); i++){
            sb.append(" ").append(list.get(i));
        }
        return sb.toString().trim();
    }
}
