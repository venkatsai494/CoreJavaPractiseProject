package solution.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LexicographicalNumbers {
    public static void main(String[] args) {
        LexicographicalNumbers ln = new LexicographicalNumbers();
        System.out.println(ln.lexicalOrder(13));
        System.out.println(ln.lexicalOrder(2));
    }
    public List<Integer> lexicalOrder(int n) {
        List<String> strList = new ArrayList<>();
        int a = 1;
        for(int i =0; i<n; i++){
            strList.add(String.valueOf(a));
            a++;
        }
        Collections.sort(strList);
        List<Integer> intList = new ArrayList<>();
        for(String s: strList){
            intList.add(Integer.parseInt(s));
        }
        return intList;
    }
}
