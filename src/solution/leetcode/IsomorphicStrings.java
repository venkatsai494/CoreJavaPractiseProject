package solution.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        IsomorphicStrings solution = new IsomorphicStrings();
        System.out.println(solution.isIsomorphic("agg", "add")); // Output: true
        System.out.println(solution.isIsomorphic("foo", "bar")); // Output: false
        System.out.println(solution.isIsomorphic("paper", "title")); // Output: true
        System.out.println(solution.isIsomorphic("ada", "abb")); // false
        System.out.println(solution.isIsomorphic("abc", "abb"));//false
        System.out.println(solution.isIsomorphic("deq", "abb"));//false
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
