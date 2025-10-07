package solution.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaximizeSumOfAtMostKDistinctElements {
    public static void main(String[] args) {
        MaximizeSumOfAtMostKDistinctElements obj = new MaximizeSumOfAtMostKDistinctElements();
        System.out.println(Arrays.toString(obj.maxKDistinct(new int[]{84,93,100,77,90},3))); // [100, 93, 90]
        System.out.println(Arrays.toString(obj.maxKDistinct(new int[]{84,93,100,77,93},3))); // [100, 93, 84]
        System.out.println(Arrays.toString(obj.maxKDistinct(new int[]{1,1,1,2,2,2},6))); // [2, 1]
        System.out.println(Arrays.toString(obj.maxKDistinct(new int[]{5,3,3,3},2))); // [5,3]
        System.out.println(Arrays.toString(obj.maxKDistinct(new int[]{1,1,1,1},2))); // [1]
        System.out.println(Arrays.toString(obj.maxKDistinct(new int[]{4,4,4,4,4},1))); // [4]
        System.out.println(Arrays.toString(obj.maxKDistinct(new int[]{9,8,7,6},4))); // [9,8,7,6]
    }
    public int[] maxKDistinct(int[] nums, int k) {
        List<Integer> list = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> resultList = list.stream().distinct().limit(k).collect(Collectors.toList());
        int [] arr = new int[resultList.size()];
        for(int i = 0; i<resultList.size(); i++){
            arr[i] = resultList.get(i);
        }
        return arr;
    }
}
