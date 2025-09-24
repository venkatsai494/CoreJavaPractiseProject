package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public static void main(String[] args) {
        LuckyNumbersInAMatrix lnm = new LuckyNumbersInAMatrix();
        System.out.println(lnm.luckyNumbers(new int[][]{{3,7,8},{9,11,13},{15,16,17}}));//[15]
        System.out.println(lnm.luckyNumbers(new int[][]{{1,10,4,2},{9,3,8,7},{15,16,17,12}}));//[12]
        System.out.println(lnm.luckyNumbers(new int[][]{{7,8},{1,2}}));//[7]
    }
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i<matrix.length; i++){
            int min = minInRow(matrix, i);
            for(int j = 0; j<matrix[0].length; j++){
                int max = maxInColumn(matrix, j);
                if(min == max) result.add(min);
            }
        }
        return result;
    }


    public int minInRow(int[][] arr, int row){
        int min = arr[row][0];
        for(int i = 0; i<arr[row].length; i++){
            min = Math.min(min, arr[row][i]);
        }
        return min;
    }
    public int maxInColumn(int[][] arr, int column){
        int max = arr[0][column];
        for(int[] i : arr){
            max = Math.max(max, i[column]);
        }
        return max;
    }
}
