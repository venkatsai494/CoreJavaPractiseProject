package solution.leetcode;

public class FindTheWidthOfColumnsOfAGrid {
    public static void main(String[] args) {
        FindTheWidthOfColumnsOfAGrid solution = new FindTheWidthOfColumnsOfAGrid();
        System.out.println(java.util.Arrays.toString(solution.findColumnWidth(new int[][]{{1},{22},{333}}))); // [3]
        System.out.println(java.util.Arrays.toString(solution.findColumnWidth(new int[][]{{-15,1,3},{15,7,12},{5,6,-2}}))); // [3,1,2]
    }
    public int[] findColumnWidth(int[][] grid) {
        int [] result = new int[grid[0].length];
        for(int i = 0; i<grid[0].length; i++){
            int max = 0;
            for (int[] ints : grid) {
                max = Math.max(max, String.valueOf(ints[i]).length());
            }
            result[i] = max;
        }
        return result;
    }
}
