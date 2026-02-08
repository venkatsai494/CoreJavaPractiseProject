package solution.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumInAMatrix {
    public static void main(String[] args) {
        SumInAMatrix solution = new SumInAMatrix();
        System.out.println(solution.matrixSum(new int[][]{{7,2,1},{6,4,2},{6,5,3},{3,2,1}}));
        System.out.println(solution.matrixSum(new int[][]{{1}}));
        System.out.println(solution.matrixSum(new int[][]{{1,8,16,15,12,9,15,11,18,6,16,4,9,4},{3,19,8,17,19,4,9,3,2,10,15,17,3,11},{13,10,19,20,6,17,15,14,16,8,1,17,0,2},{12,20,0,19,15,10,7,10,2,6,18,7,7,4},{17,14,2,2,10,16,15,3,9,17,9,3,17,10},{17,6,19,17,18,9,14,2,19,12,10,18,7,9},{5,6,5,1,19,8,15,2,2,4,4,1,2,17},{12,16,8,16,7,6,18,13,18,8,14,15,20,11},{2,10,19,3,15,18,20,10,6,7,0,8,3,7},{11,5,10,13,1,3,4,7,1,18,20,17,19,2},{0,3,20,6,19,18,3,12,2,11,3,1,19,0},{6,5,3,15,6,1,0,17,13,19,3,8,2,7},{2,20,9,11,13,5,1,16,14,1,19,3,12,6}}));
    }
    public int matrixSum(int[][] nums) {
        int score = 0;
        List<List<Integer>> numList = new ArrayList<>();
        for (int[] num : nums) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < nums[0].length; j++) {
                list.add(num[j]);
            }
            list.sort(Collections.reverseOrder());
            numList.add(list);
        }
        for(int i = 0; i<numList.getFirst().size(); i++){
            int max = numList.getFirst().get(i);
            for (List<Integer> integers : numList) {
                max = Math.max(integers.get(i), max);
            }
            score = score + max;
        }
        return score;
    }
}
