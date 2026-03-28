package solution.leetcode;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        SearchA2DMatrix searchA2DMatrix = new SearchA2DMatrix();
        System.out.println(searchA2DMatrix.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 3));
        System.out.println(searchA2DMatrix.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 13));
        System.out.println(searchA2DMatrix.searchMatrix(new int[][]{{1}}, 1));
        System.out.println(searchA2DMatrix.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 30));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==1){
            for(int i = 0; i < matrix[0].length; i++){
                if(matrix[0][i]==target) return true;
            }
        }
        for(int i = 0; i < matrix.length-1; i++){
            if(matrix[i+1][0] > target){
                for(int j = 0; j<matrix[0].length; j++){
                    if(matrix[i][j] == target){
                        return true;
                    }
                    else if(matrix[i][j] > target){
                        return false;
                    }
                }
            }
            else if(matrix[i+1][0] == target){
                return true;
            }
        }
        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[matrix.length-1][j] == target){
                return true;
            }
        }
        return false;
    }
}
