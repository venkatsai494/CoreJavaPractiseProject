package solution.leetcode;

import java.util.*;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        SortArrayByIncreasingFrequency sf = new SortArrayByIncreasingFrequency();
        System.out.println(Arrays.toString(sf.frequencySort(new int[]{1,1,2,2,2,3})));//[3,1,1,2,2,2]
        System.out.println(Arrays.toString(sf.frequencySort(new int[]{2,3,1,3,2})));//[1,3,3,2,2]
        System.out.println(Arrays.toString(sf.frequencySort(new int[]{-1,1,-6,4,5,-6,1,4,1}))); //[5,-1,4,4,-6,-6,1,1,1]
    }
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[nums.length];
        int [] temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(temp);
        for(int i : temp){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        Collections.reverse(list);
        list.sort(Comparator.comparingInt(map::get));
        for(int c: list) {
            int temp1 = map.get(c);
            while (temp1 > 0) {
                list1.add(c);
                temp1--;
            }
        }
        for(int i = 0; i<result.length; i++){
            result[i] = list1.get(i);
        }
        return result;
    }
}
