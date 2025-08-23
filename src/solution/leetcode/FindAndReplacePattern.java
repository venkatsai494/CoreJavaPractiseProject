package solution.leetcode;

import java.util.*;

public class FindAndReplacePattern {
    public static void main(String[] args) {
        FindAndReplacePattern solution = new FindAndReplacePattern();
        System.out.println(solution.findAndReplacePattern(new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb"));
        System.out.println(solution.findAndReplacePattern(new String[]{"a","b","c"}, "a"));
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for(String word: words){
            if(isIsomorphic(word, pattern)) result.add(word);
        }
        return result;
    }

    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character, Character> hashMap = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(hashMap.containsKey(s.charAt(i))){
                if(hashMap.get(s.charAt(i)) != t.charAt(i)) return false;
            }
            else if(hashMap.containsValue(t.charAt(i))){
                return false;
            }
            else{
                hashMap.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
