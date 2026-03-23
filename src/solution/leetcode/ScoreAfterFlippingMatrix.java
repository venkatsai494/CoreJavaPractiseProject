package solution.leetcode;

public class ScoreAfterFlippingMatrix {
    public static void main(String[] args) {
        ScoreAfterFlippingMatrix scoreAfterFlippingMatrix = new ScoreAfterFlippingMatrix();
        System.out.println(scoreAfterFlippingMatrix.matrixScore(new int[][]{{0,0,1,1},{1,0,1,0},{1,1,0,0}}));
        System.out.println(scoreAfterFlippingMatrix.matrixScore(new int[][]{{0}}));
        System.out.println(scoreAfterFlippingMatrix.matrixScore(new int[][]{{1}}));
    }
    public int matrixScore(int[][] grid) {
        int sum = 0;
        for(int i = 0; i<grid.length; i++){
            if(grid[i][0]==0){
                flipRowWise(grid, i);
            }
        }
        for(int j = 0; j<grid[0].length; j++){
            int numOfOnes = 0;
            int numOfZeroes = 0;
            for (int[] ints : grid) {
                if (ints[j] == 0) numOfZeroes++;
                else if (ints[j] == 1) numOfOnes++;
            }
            if(numOfZeroes>numOfOnes){
                flipColumnWise(grid, j);
            }
        }
        for (int[] ints : grid) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < grid[0].length; j++) {
                sb.append(ints[j]);
            }
            sum = sum + Integer.parseInt(sb.toString(), 2);
        }
        return sum;
    }
    public void flipRowWise(int [][] arr, int rowId){
        for(int i = 0; i<arr[0].length; i++){
            arr[rowId][i] = arr[rowId][i] ^ 1;
        }
    }
    public void flipColumnWise(int [][] arr, int columnId){
        for(int i = 0; i<arr.length; i++){
            arr[i][columnId] = arr[i][columnId] ^ 1;
        }
    }
}
