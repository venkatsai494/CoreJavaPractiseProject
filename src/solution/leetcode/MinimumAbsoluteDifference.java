package solution.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        MinimumAbsoluteDifference obj = new MinimumAbsoluteDifference();
        System.out.println(obj.minimumAbsDifference(new int[]{4,2,1,3})); // [[1,2],[2,3],[3,4]]
        System.out.println(obj.minimumAbsDifference(new int[]{1,3,6,10,15})); // [[1,3]]
        System.out.println(obj.minimumAbsDifference(new int[]{3,8,-10,23,19,-4,-14,27})); // [[-14,-10],[19,23],[23,27]]
    }
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int min = Math.abs(arr[0]-arr[1]);
        for(int i = 1; i<arr.length; i++){
            min = Math.min(min, Math.abs(arr[i]-arr[i-1]));
        }
        for(int i = 1; i<arr.length; i++){
            if(Math.abs(arr[i]-arr[i-1]) == min){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i-1]);
                list.add(arr[i]);
                result.add(list);
            }
        }
        return result;
    }
}
