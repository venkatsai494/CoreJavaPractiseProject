package solution.leetcode;

public class ToeplitzMatrix {
    public static void main(String[] args) {
        ToeplitzMatrix solution = new ToeplitzMatrix();
        System.out.println(solution.isToeplitzMatrix(new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}})); // Output: true
        System.out.println(solution.isToeplitzMatrix(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}})); // Output: false
        System.out.println(solution.isToeplitzMatrix(new int[][]{{1,2},{2,2}})); // Output: false
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i = 0; i<matrix.length-1; i++){
            for (int j = 0; j<matrix[0].length-1; j++){
                if(matrix[i][j]!=matrix[i+1][j+1]) return false;
            }
        }
        return true;
    }
}
