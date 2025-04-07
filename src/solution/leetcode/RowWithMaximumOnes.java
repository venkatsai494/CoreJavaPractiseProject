package solution.leetcode;

public class RowWithMaximumOnes {
    public static void main(String[] args) {
        RowWithMaximumOnes rowWithMaximumOnes = new RowWithMaximumOnes();
        int [][] mat = {
                {0,0,1},
                {1,0,0},
                {1,1,1}
        };
        int [] output = rowWithMaximumOnes.rowAndMaximumOnes(mat);
        System.out.println("Row: "+output[0]+", Count: "+output[1]);
    }
    public int[] rowAndMaximumOnes(int[][] mat) {
        int [] output = new int[2];
        int row = 0;
        int count = 0;
        for(int i = 0; i< mat.length; i++){
            int temp = 0;
            for(int j = 0; j<mat[i].length; j++){
                if(mat[i][j] == 1) temp++;
            }
            if(temp>count){
                count = temp;
                output[0] = i;
                output[1] = temp;
            }
        }
        return output;
    }
}
