package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumNumberOfPairsInArray {
    public static void main(String[] args) {
        MaximumNumberOfPairsInArray m = new MaximumNumberOfPairsInArray();
        System.out.println(Arrays.toString(m.numberOfPairs(new int[]{1,3,2,1,3,2,2}))); //3,1
        System.out.println(Arrays.toString(m.numberOfPairs(new int[]{1,1}))); //1,0
        System.out.println(Arrays.toString(m.numberOfPairs(new int[]{0}))); //0,1
    }
    public int[] numberOfPairs(int[] nums) {
        int pair = 0;
        int [] result = new int[2];
        List<Integer> numList = new ArrayList<>();
        for(int num: nums){
            numList.add(num);
        }
        Collections.sort(numList);
        for(int i = 0; i<numList.size()-1; i++){
            if(numList.get(i).equals(numList.get(i+1))){
                pair++;
                numList.remove(i+1);
                numList.remove(i);
                i--;
            }
        }
        result[0] = pair;
        result[1] = numList.size();
        return result;
    }
}
