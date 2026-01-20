package solution.leetcode;

public class CountServersThatCommunicate {
    public static void main(String[] args) {
        CountServersThatCommunicate solution = new CountServersThatCommunicate();
        System.out.println(solution.countServers(new int[][]{{1,0},{0,1}})); // Output: 0
        System.out.println(solution.countServers(new int[][]{{1,0},{1,1}})); // Output: 3
        System.out.println(solution.countServers(new int[][]{{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}})); // Output: 4
    }
    public int countServers(int[][] grid) {
        int[] sumInRow = new int [grid.length];
        int[] sumInColumn = new int [grid[0].length];
        int result = 0;
        for(int i = 0; i<grid.length; i++){
            int sum = 0;
            for(int j = 0; j<grid[0].length; j++){
                sum = sum + grid[i][j];
            }
            sumInRow[i] = sum;
        }
        for(int i = 0; i<grid[0].length; i++){
            int sum = 0;
            for (int[] ints : grid) {
                sum = sum + ints[i];
            }
            sumInColumn[i] = sum;
        }
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j] == 1 && (sumInRow[i]>1||sumInColumn[j]>1)) result++;
            }
        }

        return result;
    }
}
