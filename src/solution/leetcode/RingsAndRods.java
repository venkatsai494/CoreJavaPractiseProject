package solution.leetcode;

import java.util.Arrays;

public class RingsAndRods {
    public static void main(String[] args) {
        RingsAndRods rar = new RingsAndRods();
        System.out.println(rar.countPoints("B0B6G0R6R0R6G9"));
        System.out.println(rar.countPoints("B0R0G0R9R0B0G0"));
        System.out.println(rar.countPoints("G4"));
    }
    public int countPoints(String rings) {
        String [] strArray = new String[10];
        Arrays.fill(strArray, "");
        int count = 0;
        for(int i = 0; i<rings.length(); i = i+2){
            strArray[rings.charAt(i+1) - '0'] = strArray[rings.charAt(i+1) - '0'] + rings.charAt(i);
        }
        for(String s: strArray){
            if(s.contains("R") && s.contains("G") && s.contains("B")) count++;
        }
        return count;
    }

}
