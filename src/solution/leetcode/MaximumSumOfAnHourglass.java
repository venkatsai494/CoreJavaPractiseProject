package solution.leetcode;

public class MaximumSumOfAnHourglass {
    public static void main(String[] args) {
        MaximumSumOfAnHourglass solution = new MaximumSumOfAnHourglass();
        System.out.println(solution.maxSum(new int[][]{{6,2,1,3},{4,2,1,5},{9,2,8,7},{4,1,2,9}}));
        System.out.println(solution.maxSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
    public int maxSum(int[][] grid) {
        int max = 0;
        for(int i = 0; i< grid.length-2; i++){
            for(int j = 0; j<grid[0].length-2; j++){
                int sum = grid[i][j] + grid[i][j+1] + grid[i][j+2]
                            +grid[i+1][j+1]
                            +grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
