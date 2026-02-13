package solution.leetcode;

import java.util.*;

public class FindXSumOfAllKLongSubarraysI {
    public static void main(String[] args) {
        FindXSumOfAllKLongSubarraysI solution = new FindXSumOfAllKLongSubarraysI();
        System.out.println(Arrays.toString(solution.findXSum(new int[]{1,1,2,2,3,4,2,3}, 6, 2)));
        System.out.println(Arrays.toString(solution.findXSum(new int[]{3,8,7,8,7,5}, 2, 2)));
        System.out.println(Arrays.toString(solution.findXSum(new int[]{9,2,2}, 3, 3)));
    }
    public int[] findXSum(int[] nums, int k, int x) {
        List<Integer> tempResult = new ArrayList<>();
        List<List<Integer>> tempList = new ArrayList<>();
        for(int i = 0; i<=nums.length-k; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = i; j<k+i; j++){
                list.add(nums[j]);
            }
            list.sort(Collections.reverseOrder());
            tempList.add(list);
        }
        for(List<Integer> l: tempList){
            tempResult.add(sumOfResultingArray(l, x));
        }
        int [] result = new int[tempResult.size()];
        for(int i = 0; i<result.length; i++){
            result[i] = tempResult.get(i);
        }
        return result;
    }
    public int sumOfResultingArray(List<Integer> list, int a){
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer i: list){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }
        List<Integer> keyList = new ArrayList<>(map.keySet());
        keyList.sort(Collections.reverseOrder());
        keyList.sort((x,y)->(map.get(y)-map.get(x)));
        for(int i = 0; i<a && i<keyList.size(); i++){
            sum = sum + (keyList.get(i)*map.get(keyList.get(i)));
        }
        return sum;
    }
}
