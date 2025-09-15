package solution.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        SortCharactersByFrequency s = new SortCharactersByFrequency();
        System.out.println(s.frequencySort("tree")); //eert
        System.out.println(s.frequencySort("cccaaa")); //cccaaa or aaaccc
        System.out.println(s.frequencySort("Aabb")); //bbAa or bbaA
    }
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> map.get(o2)-map.get(o1));
        for(char c: list){
            int temp = map.get(c);
            while(temp>0){
                sb.append(c);
                temp--;
            }
        }
        return sb.toString();
    }
}
