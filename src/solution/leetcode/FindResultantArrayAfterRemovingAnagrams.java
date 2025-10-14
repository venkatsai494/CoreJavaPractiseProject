package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class FindResultantArrayAfterRemovingAnagrams {
    public static void main(String[] args) {
        FindResultantArrayAfterRemovingAnagrams obj = new FindResultantArrayAfterRemovingAnagrams();
        System.out.println(obj.removeAnagrams(new String[]{"abba","baba","bbaa","cd","cd"})); // ["abba","cd"]
        System.out.println(obj.removeAnagrams(new String[]{"a","b","c","d","e"})); // ["a","b","c","d","e"]
        System.out.println(obj.removeAnagrams(new String[]{"a","b","a"})); // ["a","b","a"]
    }
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        result.add(words[0]);
        for(int i = 1; i<words.length; i++){
            if(!isAnagram(words[i], words[i-1])) result.add(words[i]);
        }
        return result;
    }
    public boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        char[] s1arr = s1.toCharArray();
        char[] s2arr = s2.toCharArray();
        Arrays.sort(s1arr);
        Arrays.sort(s2arr);
        for(int i = 0; i<s1arr.length; i++){
            if(s1arr[i] != s2arr[i]) return false;
        }
        return true;
    }
    public List<String> removeAnagrams1(String[] words) {
        Stack<String> tempstack = new Stack<>();
        tempstack.push(charCount(words[0]));
        List<String> result = new ArrayList<>();
        result.add(words[0]);
        for(int i = 1; i<words.length; i++){
            if(!tempstack.peek().equals(charCount(words[i]))){
                tempstack.push(charCount(words[i]));
                result.add(words[i]);
            }
        }
        return result;
    }
    public String charCount(String s){
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        for(int i = 0; i<s.length(); i++){
            arr[s.charAt(i)-97]++;
        }
        for(int i: arr){
            sb.append(i);
        }
        return sb.toString();
    }
}
