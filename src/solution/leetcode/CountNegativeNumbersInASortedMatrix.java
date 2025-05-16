package solution.leetcode;

public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        CountNegativeNumbersInASortedMatrix cn = new CountNegativeNumbersInASortedMatrix();
        System.out.println(cn.countNegatives(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}})); // 8
        System.out.println(cn.countNegatives(new int[][]{{3,2},{1,0}})); // 0
        System.out.println(cn.countNegatives(new int[][]{{-1}})); // 1
    }
    public int countNegatives(int[][] grid) {
        int output = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j]<0) output++;
            }
        }
        return output;
    }
}
