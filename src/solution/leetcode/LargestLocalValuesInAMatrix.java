package solution.leetcode;

public class LargestLocalValuesInAMatrix {
    public static void main(String[] args) {
        int[][] grid = {
            {9,9,8,1},
            {5,6,2,6},
            {8,2,6,4},
            {6,2,2,2}
        };
        int[][] grid2 = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,2,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1}
        };
        LargestLocalValuesInAMatrix ll = new LargestLocalValuesInAMatrix();
        int[][] result = ll.largestLocal(grid);
        for(int [] i: result){
            for(int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int[][] result2 = ll.largestLocal(grid2);
        for(int [] i : result2){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public int[][] largestLocal(int[][] grid) {
        int l = grid.length;
        int[][] result = new int[l-2][l-2];
        for(int i = 1; i<l-1; i++){
            for(int j = 1; j<l-1; j++){
                result[i-1][j-1] = maxOfArr(grid, i, j);
            }
        }
        return result;
    }

    public int maxOfArr(int[][] arr, int a, int b){
        int max = 0;
        for(int i = a-1; i<=a+1; i++){
            for(int j = b-1; j<=b+1; j++){
                max = Math.max(max, arr[i][j]);
            }
        }
        return max;
    }
}
