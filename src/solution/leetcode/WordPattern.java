package solution.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        WordPattern solution = new WordPattern();
        System.out.println(solution.wordPattern("abba", "dog cat cat dog")); // true
        System.out.println(solution.wordPattern("abba", "dog cat cat fish")); // false
        System.out.println(solution.wordPattern("aaaa", "dog cat cat dog")); // false
        System.out.println(solution.wordPattern("abba", "dog dog dog dog")); // false
    }
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(arr.length != pattern.length()) return false;
        Map<String, Character> hashMap = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(hashMap.containsKey(arr[i])){
                if(hashMap.get(arr[i]) != pattern.charAt(i)) return false;
            }
            else if(hashMap.containsValue(pattern.charAt(i))){
                return false;
            }
            else{
                hashMap.put(arr[i], pattern.charAt(i));
            }
        }
        return true;
    }
}
