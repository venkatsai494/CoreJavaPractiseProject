package solution.leetcode;

import java.util.Arrays;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {
    public static void main(String[] args) {
        CountPairsWhoseSumIsLessThanTarget cp = new CountPairsWhoseSumIsLessThanTarget();
        System.out.println(cp.countPairs(Arrays.asList(1,2,3,4,5), 7));
    }

    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i = 0; i<nums.size()-1; i++){
            for(int j = i+1; j<nums.size(); j++){
                if((nums.get(i)+nums.get(j))<target) count++;
            }
        }
        return count;
    }
}
