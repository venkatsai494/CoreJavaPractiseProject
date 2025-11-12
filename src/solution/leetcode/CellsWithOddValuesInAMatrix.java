package solution.leetcode;

public class CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        CellsWithOddValuesInAMatrix obj = new CellsWithOddValuesInAMatrix();
        System.out.println(obj.oddCells(2,3,new int[][]{{0,1},{1,1}}));
        System.out.println(obj.oddCells(2,2,new int[][]{{1,1},{0,0}}));
    }
    public int oddCells(int m, int n, int[][] indices) {
        int result = 0;
        int[][] array = new int[m][n];
        for(int [] a: indices){
            for(int i = 0; i<n; i++){
                array[a[0]][i] = ++array[a[0]][i];
            }
            for(int i = 0; i<m; i++){
                array[i][a[1]] = ++array[i][a[1]];
            }
        }
        for(int [] i: array){
            for(int j : i){
                if(j%2==1) result++;
            }
        }
        return result;
    }
}
