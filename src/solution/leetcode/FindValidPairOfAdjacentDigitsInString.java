package solution.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class FindValidPairOfAdjacentDigitsInString {
    public static void main(String[] args) {
        FindValidPairOfAdjacentDigitsInString obj = new FindValidPairOfAdjacentDigitsInString();
        System.out.println(obj.findValidPair("2523533")); // "23"
        System.out.println(obj.findValidPair("221")); // "21"
        System.out.println(obj.findValidPair("22")); // ""
        System.out.println(obj.findValidPair("1522")); // ""
        System.out.println(obj.findValidPair("24314474")); // "14"
        System.out.println(obj.findValidPair("93723239")); // "23"
        System.out.println(obj.findValidPair("425555251")); // "25"
        System.out.println(obj.findValidPair("4833931444")); // "31"

    }
    public String findValidPair(String s) {
        List<Character> validIntegersList = new ArrayList<>();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        for(char c: map.keySet()){
            if(map.get(c) == (c-'0')){
                validIntegersList.add(c);
            }
        }
        List<Character> list = validIntegersList.stream().distinct().collect(Collectors.toList());
        for(int i = 0; i<s.length()-1; i++){
            if((s.charAt(i) != s.charAt(i+1))&&list.contains(s.charAt(i)) && list.contains(s.charAt(i+1))){
                return String.valueOf(s.charAt(i))+(s.charAt(i+1));
            }
        }
        return "";
    }
}
