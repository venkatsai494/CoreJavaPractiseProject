package solution.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformOfAnArray {
    public static void main(String[] args) {
        RankTransformOfAnArray solution = new RankTransformOfAnArray();
        System.out.println(Arrays.toString(solution.arrayRankTransform(new int[]{40,10,20,30}))); // Output: [4,1,2,3]
        System.out.println(Arrays.toString(solution.arrayRankTransform(new int[]{100,100,100}))); // Output: [1,1,1]
        System.out.println(Arrays.toString(solution.arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12}))); // Output: [5,3,4,2,8,6,7,1,3]
    }
    public int[] arrayRankTransform(int[] arr) {
        int[] result = new int[arr.length];
        int[] temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for(int i: temp){
            if(!map.containsKey(i)){
                map.put(i, rank);
                rank++;
            }
        }
        for(int i = 0; i<arr.length; i++){
            result[i] = map.get(arr[i]);
        }
        return result;
    }
}
