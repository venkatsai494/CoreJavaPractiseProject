package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public static void main(String[] args) {
        PartitionLabels solution = new PartitionLabels();
        System.out.println(solution.partitionLabels("ababcbacadefegdehijhklij")); // [9,7,8]
        System.out.println(solution.partitionLabels("eccbbbbdec")); // [10]
    }
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int k;
        while(!s.isEmpty()){
            k = s.indexOf(s.charAt(s.length()-1));
            for(int i = s.length()-1; i>=k; i--){
              if(s.indexOf(s.charAt(i))<k){
                  k = s.indexOf(s.charAt(i));
              }
            }
            result.add(s.length()-k);
            s = s.substring(0,k);
        }
        return result.reversed();
    }
}
