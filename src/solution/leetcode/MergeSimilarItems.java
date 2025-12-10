package solution.leetcode;

import java.util.*;

public class MergeSimilarItems {
    public static void main(String[] args) {
        MergeSimilarItems solution = new MergeSimilarItems();
        System.out.println(solution.mergeSimilarItems(new int[][]{{1,1},{4,5},{3,8}}, new int[][]{{3,1},{1,5}})); // [[1,6],[3,9],[4,5]]
        System.out.println(solution.mergeSimilarItems(new int[][]{{1,1},{3,2},{2,3}}, new int[][]{{2,1},{3,2},{1,3}})); // [[1,4],[2,4],[3,4]]
        System.out.println(solution.mergeSimilarItems(new int[][]{{1,3},{2,2}}, new int[][]{{7,1},{2,2},{1,4}})); // [[1,7],[2,4],[7,1]]
    }
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] n: items1){
            if(map.containsKey(n[0])){
                map.put(n[0], map.get(n[0])+n[1]);
            }
            else{
                map.put(n[0], n[1]);
            }
        }
        for(int[] n: items2){
            if(map.containsKey(n[0])){
                map.put(n[0], map.get(n[0])+n[1]);
            }
            else{
                map.put(n[0], n[1]);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for(int i : list){
            List<Integer> temp = new ArrayList<>();
            temp.add(i);
            temp.add(map.get(i));
            result.add(temp);
        }
        return result;
    }
}
