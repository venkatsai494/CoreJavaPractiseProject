package solution.leetcode;

import java.util.*;

public class TheKWeakestRowsInAMatrix {
    public static void main(String[] args) {
        TheKWeakestRowsInAMatrix solution = new TheKWeakestRowsInAMatrix();
        System.out.println(Arrays.toString(solution.kWeakestRows(new int[][]{{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}}, 3))); // [2,0,3]
        System.out.println(Arrays.toString(solution.kWeakestRows(new int[][]{{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}}, 2))); // [0,2]
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int [] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<mat.length; i++){
            map.put(i,countNumberOfSoldiers(mat[i]));
        }
        List<Integer> keyList = new ArrayList<>(map.keySet());
        keyList.sort(Comparator.comparing(map::get));
        for(int i = 0; i<k; i++){
            result[i] = keyList.get(i);
        }
        return result;
    }
    public int countNumberOfSoldiers(int[] a){
        int count = 0;
        for(int i: a){
            if(i==1) count++;
        }
        return count;
    }
}
