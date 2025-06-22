package solution.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RelativeRanks {
    public static void main(String[] args) {
        RelativeRanks rr = new RelativeRanks();
        System.out.println(Arrays.toString(rr.findRelativeRanks(new int[]{5, 4, 3, 2, 1})));
        System.out.println(Arrays.toString(rr.findRelativeRanks(new int[]{10, 3, 8, 9, 4})));
        System.out.println(Arrays.toString(rr.findRelativeRanks(new int[]{1})));
    }
    public String[] findRelativeRanks(int[] score) {
        String[] output = new String[score.length];
        List<Integer> temp  = Arrays.stream(score).boxed().sorted((o1, o2) -> o2-o1).collect(Collectors.toList());
        for(int i = 0 ; i<score.length; i++){
            for(int j = 0; j<temp.size(); j++){
                if(score[i] == temp.get(j)){
                    if(j == 0){
                        output[i] = "Gold Medal";
                    }
                    else if(j == 1){
                        output[i] = "Silver Medal";
                    }
                    else if(j == 2){
                        output[i] = "Bronze Medal";
                    }
                    else{
                        output[i] = String.valueOf(j+1);
                    }
                }
            }
        }
        return output;
    }
}
