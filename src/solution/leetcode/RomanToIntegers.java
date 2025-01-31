package solution.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegers {
    public static void main(String[] args) {
        System.out.println(RomanToIntegers.romanToInt("IV"));
        System.out.println(RomanToIntegers.romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> mapping = new HashMap<>();
        mapping.put('I', 1);
        mapping.put('V', 5);
        mapping.put('X', 10);
        mapping.put('L', 50);
        mapping.put('C', 100);
        mapping.put('D', 500);
        mapping.put('M', 1000);
        int result = mapping.get(s.charAt(s.length()-1));
        if(s.length()==1){
            return result;
        }
        for(int i = s.length()-1; i>0; i--){
            if(mapping.get(s.charAt(i))>mapping.get(s.charAt(i-1))){
                result = result - mapping.get(s.charAt(i-1));
            }
            else{
                result = result + mapping.get(s.charAt(i-1));
            }

        }
        return result;
    }
}
