package solution.leetcode;

import java.util.*;

public class SortVowelsByFrequency {
    public static void main(String[] args) {
        SortVowelsByFrequency solution = new SortVowelsByFrequency();
        System.out.println(solution.sortVowels("leetcode"));
        System.out.println(solution.sortVowels("aeiaaioooa"));
        System.out.println(solution.sortVowels("baeiou"));
    }
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> vowels = new LinkedHashMap<Character, Integer>();
        for(char c: s.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                if(vowels.containsKey(c)){
                    vowels.put(c,vowels.get(c)+1);
                }
                else{
                    vowels.put(c,1);
                }
            }
        }
        List<Character> list = new ArrayList<Character>(vowels.keySet());
        list.sort((a,b)-> vowels.get(b)-vowels.get(a));
        int i = 0;
        for(char c: s.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                if(vowels.get(list.get(i))>0){
                    sb.append(list.get(i));
                    vowels.put(list.get(i),vowels.get(list.get(i))-1);
                }
                else{
                    i++;
                    sb.append(list.get(i));
                    vowels.put(list.get(i),vowels.get(list.get(i))-1);
                }
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
