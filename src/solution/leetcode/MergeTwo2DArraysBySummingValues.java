package solution.leetcode;

import java.util.*;

public class MergeTwo2DArraysBySummingValues {
    public static void main(String[] args) {
        MergeTwo2DArraysBySummingValues solution = new MergeTwo2DArraysBySummingValues();
        System.out.println(Arrays.deepToString(solution.mergeArrays(new int[][]{{1,2},{2,3},{4,5}}, new int[][]{{1,4},{3,2},{4,1}})));
        System.out.println(Arrays.deepToString(solution.mergeArrays(new int[][]{{2,4},{3,6},{5,5}}, new int[][]{{1,3},{4,3}})));
    }
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] n: nums1){
            if(map.containsKey(n[0])){
                map.put(n[0], map.get(n[0])+n[1]);
            }
            else{
                map.put(n[0], n[1]);
            }
        }
        for(int[] n: nums2){
            if(map.containsKey(n[0])){
                map.put(n[0], map.get(n[0])+n[1]);
            }
            else{
                map.put(n[0], n[1]);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        int[][] result = new int[list.size()][2];
        for(int i = 0; i<list.size(); i++){
            result[i][0] = list.get(i);
            result[i][1] = map.get(result[i][0]);
        }
        return result;
    }
}
