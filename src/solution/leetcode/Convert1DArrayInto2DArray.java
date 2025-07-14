package solution.leetcode;

import java.util.Arrays;

public class Convert1DArrayInto2DArray {
    public static void main(String[] args) {
        Convert1DArrayInto2DArray converter = new Convert1DArrayInto2DArray();
        System.out.println(Arrays.deepToString(converter.construct2DArray(new int[]{1, 2, 3, 4}, 2, 2)));
        System.out.println(Arrays.deepToString(converter.construct2DArray(new int[]{1, 2, 3}, 1, 3)));
        System.out.println(Arrays.deepToString(converter.construct2DArray(new int[]{1, 2}, 1, 1)));
        System.out.println(Arrays.deepToString(converter.construct2DArray(new int[]{3}, 1, 2)));
    }
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length!=(m*n)) return new int[0][0];
        int[][] output = new int[m][n];
        if((m*n)>=original.length) {
            int k = 0;
            for(int i = 0; i<m; i++){
                for(int j = 0; j<n; j++){
                    output[i][j] = original[k];
                    k++;
                    if(k==original.length) break;
                }
            }
        }
        return output;
    }
}
