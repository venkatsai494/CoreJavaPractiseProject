package solution.leetcode;

import java.util.Arrays;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public static void main(String[] args) {
        MinimumNumberOfOperationsToMoveAllBallsToEachBox mn = new MinimumNumberOfOperationsToMoveAllBallsToEachBox();
        System.out.println(Arrays.toString(mn.minOperations("110"))); // [1,1,3]
        System.out.println(Arrays.toString(mn.minOperations("001011"))); // [11,8,5,4,3,4]
        System.out.println(Arrays.toString(mn.minOperations("111"))); // [3,2,3]
    }
    public int[] minOperations(String boxes) {
        int [] result = new int[boxes.length()];
        for(int i = 0; i<boxes.length(); i++){
            int sum = 0;
            for(int j = 0; j <boxes.length(); j++){
                if(boxes.charAt(j) == '1')  sum += Math.abs(i-j);
            }
            result[i] = sum;
        }
        return result;
    }
}
