package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class EqualRowAndColumnPairs {
    public static void main(String[] args) {
        EqualRowAndColumnPairs obj = new EqualRowAndColumnPairs();
        int[][] grid = {
            {3,2,1},
            {1,7,6},
            {2,7,7}
        };
        System.out.println(obj.equalPairs(grid));
        int[][] grid1 = {
                {3,1,2,2},
                {1,4,4,5},
                {2,4,2,2},
                {2,4,2,2}
        };
        System.out.println(obj.equalPairs(grid1));
    }
    public int equalPairs(int[][] grid) {
        int count = 0;
        List<StringBuilder> listRow = new ArrayList<>();
        List<StringBuilder> listColumn = new ArrayList<>();
        for(int[] i: grid){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j<grid[0].length; j++){
                sb.append(i[j]).append(",");
            }
            listRow.add(sb);
        }
        for(int i = 0; i<grid.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j<grid[0].length; j++){
                sb.append(grid[j][i]).append(",");
            }
            listColumn.add(sb);
        }
        for(StringBuilder s: listRow){
            for(StringBuilder s1: listColumn){
                if(s1.toString().contentEquals(s.toString())) count++;
            }
        }
        return count;
    }
}
