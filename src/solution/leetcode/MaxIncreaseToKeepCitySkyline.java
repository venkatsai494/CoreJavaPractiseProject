package solution.leetcode;

public class MaxIncreaseToKeepCitySkyline {
    public static void main(String[] args) {
        MaxIncreaseToKeepCitySkyline solution = new MaxIncreaseToKeepCitySkyline();
        int[][] grid1 = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        System.out.println(solution.maxIncreaseKeepingSkyline(grid1)); // Output: 35
        int[][] grid2 = {{8}};
        System.out.println(solution.maxIncreaseKeepingSkyline(grid2)); // Output: 0
    }
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                sum += (Math.min(maxValueinRow(grid, i), maxValueinColumn(grid, j)) -grid[i][j]);
            }
        }
        return sum;
    }
    public int maxValueinRow(int[][] arr, int rowNum){
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            max = Math.max(max, arr[rowNum][i]);
        }
        return max;
    }
    public int maxValueinColumn(int[][] arr, int columnNum){
        int max = 0;
        for(int i = 0; i<arr[0].length; i++){
            max = Math.max(max, arr[i][columnNum]);
        }
        return max;
    }
}
