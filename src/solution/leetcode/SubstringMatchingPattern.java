package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SubstringMatchingPattern {
    public static void main(String[] args) {
        SubstringMatchingPattern smp = new SubstringMatchingPattern();
        System.out.println(smp.hasMatch("leetcode", "ee*e"));
        System.out.println(smp.hasMatch("car", "c*v"));
        System.out.println(smp.hasMatch("luck", "u*"));
        System.out.println(smp.hasMatch("ojjju", "*o"));
        System.out.println(smp.hasMatch("ckckkk", "ck*kc"));
    }
    public boolean hasMatch(String s, String p) {
        String [] arr = p.split("\\*");
        List<String> list = new ArrayList<>();
        for(String i: arr){
            if(!i.isEmpty()){
                list.add(i);
            }
        }
        String[] arrPattern = new String[list.size()];
        for(int i = 0; i<list.size();i++){
            arrPattern[i] = list.get(i);
        }
        if(arrPattern.length == 2){
            if(s.contains(arrPattern[0]) && s.contains(arrPattern[1])){
                return s.indexOf(arrPattern[0])+arrPattern[0].length()-1<s.lastIndexOf(arrPattern[1]);
            }
            else{
                return false;
            }
        }
        else if(arrPattern.length == 1){
            return s.contains(arrPattern[0]);
        }
        else{
            return true;
        }
    }
}
