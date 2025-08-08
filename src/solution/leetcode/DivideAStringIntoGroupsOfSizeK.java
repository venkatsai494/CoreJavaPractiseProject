package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideAStringIntoGroupsOfSizeK {
    public static void main(String[] args) {
        DivideAStringIntoGroupsOfSizeK ds = new DivideAStringIntoGroupsOfSizeK();
        System.out.println(Arrays.toString(ds.divideString("abcdefghi", 3, 'x')));
        System.out.println(Arrays.toString(ds.divideString("abcdefghij", 3, 'x')));
    }
    public String[] divideString(String s, int k, char fill) {
        int need = s.length()%k==0?0:k-s.length()%k;
        StringBuilder sb = new StringBuilder(s);
        while(need>0){
            sb.append(fill);
            need--;
        }
        s = sb.toString();
        List<String> list = new ArrayList<>();
        int index = 0;
        while(index<s.length()){
            list.add(s.substring(index, index+k));
            index = index+k;
        }
        String[] result = new String[list.size()];
        for(int i = 0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
