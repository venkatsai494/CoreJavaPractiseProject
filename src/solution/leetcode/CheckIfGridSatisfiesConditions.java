package solution.leetcode;

public class CheckIfGridSatisfiesConditions {
    public static void main(String[] args) {
        CheckIfGridSatisfiesConditions checkIfGridSatisfiesConditions = new CheckIfGridSatisfiesConditions();
        System.out.println(checkIfGridSatisfiesConditions.satisfiesConditions(new int[][]{{1, 0, 2}, {1, 0, 2}}));//true
        System.out.println(checkIfGridSatisfiesConditions.satisfiesConditions(new int[][]{{1, 1, 1}, {0, 0, 0}}));//false
        System.out.println(checkIfGridSatisfiesConditions.satisfiesConditions(new int[][]{{1}, {2}, {3}}));//false
    }
    public boolean satisfiesConditions(int[][] grid) {
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if((grid.length>1 && i<grid.length-1 && grid[i][j] != grid[i+1][j]) || (grid[0].length>1 && j<grid[0].length-1 && grid[i][j] == grid[i][j+1]))return false;
            }
        }
        return true;
    }
}
