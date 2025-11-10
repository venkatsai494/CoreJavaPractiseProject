package solution.leetcode;

import java.util.Arrays;

public class IncreasingDecreasingString {
    public static void main(String[] args) {
        IncreasingDecreasingString obj = new IncreasingDecreasingString();
        System.out.println(obj.sortString("aaaabbbbcccc")); // "abccbaabccba"
        System.out.println(obj.sortString("rat")); // "art"
        System.out.println(obj.sortString("leetcode")); // "cdelotee"
        System.out.println(obj.sortString("ggggggg")); // "ggggggg"
        System.out.println(obj.sortString("spo")); // "ops"
    }
    public String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        int [] sint = new int[26];
        for(int i = 0; i<s.length(); i++){
            sint[s.charAt(i) - 97]++;
        }
        while(Arrays.stream(sint).max().getAsInt()>0){
            for(int i = 0; i<sint.length; i++){
                if(sint[i]>0){
                    sb.append((char)(i+97));
                    sint[i]--;
                }
            }
            for(int i = sint.length-1; i>=0; i--){
                if(sint[i]>0){
                    sb.append((char)(i+97));
                    sint[i]--;
                }
            }
        }
        return sb.toString();
    }
}
