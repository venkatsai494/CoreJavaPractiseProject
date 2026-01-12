package solution.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static void main(String[] args) {
        PascalsTriangleII pt = new PascalsTriangleII();
        System.out.println(pt.getRow(3));
        System.out.println(pt.getRow(0));
        System.out.println(pt.getRow(1));
        System.out.println(pt.getRow(5));
    }
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> results = new ArrayList<>();
        int currentRow = 1;
        while(currentRow<=rowIndex+1){
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
        return results.getLast();
    }
}
