package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        PascalsTriangle pt = new PascalsTriangle();
        System.out.println(pt.generate(6));
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<>();
        int currentRow = 1;
        while(currentRow<=numRows){
            List<Integer> list = new ArrayList<>();
            if(currentRow == 1){
                list.add(1);
                results.add(list);
            }
            else if(currentRow == 2){
                list.add(1);
                list.add(1);
                results.add(list);
            }
            else{
                list.add(1);
                for(int i = 1; i<currentRow-1; i++){
                    list.add(results.get(currentRow-2).get(i-1)+results.get(currentRow-2).get(i));
                }
                list.add(1);
                results.add(list);
            }
            currentRow++;
        }
        return results;
    }
}
